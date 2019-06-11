package com.github.rougsig.ipk.hashmap

import com.github.rougsig.core.IOEnvironment
import com.github.rougsig.core.IOEnvironmentTestFixture
import org.testng.annotations.DataProvider

class TestCountTriplets : IOEnvironmentTestFixture(IOEnvironment::countTriplets) {
  @DataProvider
  fun io() = arrayOf(
    "00"
//    "01",
//    "02",
//    "03",
//    "12"
  )
}
