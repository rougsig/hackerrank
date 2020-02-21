package com.github.rougsig.ipk.string

import com.github.rougsig.core.IOEnvironmentOld
import com.github.rougsig.core.IOEnvironmentOldTestFixture
import org.testng.annotations.DataProvider

class TestIsValid : IOEnvironmentOldTestFixture(IOEnvironmentOld::isValid) {
  @DataProvider
  fun io() = arrayOf(
    "00",
    "01",
    "03",
    "16",
    "18"
  )
}
