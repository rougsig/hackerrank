package com.github.rougsig.ipk.hashmap

import com.github.rougsig.FilesTestCase

class TestTwoStrings : FilesTestCase("com.github.rougsig.ipk.hashmap.twostrings") {
  fun test00() = doTest("00", ::twoStrings)
  fun test20() = doTest("06", ::twoStrings)
  fun test21() = doTest("07", ::twoStrings)
}
