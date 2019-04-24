package com.github.rougsig.twodarray

import com.github.rougsig.FilesTestCase

class TestMinimumSwaps : FilesTestCase("com.github.rougsig.twodarray.minimumswaps") {
  fun test00() = doTest("00", ::minimumSwaps)
  fun test01() = doTest("01", ::minimumSwaps)
  fun test02() = doTest("02", ::minimumSwaps)
}
