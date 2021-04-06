package com.github.rougsig.ipk.hashmap

import com.github.rougsig.core.IOEnvironment
import com.github.rougsig.core.IOSpec

class TestTwoStrings : IOSpec(
  resourcesDir = "com/github/rougsig/ipk/hashmap/twoStrings",
  testFun = IOEnvironment::twoStrings
)
