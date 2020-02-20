package com.github.rougsig.ipk.string

import com.github.rougsig.core.IOEnvironment

fun IOEnvironment.substrCount() {
  val l = nextToken().toInt()
  val s = nextToken().toCharArray()
  var counter = 0

  (0 until l).forEach { i ->
    (i until l).forEach { j ->
      if (i == j) {
        counter += 1
      } else {
        val sliced = s.sliceArray(i..j)
        when {
          sliced.size % 2 == 0 -> {
            val fc = sliced[0]
            if (sliced.all { it == fc }) {
              counter += 1
            }
          }
          sliced.size % 2 != 0 -> {
            val fc = sliced[0]
            sliced[sliced.size / 2] = fc
            if (sliced.all { it == fc }) {
              counter += 1
            }
          }
          else -> error("wtf")
        }
      }
    }
  }

  addToResult(counter.toString())
  printResult()
}
