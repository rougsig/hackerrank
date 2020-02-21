package com.github.rougsig.ipk.string

import com.github.rougsig.core.IOEnvironmentOld
import com.github.rougsig.core.IOEnvironmentOldTestFixture
import org.testng.annotations.DataProvider

class TestCommonChild : IOEnvironmentOldTestFixture(IOEnvironmentOld::commonChild) {
  @DataProvider
  fun io() = arrayOf(
    "02",
    "05",
    "06",
    "07",
    "14"
  )
}
