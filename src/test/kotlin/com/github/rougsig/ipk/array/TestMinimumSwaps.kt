package com.github.rougsig.ipk.array

import com.github.rougsig.core.IOEnvironmentOld
import com.github.rougsig.core.IOEnvironmentOldTestFixture
import org.testng.annotations.DataProvider

class TestMinimumSwaps : IOEnvironmentOldTestFixture(IOEnvironmentOld::minimumSwaps) {
  @DataProvider
  fun io() = arrayOf(
    "00",
    "01",
    "02"
  )
}
