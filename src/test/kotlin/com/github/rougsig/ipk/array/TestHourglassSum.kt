package com.github.rougsig.ipk.array

import com.github.rougsig.core.IOEnvironment
import com.github.rougsig.core.IOSpec

class TestHourglassSum : IOSpec(
  resourcesDir = "com/github/rougsig/ipk/array/hourglassSum",
  testFun = IOEnvironment::hourglassSum
)
