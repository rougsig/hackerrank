package com.github.rougsig.twodarray

import java.io.InputStream
import java.io.PrintStream
import java.util.*

fun arrayManipulation(input: InputStream, output: PrintStream) {
  val scan = Scanner(input)
  val n = scan.nextInt()
  val m = scan.nextInt()

  val arr = LongArray(n)
  for (i in 0 until m) {
    val lower = scan.nextInt()
    val upper = scan.nextInt()
    val sum = scan.nextLong()
    arr[lower - 1] += sum
    if (upper < n) arr[upper] -= sum
  }

  var max: Long = 0
  var temp: Long = 0
  for (i in 0 until n) {
    temp += arr[i]
    if (temp > max) max = temp
  }

  output.println(max)
}
