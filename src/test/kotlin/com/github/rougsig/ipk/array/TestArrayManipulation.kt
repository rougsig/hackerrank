package com.github.rougsig.ipk.array

import com.github.rougsig.core.IOEnvironment
import com.github.rougsig.core.IOEnvironmentTestFixture
import org.testng.annotations.DataProvider

class TestArrayManipulation : IOEnvironmentTestFixture(IOEnvironment::arrayManipulation) {
  @DataProvider
  fun io() = arrayOf(
    "00",
    "06",
    "14",
    "15"
  )
}
