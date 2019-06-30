package com.github.rougsig.ipk.string

import com.github.rougsig.core.IOEnvironment
import com.github.rougsig.core.IOEnvironmentTestFixture
import org.testng.annotations.DataProvider

class TestMakeAnagram : IOEnvironmentTestFixture(IOEnvironment::makeAnagram) {
  @DataProvider
  fun io() = arrayOf(
    "00",
    "01",
    "15"
  )
}
