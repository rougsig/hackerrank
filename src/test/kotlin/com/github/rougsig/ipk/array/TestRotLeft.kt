package com.github.rougsig.ipk.array

import com.github.rougsig.FilesTestCase

class TestRotLeft : FilesTestCase("com.github.rougsig.ipk.array.rotleft") {
  fun test00() = doTest("00", ::rotLeft)
  fun test01() = doTest("01", ::rotLeft)
  fun test10() = doTest("10", ::rotLeft)
}
