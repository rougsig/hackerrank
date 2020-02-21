package com.github.rougsig.ipk.hashmap

import com.github.rougsig.core.IOEnvironmentOld
import com.github.rougsig.core.IOEnvironmentOldTestFixture
import org.testng.annotations.DataProvider

class TestCheckMagazine : IOEnvironmentOldTestFixture(IOEnvironmentOld::checkMagazine) {
  @DataProvider
  fun io() = arrayOf(
    "00",
    "20",
    "21"
  )
}
