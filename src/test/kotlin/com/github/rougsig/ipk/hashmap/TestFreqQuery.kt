package com.github.rougsig.ipk.hashmap

import com.github.rougsig.core.IOEnvironment
import com.github.rougsig.core.IOSpec

class TestFreqQuery : IOSpec(
  resourcesDir = "com/github/rougsig/ipk/hashmap/freqQuery",
  testFun = IOEnvironment::freqQuery
)
