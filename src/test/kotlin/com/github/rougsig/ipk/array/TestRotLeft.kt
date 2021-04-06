package com.github.rougsig.ipk.array

import com.github.rougsig.core.IOEnvironment
import com.github.rougsig.core.IOSpec

class TestRotLeft : IOSpec(
  resourcesDir = "com/github/rougsig/ipk/array/rotLeft",
  testFun = IOEnvironment::rotLeft
)
