package com.github.rougsig.ipk.string


import com.github.rougsig.core.IOEnvironment
import kotlin.math.abs

fun IOEnvironment.makeAnagram() {
  val s1 = nextToken()
  val s2 = nextToken()

  val arr = IntArray(26)

  s1.forEach { arr[it - 'a'] += 1 }
  s2.forEach { arr[it - 'a'] -= 1 }

  addToResult(arr.sumBy { abs(it) }.toString())
  printResult()
}
