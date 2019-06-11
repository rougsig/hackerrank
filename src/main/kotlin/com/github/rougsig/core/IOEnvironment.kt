package com.github.rougsig.core

import java.io.InputStream
import java.io.OutputStream
import java.io.PrintStream
import java.util.*

class IOEnvironment(
  input: InputStream,
  output: OutputStream
) {
  val out = PrintStream(output)
  val sc = Scanner(input)
}
