package com.github.rougsig.ipk.hashmap

import com.github.rougsig.core.IOEnvironment

fun IOEnvironment.countTriplets() {
  val n = sc.nextInt()
  val r = sc.nextInt()
  val arr = IntArray(n) { sc.nextInt() }

  val m1 = HashMap<Int, Long>()
  val m2 = HashMap<Int, Long>()

  var triplets = 0L
  arr.reversedArray().forEach { i ->
    val k = i * r
    if (k in m2) triplets += m2.getValue(k)
    if (k in m1) m2.compute(i) { _, v -> (v ?: 0) + m1.getValue(k) }
    m1.compute(i) { _, v -> (v ?: 0) + 1 }
  }
  out.println(triplets)
}
