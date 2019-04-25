package com.github.rougsig.ipk.array

import java.io.InputStream
import java.io.PrintStream
import java.util.*

fun minimumBribes(input: InputStream, output: PrintStream) {
  val sc = Scanner(input)


  fun solveQueue() {
    val length = sc.nextInt()
    val peopleQueue = IntArray(length) { sc.nextInt() }

    var swapCount = 0

    peopleQueue.forEachIndexed { index, peopleNumber ->

      if (peopleNumber - (index + 1) > 2) {
        output.println("Too chaotic")
        return
      }

      for (pos in Integer.max(0, peopleNumber - 2) until index) {
        if (peopleQueue[pos] > peopleNumber) {
          swapCount++
        }
      }
    }

    output.println(swapCount)
  }

  val queueCount = sc.nextInt()
  (0 until queueCount).forEach { _ -> solveQueue() }
}
