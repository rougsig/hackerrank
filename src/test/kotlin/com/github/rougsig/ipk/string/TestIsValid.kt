package com.github.rougsig.ipk.string

import com.github.rougsig.core.IOEnvironment
import com.github.rougsig.core.IOSpec

class TestIsValid : IOSpec(
  resourcesDir = "com/github/rougsig/ipk/string/isValid",
  testFun = IOEnvironment::isValid
)
