package com.github.rougsig.ipk.sorting

import com.github.rougsig.core.IOEnvironment

fun IOEnvironment.countInversions() {

  fun mergeSort(arr: IntArray): Long {
    var counter = 0L

    fun merge(left: IntArray, right: IntArray): IntArray {
      val result = IntArray(left.size + right.size)
      var leftIndex = 0
      var rightIndex = 0
      var index = 0

      while (leftIndex < left.size && rightIndex < right.size) {
        if (left[leftIndex] <= right[rightIndex]) {
          result[index] = left[leftIndex]
          leftIndex += 1
        } else {
          counter += left.size - leftIndex
          result[index] = right[rightIndex]
          rightIndex += 1
        }
        index += 1
      }

      (leftIndex..left.lastIndex).forEach {
        result[index] = left[it]
        index += 1
      }

      (rightIndex..right.lastIndex).forEach {
        result[index] = right[it]
        index += 1
      }

      return result
    }

    fun sort(arr: IntArray): IntArray {
      if (arr.size < 2) return arr

      val middle = arr.size / 2
      val left = arr.copyOfRange(0, middle)
      val right = arr.copyOfRange(middle, arr.size)

      return merge(sort(left), sort(right))
    }

    sort(arr)
    return counter
  }


  repeat(nextToken().toInt()) { addToResult(mergeSort(IntArray(nextToken().toInt()) { nextToken().toInt() }).toString()) }
  printResult()
}
