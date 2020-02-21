package com.github.rougsig.core

import org.assertj.core.api.Assertions
import org.testng.annotations.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.PrintStream
import java.nio.file.Paths

abstract class IOEnvironmentOldTestFixture(private val testFun: IOEnvironmentOld.() -> Unit) : Assertions() {
  open val packageName: String =
    javaClass.canonicalName
      .split(".")
      .dropLast(1)
      .plus(javaClass.simpleName.removePrefix("Test"))
      .joinToString(".")

  @Test(dataProvider = "io")
  open fun doTest(fileName: String) {
    val (input, output) = readIOFiles(fileName)
    val baos = ByteArrayOutputStream()

    IOEnvironmentOld(ByteArrayInputStream(input.toByteArray()), PrintStream(baos))
      .testFun()

    assertThat(baos.toString().trim().trimIndent())
      .isEqualTo(output.trim().trimIndent())
  }

  private fun readIOFiles(fileName: String): Array<String> {
    return arrayOf(
      readFile("input/input$fileName.txt"),
      readFile("output/output$fileName.txt")
    )
  }

  private fun readFile(pathname: String): String {
    val packageName = packageName.replace(".", "/")

    val projectRoot = File(".").absoluteFile.parent
    val testResources = Paths.get(projectRoot, "src/test/resources", packageName).toFile()

    return File("${testResources.absoluteFile}/$pathname").readText()
  }
}
