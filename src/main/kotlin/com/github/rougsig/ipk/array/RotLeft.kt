package com.github.rougsig.ipk.array

import java.io.InputStream
import java.io.PrintStream
import java.util.*

fun rotLeft(input: InputStream, output: PrintStream) {
  val sc = Scanner(input)

  val length = sc.nextInt()
  val leftBy = sc.nextInt()

  val arr = IntArray(length) { sc.nextInt() }

  (0 until length).forEach { i ->
    val index = i + leftBy
    if (index >= length) {
      output.print("${arr[index - length]} ")
    } else {
      output.print("${arr[index]} ")
    }
  }
}
