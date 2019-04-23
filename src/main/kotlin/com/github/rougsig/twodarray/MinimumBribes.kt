package com.github.rougsig.twodarray

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

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
