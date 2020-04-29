import org.gradle.kotlin.dsl.support.unzipTo
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import java.io.ByteArrayOutputStream
import java.io.FileOutputStream

plugins {
  kotlin("jvm") version "1.3.70"
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.70")

  testImplementation("org.testng:testng:6.10")
  testImplementation("org.assertj:assertj-core:3.6.2")
}

tasks.withType<KotlinCompile> {
  kotlinOptions {
    jvmTarget = "1.8"
  }
}

tasks.named<Test>("test") {
  isScanForTestClasses = false
  useTestNG()
  include("**/*")
}

fun executeInShell(cmd: String): ByteArray {
  val stdout = ByteArrayOutputStream()
  exec {
    commandLine("bash", "-c", cmd)
    standardOutput = stdout
  }
  logger.debug("shell output: ${stdout.toString().trim()}")
  return stdout.toByteArray()
}

tasks.register("download") {
  doLast {
    fun downloadTestCases(id: String, category: String): File {
      val zip = executeInShell(
        """
      | curl https://www.hackerrank.com/rest/contests/master/challenges/$id/download_testcases
      """.trimMargin()
      )
      File("$rootDir/xxx").mkdirs()
      val tmp = File("$rootDir/xxx/$id.zip")
      tmp.createNewFile()
      FileOutputStream(tmp).use { out ->
        out.write(zip)
      }

      val challengePathId = id.replace("-", "").capitalize()
      val outputDir = File("$rootDir/src/test/resources/com/github/rougsig/$category/$challengePathId")
      unzipTo(outputDir, tmp)
      return outputDir
    }

    fun generateSolutionSources(id: String, category: String) {
      val challengePathId = id.replace("-", "")
      val outputDir = File("$rootDir/src/main/kotlin/com/github/rougsig/$category")
      outputDir.mkdirs()
      val outputFile = File(outputDir, "${challengePathId.capitalize()}.kt")
      outputFile.createNewFile()
      outputFile.writeText(
        """
      |package com.github.rougsig.$category
      |
      |import com.github.rougsig.core.IOEnvironment
      |
      |fun IOEnvironment.$challengePathId() {
      |}
      |
      """.trimMargin()
      )
    }

    fun generateTestCaseSources(id: String, category: String, testCaseIds: List<String>) {
      val challengePathId = id.replace("-", "")
      val outputDir = File("$rootDir/src/test/kotlin/com/github/rougsig/$category")
      outputDir.mkdirs()
      val outputFile = File(outputDir, "Test${challengePathId.capitalize()}.kt")
      outputFile.createNewFile()
      outputFile.writeText(
        """
      |package com.github.rougsig.$category
      |
      |import com.github.rougsig.core.IOEnvironment
      |import com.github.rougsig.core.IOEnvironmentTestFixture
      |import org.testng.annotations.DataProvider
      |
      |class Test${challengePathId.capitalize()} : IOEnvironmentTestFixture(IOEnvironment::$challengePathId) {
      |  @DataProvider
      |  fun io() = arrayOf(${testCaseIds.joinToString(", ") { "\"$it\"" }})
      |}
      |
      """.trimMargin()
      )
    }

    val id = project.properties["id"] as? String ?: error("id is required param")
    val category = project.properties["category"] as? String ?: error("category is required param")
    val testCasesDir = downloadTestCases(id, category)
    val testCaseIds = File(testCasesDir, "input").list()!!
      .map { it.removePrefix("input").removeSuffix(".txt") }
    generateSolutionSources(id, category)
    generateTestCaseSources(id, category, testCaseIds)
  }
}
