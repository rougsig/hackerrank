package com.github.rougsig.ipk.array

import com.github.rougsig.core.IOEnvironment

fun IOEnvironment.minimumSwaps() {
  val arr = IntArray(sc.nextInt()) { sc.nextInt() }

  var swapCount = 0

  fun swap(index: Int) {
    val indexForSwap = arr.indexOf(index + 1)

    val a = arr[index]
    val b = arr[indexForSwap]

    arr[indexForSwap] = a
    arr[index] = b
  }

  while (true) {
    var isSwapped = false

    (0 until arr.size).forEach { index ->
      if (index + 1 != arr[index]) {
        isSwapped = true
        swapCount++

        swap(index)
      }
    }

    if (!isSwapped) break
  }

  out.println(swapCount)
}
