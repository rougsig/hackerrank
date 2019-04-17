package com.github.rougsig.twodarray

import com.github.rougsig.FilesTestCase

class TestRotLeft : FilesTestCase("com.github.rougsig.twodarray.rotleft") {
    fun test00() = doTest("00", ::rotLeft)
    fun test01() = doTest("01", ::rotLeft)
    fun test10() = doTest("10", ::rotLeft)
}
