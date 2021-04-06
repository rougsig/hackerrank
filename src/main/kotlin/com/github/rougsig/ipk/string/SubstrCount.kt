package com.github.rougsig.ipk.string

import com.github.rougsig.core.IOEnvironment
import kotlin.math.min

fun IOEnvironment.substrCount() {
  data class Pair(val c: Char, var cc: Int)

  val l = nextInt()
  val s = nextString()
  val a = arrayOfNulls<Pair>(l + 2)
  var counter = 0

  var pc: Char? = null
  var i = -1
  s.forEach { c ->
    if (pc != c) {
      i += 1
      a[i] = Pair(c, 1)
    } else {
      a[i]!!.cc = a[i]!!.cc + 1
    }
    pc = c
  }

  val memo = HashMap<Int, Int>()
  fun f(num: Int): Int {
    val m = memo[num]
    return if (m == null) {
      val r = (0..num).fold(0) { acc, i -> acc + i }
      memo[num] = r
      r
    } else {
      m
    }
  }

  i = 0
  while (true) {
    val p = a[i]!!
    counter += f(p.cc)
    val np = a[i + 1]
    val nnp = a[i + 2]
    if (np != null && nnp != null && p.c == nnp.c && np.cc == 1) counter += min(p.cc, nnp.cc)
    if (np == null) break
    i += 1
  }

  println(counter)
  flush()
}
