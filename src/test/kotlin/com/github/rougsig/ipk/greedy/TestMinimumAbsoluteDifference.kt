package com.github.rougsig.ipk.greedy

import com.github.rougsig.core.IOEnvironment
import com.github.rougsig.core.IOEnvironmentTestFixture
import org.testng.annotations.DataProvider

class TestMinimumAbsoluteDifference : IOEnvironmentTestFixture(IOEnvironment::minimumAbsoluteDifference) {
  @DataProvider
  fun io() = arrayOf(
    "00",
    "01",
    "02",
    "03",
    "10"
  )
}
