package com.github.rougsig.ipk.greedy

import com.github.rougsig.core.IOEnvironment

fun IOEnvironment.luckBalance() {
  val n = nextInt()
  val k = nextInt()
  val contests = (0 until n)
    .map { nextInt() to (nextInt() == 1) }
  val minLosses = contests
    .filter { (_, it) -> it }
    .sortedByDescending { (it, _) -> it }
    .drop(k)
    .sumBy { (it, _) -> it }
  val totalValue = contests.sumBy { (it, _) -> it }

  println(totalValue - minLosses * 2)
  flush()
}
