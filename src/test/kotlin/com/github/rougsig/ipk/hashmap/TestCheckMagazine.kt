package com.github.rougsig.ipk.hashmap

import com.github.rougsig.FilesTestCase

class TestCheckMagazine : FilesTestCase("com.github.rougsig.ipk.hashmap.checkmagazine") {
    fun test00() = doTest("00", ::checkMagazine)
    fun test20() = doTest("20", ::checkMagazine)
    fun test21() = doTest("21", ::checkMagazine)
}
