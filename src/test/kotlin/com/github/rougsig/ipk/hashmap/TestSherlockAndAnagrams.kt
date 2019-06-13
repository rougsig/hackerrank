package com.github.rougsig.ipk.hashmap

import com.github.rougsig.core.IOEnvironment
import com.github.rougsig.core.IOEnvironmentTestFixture
import org.testng.annotations.DataProvider

class TestSherlockAndAnagrams : IOEnvironmentTestFixture(IOEnvironment::sherlockAndAnagrams) {
  @DataProvider
  fun io() = arrayOf(
    "00",
    "01",
    "06"
  )
}
