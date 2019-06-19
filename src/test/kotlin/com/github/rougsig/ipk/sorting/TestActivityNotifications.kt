package com.github.rougsig.ipk.sorting

import com.github.rougsig.core.IOEnvironment
import com.github.rougsig.core.IOEnvironmentTestFixture
import org.testng.annotations.DataProvider

class TestActivityNotifications : IOEnvironmentTestFixture(IOEnvironment::activityNotifications) {
  @DataProvider
  fun io() = arrayOf(
    "00",
    "06",
    "07"
  )
}
