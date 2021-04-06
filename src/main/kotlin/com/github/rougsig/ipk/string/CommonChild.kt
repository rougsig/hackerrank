package com.github.rougsig.ipk.string

import com.github.rougsig.core.IOEnvironment
import kotlin.math.max

fun IOEnvironment.commonChild() {
  val s1 = nextString()
  val s2 = nextString()

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

  println(a1.last())
  flush()
}
