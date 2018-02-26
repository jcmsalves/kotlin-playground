package com.jcmsalves.kotlinplayground.syntax

class Nullability {

    fun NonNullString() {
        var nonNullString: String = "some string"
//        nonNullString = null // compilation error
    }

    fun NullString() {
        var nullString: String? = "some string"
        nullString = null // nothing wrong
    }

    fun SafeCase() {
        var nullString: String? = "some string"
        var length: Int
        var lengthOrNull: Int?

//        nullString.length // compilation error
//        length = nullString?.length // compilation error
        lengthOrNull = nullString?.length
    }

    fun ElvisOperator() {
        var nullString: String? = "some string"
        var length: Int

//        nullString.length // compilation error
        length = nullString?.length ?: -1
    }

    fun NeverUseThis() {
        var nullString: String? = "please don't use this operator"
        val length = nullString!!.length
    }
}
