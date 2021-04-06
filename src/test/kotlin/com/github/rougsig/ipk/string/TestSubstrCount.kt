package com.github.rougsig.ipk.string

import com.github.rougsig.core.IOEnvironment
import com.github.rougsig.core.IOSpec

class TestSubstrCount : IOSpec(
  resourcesDir = "com/github/rougsig/ipk/string/substrCount",
  testFun = IOEnvironment::substrCount
)
