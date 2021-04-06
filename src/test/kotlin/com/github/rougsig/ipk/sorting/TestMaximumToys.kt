package com.github.rougsig.ipk.sorting

import com.github.rougsig.core.IOEnvironment
import com.github.rougsig.core.IOSpec

class TestMaximumToys : IOSpec(
  resourcesDir = "com/github/rougsig/ipk/sorting/maximumToys",
  testFun = IOEnvironment::maximumToys
)
