package com.github.rougsig.ipk.string

import com.github.rougsig.core.IOEnvironmentOld
import com.github.rougsig.core.IOEnvironmentOldTestFixture
import org.testng.annotations.DataProvider

class TestAlternatingCharacters : IOEnvironmentOldTestFixture(IOEnvironmentOld::alternatingCharacters) {
  @DataProvider
  fun io() = arrayOf(
    "00",
    "12",
    "13",
    "14"
  )
}
