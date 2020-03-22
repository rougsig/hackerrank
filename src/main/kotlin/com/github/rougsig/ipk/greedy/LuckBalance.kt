package com.github.rougsig.ipk.greedy

import com.github.rougsig.core.IOEnvironment

fun IOEnvironment.luckBalance() {
  val n = nextToken().toInt()
  val k = nextToken().toInt()
  val contests = (0 until n)
    .map { nextToken().toInt() to (nextToken().toInt() == 1) }
  val minLosses = contests
    .filter { (_, it) -> it }
    .sortedByDescending { (it, _) -> it }
    .drop(k)
    .sumBy { (it, _) -> it }
  val totalValue = contests.sumBy { (it, _) -> it }
  addToResult((totalValue - minLosses * 2).toString())
  printResult()
}
