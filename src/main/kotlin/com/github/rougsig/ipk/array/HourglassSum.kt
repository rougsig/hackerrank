package com.github.rougsig.ipk.array

import com.github.rougsig.core.IOEnvironment

fun IOEnvironment.hourglassSum() {
  val arr = Array(6) { IntArray(6) { sc.nextInt() } }

  val result = (1..4)
    .flatMap { i -> (1..4).map { j -> i to j } }
    .map { (x, y) ->
      arr[x][y] +
        arr[x - 1][y] +
        arr[x - 1][y - 1] +
        arr[x - 1][y + 1] +
        arr[x + 1][y] +
        arr[x + 1][y - 1] +
        arr[x + 1][y + 1]
    }
    .max()

  out.print(result)
}
