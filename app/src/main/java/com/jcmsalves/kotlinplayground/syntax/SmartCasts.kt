package com.jcmsalves.kotlinplayground.syntax

class SmartCasts {

    fun simple(value: Any) {
        if (value is Int) {
            print(value == 0) // value is automatically cast to Int
        }
    }

    fun withReturn(value: Any) {
        if (value !is Int) return
        print(value == 0) // value is automatically cast to Int
    }

    fun withOr(value: Any) {
        // value is automatically cast to Int on the right-hand side of `||`
        if (value !is Int || value == 0) return
    }

    fun withAnd(value: Any) {
        // value is automatically cast to Int on the right-hand side of `&&`
        if (value is Int && value > 1) {
            print(value > 1) // value is automatically cast to Int
        }
    }
}