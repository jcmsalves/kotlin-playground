package com.jcmsalves.kotlinplayground.syntax

class Ranges {

    fun simpleRange(number: Number) {
        if (number in 1..100)
            print(number)
    }

    fun simpleRangeReverseWrong() {
        for (number in 100..1)
            print(number) // this doesn't print anything
    }

    fun simpleRangeReverseCorrect() {
        for (number in 100 downTo 1)
            print(number)
    }

    fun until() {
        for (i in 1 until 100) {
            println(i)
        }
    }

    fun steps() {
        for (i in 1..100 step 2) {
            println(i)
        }

        for (i in 100 downTo 1 step 5) {
            println(i)
        }
    }
}
