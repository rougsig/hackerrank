package com.github.rougsig.twodarray

import com.github.rougsig.FilesTestCase

class TestMinimumBribes : FilesTestCase("com.github.rougsig.twodarray.minimumbribes") {
    fun test00() = doTest("00", ::minimumBribes)
    fun test01() = doTest("01", ::minimumBribes)
    fun test03() = doTest("03", ::minimumBribes)
    fun test11() = doTest("11", ::minimumBribes)
}
