package com.github.rougsig.ipk.string

import com.github.rougsig.core.IOEnvironment

fun IOEnvironment.alternatingCharacters() {
  repeat(nextInt()) {
    val str = nextString().toMutableList()
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

    println(removeCount)
  }

  flush()
}
