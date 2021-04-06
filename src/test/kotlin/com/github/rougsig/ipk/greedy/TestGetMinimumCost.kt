package com.github.rougsig.ipk.greedy

import com.github.rougsig.core.IOEnvironment
import com.github.rougsig.core.IOSpec

class TestGetMinimumCost : IOSpec(
  resourcesDir = "com/github/rougsig/ipk/greedy/getMinimumCost",
  testFun = IOEnvironment::getMinimumCost
)
