package com.github.rougsig.ipk.array

import com.github.rougsig.core.IOEnvironment
import com.github.rougsig.core.IOSpec

class TestArrayManipulation : IOSpec(
  resourcesDir = "com/github/rougsig/ipk/array/arrayManipulation",
  testFun = IOEnvironment::arrayManipulation
)
