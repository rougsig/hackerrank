package com.github.rougsig.ipk.hashmap

import com.github.rougsig.core.IOEnvironmentOld
import com.github.rougsig.core.IOEnvironmentOldTestFixture
import org.testng.annotations.DataProvider

class TestSherlockAndAnagrams : IOEnvironmentOldTestFixture(IOEnvironmentOld::sherlockAndAnagrams) {
  @DataProvider
  fun io() = arrayOf(
    "00",
    "01",
    "02",
    "06"
  )
}
