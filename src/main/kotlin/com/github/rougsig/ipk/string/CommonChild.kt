package com.github.rougsig.ipk.string

import com.github.rougsig.core.IOEnvironment

fun IOEnvironment.commonChild() {
  val s1 = nextToken()
  val s2 = nextToken()

  val a = Array(s1.length + 1) { Array(s2.length + 1) { 0 } }
  (0..s1.lastIndex).forEach { i ->
    (0..s2.lastIndex).forEach { j ->
      if (s1[i] == s2[j]) {
        a[i + 1][j + 1] = a[i][j] + 1
      } else {
        a[i + 1][j + 1] = if (a[i + 1][j] > a[i][j + 1]) a[i + 1][j] else a[i][j + 1]
      }
    }
  }

  addToResult(a.last().last().toString())
  printResult()
}

// HARRY
// SALLY
