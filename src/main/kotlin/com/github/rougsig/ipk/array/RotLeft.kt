package com.github.rougsig.ipk.array

import com.github.rougsig.core.IOEnvironment

fun IOEnvironment.rotLeft() {
  val length = nextInt()
  val leftBy = nextInt()

  val arr = IntArray(length) { nextInt() }

  (0 until length).forEach { i ->
    val index = i + leftBy
    if (index >= length) {
      print("${arr[index - length]} ")
    } else {
      print("${arr[index]} ")
    }
  }

  flush()
}
