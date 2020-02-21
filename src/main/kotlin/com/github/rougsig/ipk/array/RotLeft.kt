package com.github.rougsig.ipk.array

import com.github.rougsig.core.IOEnvironmentOld

fun IOEnvironmentOld.rotLeft() {
  val length = sc.nextInt()
  val leftBy = sc.nextInt()

  val arr = IntArray(length) { sc.nextInt() }

  (0 until length).forEach { i ->
    val index = i + leftBy
    if (index >= length) {
      out.print("${arr[index - length]} ")
    } else {
      out.print("${arr[index]} ")
    }
  }
}
