package com.github.rougsig.ipk.sorting

import com.github.rougsig.core.IOEnvironment
import com.github.rougsig.core.IOEnvironmentTestFixture
import org.testng.annotations.DataProvider

class TestCountInversions : IOEnvironmentTestFixture(IOEnvironment::countInversions) {
  @DataProvider
  fun io() = arrayOf(
    "00",
    "14",
    "15"
  )
}
