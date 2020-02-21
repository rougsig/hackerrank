package com.github.rougsig.ipk.array

import com.github.rougsig.core.IOEnvironmentOld
import com.github.rougsig.core.IOEnvironmentOldTestFixture
import org.testng.annotations.DataProvider

class TestArrayManipulation : IOEnvironmentOldTestFixture(IOEnvironmentOld::arrayManipulation) {
  @DataProvider
  fun io() = arrayOf(
    "00",
    "06",
    "14",
    "15"
  )
}
