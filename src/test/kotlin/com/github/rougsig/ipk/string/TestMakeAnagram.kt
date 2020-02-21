package com.github.rougsig.ipk.string

import com.github.rougsig.core.IOEnvironmentOld
import com.github.rougsig.core.IOEnvironmentOldTestFixture
import org.testng.annotations.DataProvider

class TestMakeAnagram : IOEnvironmentOldTestFixture(IOEnvironmentOld::makeAnagram) {
  @DataProvider
  fun io() = arrayOf(
    "00",
    "01",
    "15"
  )
}
