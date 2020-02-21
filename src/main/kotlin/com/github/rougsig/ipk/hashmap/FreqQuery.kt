package com.github.rougsig.ipk.hashmap

import com.github.rougsig.core.IOEnvironmentOld
import java.util.*
import kotlin.collections.HashMap
import kotlin.collections.HashSet
import kotlin.math.max

fun IOEnvironmentOld.freqQuery() {
  val m1 = HashMap<Int, Int>()
  val m2 = HashMap<Int, HashSet<Int>>()

  var isFirstLine = false
  rd.forEachLine { line ->
    if (!isFirstLine) isFirstLine = true
    else {
      val tokens = StringTokenizer(line)
      val operation = tokens.nextToken().toInt()
      val v = tokens.nextToken().toInt()
      when (operation) {
        1 -> {
          val ov = m1[v]
          val nv = (ov ?: 0) + 1
          m1[v] = nv
          if (ov != null) {
            if (m2[ov] == null) m2[ov] = HashSet()
            m2[ov]!!.remove(v)
          }
          if (m2[nv] == null) m2[nv] = HashSet()
          m2[nv]!!.add(v)
        }
        2 -> {
          val ov = m1[v]
          val nv = max((ov ?: 0) - 1, 0)
          m1[v] = nv
          if (ov != null) {
            if (m2[ov] == null) m2[ov] = HashSet()
            m2[ov]!!.remove(v)
          }
          if (m2[nv] == null) m2[nv] = HashSet()
          m2[nv]!!.add(v)
        }
        3 -> {
          if (!m2[v].isNullOrEmpty()) {
            sb.add("1")
          } else {
            sb.add("0")
          }
        }
      }
    }
  }

  printResult()
}
