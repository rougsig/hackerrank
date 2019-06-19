package com.github.rougsig.ipk.sorting

import com.github.rougsig.core.IOEnvironment
import com.github.rougsig.core.IOEnvironmentTestFixture
import org.testng.annotations.DataProvider

class TestMaximumToys : IOEnvironmentTestFixture(IOEnvironment::maximumToys) {
  @DataProvider
  fun io() = arrayOf(
    "00",
    "16",
    "17"
  )
}
