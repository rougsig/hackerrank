package com.github.rougsig.ipk.string

import com.github.rougsig.core.IOEnvironment
import com.github.rougsig.core.IOEnvironmentTestFixture
import org.testng.annotations.DataProvider

class TestAlternatingCharacters : IOEnvironmentTestFixture(IOEnvironment::alternatingCharacters) {
  @DataProvider
  fun io() = arrayOf(
    "00",
    "12",
    "13",
    "14"
  )
}
