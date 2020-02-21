package com.github.rougsig.ipk.string

import com.github.rougsig.core.IOEnvironmentOld
import kotlin.math.max

fun IOEnvironmentOld.commonChild() {
  val s1 = nextToken()
  val s2 = nextToken()

  var a1 = Array(s1.length + 1) { 0 }
  var a2 = Array(s2.length + 1) { 0 }

  for (i in 1 until (s1.length + 1)) {
    for (j in 1 until (s2.length + 1)) {
      if (s1[i - 1] == s2[j - 1]) {
        a2[j] = a1[j - 1] + 1
      } else {
        a2[j] = max(a2[j - 1], a1[j])
      }
    }
    val t = a1
    a1 = a2
    a2 = t
  }

  addToResult(a1.last().toString())
  printResult()
}
