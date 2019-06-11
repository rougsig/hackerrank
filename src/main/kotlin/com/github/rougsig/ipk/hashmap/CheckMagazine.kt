package com.github.rougsig.ipk.hashmap

import com.github.rougsig.core.IOEnvironment

fun IOEnvironment.checkMagazine() {
  val magazine = HashMap<String, Int>()

  sc.nextLine()

  sc.nextLine()
    .split(" ")
    .forEach { word ->
      magazine[word] = (magazine[word] ?: 0) + 1
    }

  val isValid = sc.nextLine()
    .split(" ")
    .all { word ->
      magazine[word] = (magazine[word] ?: 0) - 1
      magazine[word] ?: 0 >= 0
    }

  out.println(if (isValid) "Yes" else "No")
}
