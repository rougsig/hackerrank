package com.github.rougsig.ipk.array

import com.github.rougsig.core.IOEnvironmentOld
import com.github.rougsig.core.IOEnvironmentOldTestFixture
import org.testng.annotations.DataProvider

class TestRotLeft : IOEnvironmentOldTestFixture(IOEnvironmentOld::rotLeft) {
  @DataProvider
  fun io() = arrayOf(
    "00",
    "01",
    "10"
  )
}
