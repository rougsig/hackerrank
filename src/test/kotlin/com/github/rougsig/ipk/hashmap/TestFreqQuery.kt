package com.github.rougsig.ipk.hashmap

import com.github.rougsig.core.IOEnvironment
import com.github.rougsig.core.IOEnvironmentTestFixture
import org.testng.annotations.DataProvider

class TestFreqQuery : IOEnvironmentTestFixture(IOEnvironment::freqQuery) {
  @DataProvider
  fun io() = arrayOf(
    "00",
    "01",
    "08",
    "12",
    "14"
  )
}
