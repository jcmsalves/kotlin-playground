package com.jcmsalves.kotlinplayground.trywithresources

import java.io.BufferedReader
import java.io.FileReader

private fun readFirstLineJava7(): String {
    BufferedReader(FileReader("test.file")).use { return it.readLine() }
}
