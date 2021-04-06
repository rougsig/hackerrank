package com.github.rougsig.ipk.array

import com.github.rougsig.core.IOEnvironment
import com.github.rougsig.core.IOSpec

class TestMinimumSwaps : IOSpec(
  resourcesDir = "com/github/rougsig/ipk/array/minimumSwaps",
  testFun = IOEnvironment::minimumSwaps
)

