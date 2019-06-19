package com.github.rougsig.core

import java.io.*
import java.util.*

class IOEnvironment(
  private val input: InputStream,
  private val output: OutputStream
) {
  @Deprecated("use sb with printResult. sb faster")
  val out by lazy(LazyThreadSafetyMode.NONE) { PrintStream(output) }
  @Deprecated("use rd with StringTokenizer. rd faster")
  val sc by lazy(LazyThreadSafetyMode.NONE) { Scanner(input) }

  val rd by lazy(LazyThreadSafetyMode.NONE) { BufferedReader(InputStreamReader(input)) }
  val sb by lazy(LazyThreadSafetyMode.NONE) { LinkedList<String>() }

  lateinit var tokens: StringTokenizer
  fun nextTokens() {
    tokens = StringTokenizer(rd.readLine())
  }

  fun addToResult(str: String) = sb.add(str)

  fun printResult() = output.write(sb.joinToString("\n").toByteArray())
}
