package com.github.rougsig.ipk.array

import com.github.rougsig.core.IOEnvironment
import com.github.rougsig.core.IOSpec

class TestMinimumBribes : IOSpec(
  resourcesDir = "com/github/rougsig/ipk/array/minimumBribes",
  testFun = IOEnvironment::minimumBribes
)
