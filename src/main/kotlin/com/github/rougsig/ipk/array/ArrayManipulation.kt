package com.github.rougsig.ipk.array

import com.github.rougsig.core.IOEnvironment

fun IOEnvironment.arrayManipulation() {
  val n = sc.nextInt()
  val m = sc.nextInt()

  val arr = LongArray(n)
  for (i in 0 until m) {
    val lower = sc.nextInt()
    val upper = sc.nextInt()
    val sum = sc.nextLong()
    arr[lower - 1] += sum
    if (upper < n) arr[upper] -= sum
  }

  var max: Long = 0
  var temp: Long = 0
  for (i in 0 until n) {
    temp += arr[i]
    if (temp > max) max = temp
  }

  out.println(max)
}
