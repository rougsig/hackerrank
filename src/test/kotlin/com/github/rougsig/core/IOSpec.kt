package com.github.rougsig.core

import io.kotest.core.datatest.forAll
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.file.shouldBeADirectory
import io.kotest.matchers.file.shouldBeAFile
import io.kotest.matchers.file.shouldExist
import io.kotest.matchers.shouldBe
import kotlinx.coroutines.runBlocking
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.PrintStream
import java.nio.file.Paths

abstract class IOSpec(
  private val resourcesPath: String,
  private val testFun: IOEnvironment.() -> Unit
) : FunSpec({
  val projectRoot = File(".").absoluteFile.parent
  val resourcesDir = Paths.get(projectRoot, "src/test/resources", resourcesPath).toFile()
  context("File IO tests") {
    val inputDir = File("${resourcesDir.absoluteFile}/input")
    inputDir.shouldExist()
    inputDir.shouldBeADirectory()

    val outputDir = File("${resourcesDir.absoluteFile}/output")
    outputDir.shouldExist()

    val testNames = inputDir.listFiles()
      .map { it.nameWithoutExtension.removePrefix("input") }

    forAll(testNames) { testName: String ->
      val input = File("${inputDir.absoluteFile}/input${testName}.txt")
      input.shouldExist()
      input.shouldBeAFile()

      val output = File("${outputDir.absoluteFile}/output${testName}.txt")
      output.shouldExist()
      output.shouldBeAFile()

      val baos = ByteArrayOutputStream()
      runBlocking {
        // Set the same as hackerrank timeout limit
        // https://www.hackerrank.com/environment/languages
        withTimeoutOrInterrupt(4000L) {
          IOEnvironment(ByteArrayInputStream(input.readBytes()), PrintStream(baos)).testFun()
        }
      }

      val actual = baos.toString().trim().trimIndent()
      val expected = output.readText().trim().trimIndent()

      actual.shouldBe(expected)
    }
  }
})
