package com.github.rougsig.ipk.hashmap

import com.github.rougsig.core.IOEnvironment

fun IOEnvironment.sherlockAndAnagrams() {
  val n = sc.nextLine().toInt()

  fun solve() {
    val str = sc.nextLine()

    val toCheck = mutableListOf<IntArray>()
    (0..str.lastIndex).forEach { i ->
      (i..str.lastIndex).forEach { j ->
        val toAdd = str.slice(i..j)
        if (toAdd != str) {
          val sliced = str.slice(i..j)
          val arr = IntArray(26)
          sliced.forEach { arr[it.toInt() - 'a'.toInt()] += 1 }
          toCheck.add(arr)
        }
      }
    }

    var count = 0
    (0..toCheck.lastIndex).forEach { i ->
      (i..toCheck.lastIndex).forEach { j ->
        if (toCheck[i].contentEquals(toCheck[j]) && i != j) count += 1
      }
    }
    out.println(count)
  }

  (0 until n).forEach { _ -> solve() }
}
