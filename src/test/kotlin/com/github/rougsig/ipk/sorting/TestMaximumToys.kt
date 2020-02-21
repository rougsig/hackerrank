package com.github.rougsig.ipk.sorting

import com.github.rougsig.core.IOEnvironmentOld
import com.github.rougsig.core.IOEnvironmentOldTestFixture
import org.testng.annotations.DataProvider

class TestMaximumToys : IOEnvironmentOldTestFixture(IOEnvironmentOld::maximumToys) {
  @DataProvider
  fun io() = arrayOf(
    "00",
    "16",
    "17"
  )
}
