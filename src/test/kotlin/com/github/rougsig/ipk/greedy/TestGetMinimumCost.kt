package com.github.rougsig.ipk.greedy

import com.github.rougsig.core.IOEnvironment
import com.github.rougsig.core.IOEnvironmentTestFixture
import org.testng.annotations.DataProvider

class TestGetMinimumCost : IOEnvironmentTestFixture(IOEnvironment::getMinimumCost) {
  @DataProvider
  fun io() = arrayOf(
    "00",
    "10",
    "11"
  )
}
