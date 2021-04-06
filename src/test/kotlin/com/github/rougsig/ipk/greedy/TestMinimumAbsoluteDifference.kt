package com.github.rougsig.ipk.greedy

import com.github.rougsig.core.IOEnvironment
import com.github.rougsig.core.IOSpec

class TestMinimumAbsoluteDifference : IOSpec(
  resourcesDir = "com/github/rougsig/ipk/greedy/minimumAbsoluteDifference",
  testFun = IOEnvironment::minimumAbsoluteDifference
)
