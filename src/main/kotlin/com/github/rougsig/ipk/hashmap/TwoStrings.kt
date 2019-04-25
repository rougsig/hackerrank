package com.github.rougsig.ipk.hashmap

import java.io.InputStream
import java.io.PrintStream
import java.util.*

fun twoStrings(input: InputStream, output: PrintStream) {
  val sc = Scanner(input)

  val count = sc.nextLine().toInt()

  fun solveString() {
    val line1 = sc.nextLine().toSet()
    val line2 = sc.nextLine().toSet()

    val isContains = line1.any { line2.contains(it) }

    output.println(if (isContains) "YES" else "NO")
  }

  (0 until count).forEach { _ -> solveString() }
}
