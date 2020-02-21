package com.github.rougsig.ipk.array

import com.github.rougsig.core.IOEnvironmentOld

fun IOEnvironmentOld.minimumBribes() {
  fun solveQueue() {
    val length = sc.nextInt()
    val peopleQueue = IntArray(length) { sc.nextInt() }

    var swapCount = 0

    peopleQueue.forEachIndexed { index, peopleNumber ->

      if (peopleNumber - (index + 1) > 2) {
        out.println("Too chaotic")
        return
      }

      for (pos in Integer.max(0, peopleNumber - 2) until index) {
        if (peopleQueue[pos] > peopleNumber) {
          swapCount++
        }
      }
    }

    out.println(swapCount)
  }

  val queueCount = sc.nextInt()
  (0 until queueCount).forEach { _ -> solveQueue() }
}
