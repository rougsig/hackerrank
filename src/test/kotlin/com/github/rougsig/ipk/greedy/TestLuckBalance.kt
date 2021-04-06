package com.github.rougsig.ipk.greedy

import com.github.rougsig.core.IOEnvironment
import com.github.rougsig.core.IOSpec

class TestLuckBalance : IOSpec(
  resourcesDir = "com/github/rougsig/ipk/greedy/luckBalance",
  testFun = IOEnvironment::luckBalance
)
