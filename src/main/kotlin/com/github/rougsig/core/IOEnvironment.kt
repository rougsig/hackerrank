package com.github.rougsig.core

import java.io.*
import java.util.*

class IOEnvironment(
  private val input: InputStream,
  private val output: OutputStream
) {
  val out by lazy(LazyThreadSafetyMode.NONE) { PrintStream(output) }
  val rd by lazy(LazyThreadSafetyMode.NONE) { BufferedReader(InputStreamReader(input)) }
  val sc by lazy(LazyThreadSafetyMode.NONE) { Scanner(input) }
  val sb by lazy(LazyThreadSafetyMode.NONE) { LinkedList<String>() }

  fun printResult() = output.write(sb.joinToString("\n").toByteArray())
}
