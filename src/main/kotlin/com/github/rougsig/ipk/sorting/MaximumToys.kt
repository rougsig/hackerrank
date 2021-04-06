package com.github.rougsig.ipk.sorting

import com.github.rougsig.core.IOEnvironment

fun IOEnvironment.maximumToys() {
  val n = nextInt()
  var amount = nextInt()

  val arr = IntArray(n) { nextInt() }
  arr.sort()

  var counter = 0
  for (i in 0..arr.lastIndex) {
    if (amount >= arr[i]) {
      amount -= arr[i]
      counter += 1
    } else {
      break
    }
  }

  println("$counter")
  flush()
}
