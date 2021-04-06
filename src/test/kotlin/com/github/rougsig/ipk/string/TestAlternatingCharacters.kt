package com.github.rougsig.ipk.string

import com.github.rougsig.core.IOEnvironment
import com.github.rougsig.core.IOSpec

class TestAlternatingCharacters : IOSpec(
  resourcesDir = "com/github/rougsig/ipk/string/alternatingCharacters",
  testFun = IOEnvironment::alternatingCharacters
)
