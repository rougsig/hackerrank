package com.github.rougsig.ipk.hashmap

import com.github.rougsig.core.IOEnvironmentOld

fun IOEnvironmentOld.twoStrings() {
  val count = sc.nextLine().toInt()

  fun solveString() {
    val line1 = sc.nextLine().toSet()
    val line2 = sc.nextLine().toSet()

    val isContains = line1.any { line2.contains(it) }

    out.println(if (isContains) "YES" else "NO")
  }

  (0 until count).forEach { _ -> solveString() }
}
