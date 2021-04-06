package com.github.rougsig.ipk.hashmap

import com.github.rougsig.core.IOEnvironment
import com.github.rougsig.core.IOSpec

class TestCheckMagazine : IOSpec(
  resourcesDir = "com/github/rougsig/ipk/hashmap/checkMagazine",
  testFun = IOEnvironment::checkMagazine
)
