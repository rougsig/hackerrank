package com.github.rougsig.ipk.hashmap

import com.github.rougsig.core.IOEnvironment
import com.github.rougsig.core.IOSpec

class TestSherlockAndAnagrams : IOSpec(
  resourcesDir = "com/github/rougsig/ipk/hashmap/sherlockAndAnagrams",
  testFun = IOEnvironment::sherlockAndAnagrams
)
