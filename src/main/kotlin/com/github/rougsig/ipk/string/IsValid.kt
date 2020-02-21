package com.github.rougsig.ipk.string

import com.github.rougsig.core.IOEnvironmentOld

fun IOEnvironmentOld.isValid() {
  val s = nextToken()

  val charsCount = IntArray(26)

  s.forEach { charsCount[it - 'a'] += 1 }
  val arr = charsCount.filterTo(mutableListOf()) { it != 0 }

  var isValid = true
  var isHackUsed = false

  for (i in (0 until arr.lastIndex)) {
    val a = arr[i]
    val b = arr[i + 1]

    if (a != b || a == 0) {
      if (!isHackUsed) {
        isHackUsed = true
        val isValidWithHack = a == b - 1 || b - 1 == 0
        if (isValidWithHack) {
          arr[i + 1] = b - 1
        } else {
          isValid = false
          break
        }
      } else {
        isValid = false
        break
      }
    }
  }

  addToResult(if (isValid) "YES" else "NO")
  printResult()
}
