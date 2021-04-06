package com.github.rougsig.ipk.sorting

import com.github.rougsig.core.IOEnvironment
import java.util.*

fun IOEnvironment.countSwaps() {
  var swapCounter = 0

  val n = nextInt()
  val tokens = StringTokenizer(nextLine())
  val arr = IntArray(n) { tokens.nextToken().toInt() }

  (0..arr.lastIndex).forEach { i ->
    (0 until arr.lastIndex).forEach { j ->
      if (arr[j] > arr[j + 1]) {
        swapCounter += 1
        val a = arr[j]
        val b = arr[j + 1]
        arr[j + 1] = a
        arr[j] = b
      }
    }
  }

  println("Array is sorted in $swapCounter swaps.")
  println("First Element: ${arr.first()}")
  println("Last Element: ${arr.last()}")

  flush()
}
