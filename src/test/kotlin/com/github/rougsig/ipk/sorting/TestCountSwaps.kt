package com.github.rougsig.ipk.sorting

import com.github.rougsig.core.IOEnvironment
import com.github.rougsig.core.IOEnvironmentTestFixture
import org.testng.annotations.DataProvider

class TestCountSwaps : IOEnvironmentTestFixture(IOEnvironment::countSwaps) {
  @DataProvider
  fun io() = arrayOf(
    "00",
    "01",
    "03"
  )
}
