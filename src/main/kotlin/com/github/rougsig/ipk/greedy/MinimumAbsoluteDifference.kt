package com.github.rougsig.ipk.greedy

import com.github.rougsig.core.IOEnvironment
import kotlin.math.abs
import kotlin.math.min

fun IOEnvironment.minimumAbsoluteDifference() {
  val l = nextToken().toInt()
  val a = Array(l) { nextToken().toInt() }.also { it.sort() }

  var min = Int.MAX_VALUE
  (0 until a.lastIndex).forEach {
    min = min(min, abs(a[it] - a[it + 1]))
  }

  addToResult(min.toString())
  printResult()
}
