package com.github.rougsig.ipk.hashmap

import com.github.rougsig.core.IOEnvironment
import com.github.rougsig.core.IOEnvironmentTestFixture
import org.testng.annotations.DataProvider

class TestCheckMagazine : IOEnvironmentTestFixture(IOEnvironment::checkMagazine) {
  @DataProvider
  fun io() = arrayOf(
    "00",
    "20",
    "21"
  )
}
