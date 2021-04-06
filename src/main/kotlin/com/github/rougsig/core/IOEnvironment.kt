package com.github.rougsig.core

import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.io.OutputStream
import java.util.*

class IOEnvironment(
  input: InputStream,
  private val output: OutputStream
) {
  private val rd = BufferedReader(InputStreamReader(input))
  private val sb = LinkedList<String>()

  private var tokens: StringTokenizer? = null

  fun forEachLine(action: (String) -> Unit) = rd.forEachLine(action)
  fun nextLine() = rd.readLine()
  fun nextString(): String {
    if (tokens == null) tokens = StringTokenizer(rd.readLine())
    return if (tokens!!.hasMoreTokens()) {
      tokens!!.nextToken()
    } else {
      tokens = StringTokenizer(rd.readLine())
      tokens!!.nextToken()
    }
  }

  fun nextInt() = nextString().toInt()
  fun nextLong() = nextString().toLong()

  fun println(str: Any?) = sb.add("$str\n")
  fun print(str: Any?) = sb.add(str.toString())
  fun flush() = output.write(sb.joinToString("").toByteArray())
}
