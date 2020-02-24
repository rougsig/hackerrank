package com.github.rougsig.ipk.greedy

import com.github.rougsig.core.IOEnvironment
import com.github.rougsig.core.IOEnvironmentTestFixture
import org.testng.annotations.DataProvider

class TestLuckBalance : IOEnvironmentTestFixture(IOEnvironment::luckBalance) {
  @DataProvider
  fun io() = arrayOf(
    "00",
    "03",
    "12"  
  )
}
