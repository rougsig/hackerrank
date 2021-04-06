package com.github.rougsig.ipk.hashmap

import com.github.rougsig.core.IOEnvironment
import com.github.rougsig.core.IOSpec

class TestCountTriplets : IOSpec(
  resourcesDir = "com/github/rougsig/ipk/hashmap/countTriplets",
  testFun = IOEnvironment::countTriplets
)
