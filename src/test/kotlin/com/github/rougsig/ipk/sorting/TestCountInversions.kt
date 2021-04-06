package com.github.rougsig.ipk.sorting

import com.github.rougsig.core.IOEnvironment
import com.github.rougsig.core.IOSpec

class TestCountInversions : IOSpec(
  resourcesDir = "com/github/rougsig/ipk/sorting/countInversions",
  testFun = IOEnvironment::countInversions
)
