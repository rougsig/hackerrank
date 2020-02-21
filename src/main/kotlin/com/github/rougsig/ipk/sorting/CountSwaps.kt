package com.github.rougsig.ipk.sorting

import com.github.rougsig.core.IOEnvironmentOld
import java.util.*

fun IOEnvironmentOld.countSwaps() {
  var swapCounter = 0

  val n = rd.readLine().toInt()
  val tokens = StringTokenizer(rd.readLine())
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

  sb.add("Array is sorted in $swapCounter swaps.")
  sb.add("First Element: ${arr.first()}")
  sb.add("Last Element: ${arr.last()}")

  printResult()
}
