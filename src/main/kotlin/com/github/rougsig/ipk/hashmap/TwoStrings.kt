package com.github.rougsig.ipk.hashmap

import com.github.rougsig.core.IOEnvironment

fun IOEnvironment.twoStrings() {
  val count = nextInt()

  fun solveString() {
    val line1 = nextLine().toSet()
    val line2 = nextLine().toSet()

    val isContains = line1.any { line2.contains(it) }

    println(if (isContains) "YES" else "NO")
  }

  (0 until count).forEach { _ -> solveString() }

  flush()
}
