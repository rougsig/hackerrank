package com.github.rougsig.ipk.string

import com.github.rougsig.core.IOEnvironmentOld

fun IOEnvironmentOld.alternatingCharacters() {
  repeat(nextToken().toInt()) {
    val str = nextToken().toMutableList()
    val iterator = str.iterator()
    var removeCount = 0

    var previousChar = iterator.next()
    while (iterator.hasNext()) {
      val currentChar = iterator.next()
      if (currentChar == previousChar) {
        removeCount += 1
      } else {
        previousChar = currentChar
      }
    }

    addToResult("$removeCount")
  }

  printResult()
}
