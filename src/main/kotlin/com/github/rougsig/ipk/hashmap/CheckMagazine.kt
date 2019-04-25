package com.github.rougsig.ipk.hashmap

import java.io.InputStream
import java.io.PrintStream
import java.util.*
import kotlin.collections.HashMap

fun checkMagazine(input: InputStream, output: PrintStream) {
  val sc = Scanner(input)

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

  output.println(if (isValid) "Yes" else "No")
}
