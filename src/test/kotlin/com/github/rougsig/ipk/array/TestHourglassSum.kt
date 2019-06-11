package com.github.rougsig.ipk.array

import com.github.rougsig.core.IOEnvironment
import com.github.rougsig.core.IOEnvironmentTestFixture
import org.testng.annotations.DataProvider

class TestHourglassSum : IOEnvironmentTestFixture(IOEnvironment::hourglassSum) {
  @DataProvider
  fun io() = arrayOf(
    "00",
    "01",
    "08"
  )
}
