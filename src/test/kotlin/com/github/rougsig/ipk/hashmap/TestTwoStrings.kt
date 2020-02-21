package com.github.rougsig.ipk.hashmap

import com.github.rougsig.core.IOEnvironmentOld
import com.github.rougsig.core.IOEnvironmentOldTestFixture
import org.testng.annotations.DataProvider

class TestTwoStrings : IOEnvironmentOldTestFixture(IOEnvironmentOld::twoStrings) {
  @DataProvider
  fun io() = arrayOf(
    "00",
    "06",
    "07"
  )
}
