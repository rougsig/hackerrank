package com.github.rougsig.ipk.array

import com.github.rougsig.core.IOEnvironment

fun IOEnvironment.minimumBribes() {
  fun solveQueue() {
    val length = nextInt()
    val peopleQueue = IntArray(length) { nextInt() }

    var swapCount = 0

    peopleQueue.forEachIndexed { index, peopleNumber ->

      if (peopleNumber - (index + 1) > 2) {
        println("Too chaotic")
        return
      }

      for (pos in Integer.max(0, peopleNumber - 2) until index) {
        if (peopleQueue[pos] > peopleNumber) {
          swapCount++
        }
      }
    }

    println(swapCount)
  }

  val queueCount = nextInt()
  (0 until queueCount).forEach { _ -> solveQueue() }

  flush()
}
