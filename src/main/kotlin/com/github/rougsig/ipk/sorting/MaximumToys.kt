package com.github.rougsig.ipk.sorting

import com.github.rougsig.core.IOEnvironmentOld
import java.util.*

fun IOEnvironmentOld.maximumToys() {
  var tokens = StringTokenizer(rd.readLine())

  val n = tokens.nextToken().toInt()
  var amount = tokens.nextToken().toInt()

  tokens = StringTokenizer(rd.readLine())

  val arr = IntArray(n) { tokens.nextToken().toInt() }
  arr.sort()

  var counter = 0
  for (i in 0..arr.lastIndex) {
    if (amount >= arr[i]) {
      amount -= arr[i]
      counter += 1
    } else {
      break
    }
  }

  sb.add("$counter")
  printResult()
}
