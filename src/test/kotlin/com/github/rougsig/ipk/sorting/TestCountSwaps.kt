package com.github.rougsig.ipk.sorting

import com.github.rougsig.core.IOEnvironment
import com.github.rougsig.core.IOSpec

class TestCountSwaps : IOSpec(
  resourcesDir = "com/github/rougsig/ipk/sorting/countSwaps",
  testFun = IOEnvironment::countSwaps
)
