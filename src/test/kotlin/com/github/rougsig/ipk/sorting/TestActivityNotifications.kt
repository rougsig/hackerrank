package com.github.rougsig.ipk.sorting

import com.github.rougsig.core.IOEnvironment
import com.github.rougsig.core.IOSpec

class TestActivityNotifications : IOSpec(
  resourcesDir = "com/github/rougsig/ipk/sorting/activityNotifications",
  testFun = IOEnvironment::activityNotifications
)
