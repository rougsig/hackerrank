package com.github.rougsig.ipk.string

import com.github.rougsig.core.IOEnvironment
import com.github.rougsig.core.IOEnvironmentTestFixture
import org.testng.annotations.DataProvider

class TestIsValid : IOEnvironmentTestFixture(IOEnvironment::isValid) {
  @DataProvider
  fun io() = arrayOf(
    "00",
    "01",
    "03",
    "16",
    "18"
  )
}
