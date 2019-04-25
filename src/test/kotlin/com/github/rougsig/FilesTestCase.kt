package com.github.rougsig

import junit.framework.TestCase
import org.assertj.core.util.Files
import java.io.File
import java.io.InputStream
import java.io.PrintStream
import java.nio.file.Paths

abstract class FilesTestCase(
  private val packageName: String
) : TestCase() {
  fun doTest(
    testFile: String,
    block: (InputStream, PrintStream) -> Unit
  ) {
    val packageName = packageName.replace(".", "/")

    val projectRoot = File(".").absoluteFile.parent
    val testResources = Paths.get(projectRoot, "src/test/resources", packageName).toFile()

    val inputFile = File("${testResources.absoluteFile}/input/input$testFile.txt")
    val outputFile = File("${testResources.absoluteFile}/output/output$testFile.txt")

    val tempFile = Files.newTemporaryFile()
    val printStream = PrintStream(tempFile)
    block(inputFile.inputStream(), printStream)

    assertSameLines(
      outputFile.readText(),
      tempFile.readText()
    )
  }

  private fun assertSameLines(expected: String, actual: String) {
    fun String.convertLineSeparators() = replace("\r\n", "\n")
    assertEquals(
      expected.trim().convertLineSeparators(),
      actual.trim().convertLineSeparators()
    )
  }
}
