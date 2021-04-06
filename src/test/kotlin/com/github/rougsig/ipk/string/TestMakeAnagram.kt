package com.github.rougsig.ipk.string

import com.github.rougsig.core.IOEnvironment
import com.github.rougsig.core.IOSpec

class TestMakeAnagram : IOSpec(
  resourcesDir = "com/github/rougsig/ipk/string/makeAnagram",
  testFun = IOEnvironment::makeAnagram
)
