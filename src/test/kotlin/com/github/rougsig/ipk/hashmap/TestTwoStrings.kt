package com.github.rougsig.ipk.hashmap

import com.github.rougsig.core.IOEnvironment
import com.github.rougsig.core.IOEnvironmentTestFixture
import org.testng.annotations.DataProvider

class TestTwoStrings : IOEnvironmentTestFixture(IOEnvironment::twoStrings) {
  @DataProvider
  fun io() = arrayOf(
    "00",
    "06",
    "07"
  )
}
