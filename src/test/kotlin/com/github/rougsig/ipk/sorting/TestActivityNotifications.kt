package com.github.rougsig.ipk.sorting

import com.github.rougsig.core.IOEnvironmentOld
import com.github.rougsig.core.IOEnvironmentOldTestFixture
import org.testng.annotations.DataProvider
import org.testng.annotations.Test

class TestActivityNotifications : IOEnvironmentOldTestFixture(IOEnvironmentOld::activityNotifications) {
  @DataProvider
  fun io() = arrayOf(
    "00",
    "03",
    "06",
    "07"
  )

  @DataProvider
  fun calculateMedianDataProvider() = arrayOf(
    arrayOf(intArrayOf(1, 2, 3), 2f),
    arrayOf(intArrayOf(1, 2, 3, 4), 2.5f),
    arrayOf(intArrayOf(1, 3, 3, 3, 5), 3f),
    arrayOf(intArrayOf(1, 1, 2, 2), 1.5f)
  )

  @Test(dataProvider = "calculateMedianDataProvider")
  fun calculateMedian(array: IntArray, expectedMedian: Float) {
    val transactions = IntArray(201)
    array.forEach { transactions[it] += 1 }

    assertThat(calculateMedian(transactions, array.size))
      .isEqualTo(expectedMedian)
  }
}
