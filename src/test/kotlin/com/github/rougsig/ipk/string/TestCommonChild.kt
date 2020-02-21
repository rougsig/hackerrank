package com.github.rougsig.ipk.string

import com.github.rougsig.core.IOEnvironment
import com.github.rougsig.core.IOEnvironmentTestFixture
import org.testng.annotations.DataProvider

class TestCommonChild : IOEnvironmentTestFixture(IOEnvironment::commonChild) {
  @DataProvider
  fun io() = arrayOf(
//    "02",
    "06"
//    "07",
//    "14"
  )
}
