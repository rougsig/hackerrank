package com.github.rougsig.ipk.string

import com.github.rougsig.core.IOEnvironment
import com.github.rougsig.core.IOSpec

class TestCommonChild : IOSpec(
  resourcesDir = "com/github/rougsig/ipk/string/commonChild",
  testFun = IOEnvironment::commonChild
)
