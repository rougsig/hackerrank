package com.github.rougsig.ipk.hashmap

import com.github.rougsig.core.IOEnvironmentOld
import com.github.rougsig.core.IOEnvironmentOldTestFixture
import org.testng.annotations.DataProvider

class TestFreqQuery : IOEnvironmentOldTestFixture(IOEnvironmentOld::freqQuery) {
  @DataProvider
  fun io() = arrayOf(
    "00",
    "01",
    "08",
    "12",
    "14"
  )
}
