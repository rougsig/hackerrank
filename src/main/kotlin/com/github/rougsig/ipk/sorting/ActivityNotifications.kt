package com.github.rougsig.ipk.sorting

import com.github.rougsig.core.IOEnvironment
import java.util.*

fun IOEnvironment.activityNotifications() {
  val n = nextToken().toInt()
  val d = nextToken().toInt()
  val pastTransactions = IntArray(201)

  val q = LinkedList<Int>()

  repeat(d) {
    val t = nextToken().toInt()
    pastTransactions[t] += 1
    q.add(t)
  }

  var notificationCounter = 0
  repeat(n - d) {
    val t = nextToken().toInt()
    if (t >= 2 * calculateMedian(pastTransactions, d)) notificationCounter += 1
    q.add(t)
    val l = q.poll()
    pastTransactions[t] += 1
    pastTransactions[l] -= 1
  }
  addToResult("$notificationCounter")
  printResult()
}

fun calculateMedian(array: IntArray, d: Int): Float {
  fun leftSearch(): Int {
    var c = d / 2
    var i = 0
    while (c >= 0) {
      c -= array[i]
      i += 1
    }
    if (c < 0) i -= 1
    return i
  }

  fun rightSearch(): Int {
    var c = d / 2
    var i = array.lastIndex
    while (c >= 0) {
      c -= array[i]
      i -= 1
    }
    if (c < 0) i += 1
    return i
  }

  return if (d % 2 == 0) {
    (leftSearch() + rightSearch()) / 2f
  } else {
    leftSearch().toFloat()
  }
}
