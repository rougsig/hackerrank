package com.github.rougsig.twodarray

import com.github.rougsig.FilesTestCase

class TestArrayManipulation : FilesTestCase("com.github.rougsig.twodarray.arraymanipulation") {
  fun test00() = doTest("00", ::arrayManipulation)
  fun test06() = doTest("06", ::arrayManipulation)
  fun test14() = doTest("14", ::arrayManipulation)
  fun test15() = doTest("15", ::arrayManipulation)
}
