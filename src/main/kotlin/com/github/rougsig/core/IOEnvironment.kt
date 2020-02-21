package com.github.rougsig.core

import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.io.OutputStream
import java.util.*

class IOEnvironment(
  private val input: InputStream,
  private val output: OutputStream
) {
  val rd = BufferedReader(InputStreamReader(input))
  val sb = LinkedList<String>()

  private var tokens: StringTokenizer? = null
  fun nextToken(): String {
    if (tokens == null) tokens = StringTokenizer(rd.readLine())
    return if (tokens!!.hasMoreTokens()) {
      tokens!!.nextToken()
    } else {
      tokens = StringTokenizer(rd.readLine())
      tokens!!.nextToken()
    }
  }

  fun addToResult(str: String) = sb.add(str)
  fun printResult() = output.write(sb.joinToString("\n").toByteArray())
}
