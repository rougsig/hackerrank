package com.github.rougsig.ipk.array

import com.github.rougsig.FilesTestCase

class TestHourglassSum : FilesTestCase("com.github.rougsig.ipk.array.hourglasssum") {
    fun test00() = doTest("00", ::hourglassSum)
    fun test01() = doTest("01", ::hourglassSum)
    fun test08() = doTest("08", ::hourglassSum)
}
