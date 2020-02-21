package com.github.rougsig.ipk.sorting

import com.github.rougsig.core.IOEnvironmentOld
import com.github.rougsig.core.IOEnvironmentOldTestFixture
import org.testng.annotations.DataProvider

class TestCountInversions : IOEnvironmentOldTestFixture(IOEnvironmentOld::countInversions) {
  @DataProvider
  fun io() = arrayOf(
    "00",
    "14",
    "15"
  )
}
