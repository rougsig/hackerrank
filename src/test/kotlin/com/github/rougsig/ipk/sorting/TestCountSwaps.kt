package com.github.rougsig.ipk.sorting

import com.github.rougsig.core.IOEnvironmentOld
import com.github.rougsig.core.IOEnvironmentOldTestFixture
import org.testng.annotations.DataProvider

class TestCountSwaps : IOEnvironmentOldTestFixture(IOEnvironmentOld::countSwaps) {
  @DataProvider
  fun io() = arrayOf(
    "00",
    "01",
    "03"
  )
}
