package com.github.rougsig.ipk.array

import java.io.InputStream
import java.io.PrintStream
import java.util.*

fun hourglassSum(input: InputStream, output: PrintStream) {
    val sc = Scanner(input)

    val arr = Array(6) { IntArray(6) { sc.nextInt() } }

    val one2Four = (1..4)

    val result = one2Four
        .flatMap { i -> one2Four.map { j -> i to j } }
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

    output.print(result)
}
