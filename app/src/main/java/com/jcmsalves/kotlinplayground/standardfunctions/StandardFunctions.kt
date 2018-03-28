package com.jcmsalves.kotlinplayground.standardfunctions

data class SomeObject(var someField: String = "some default value", var otherField: Int = 55)

class StandardFunctions {

    fun playground() {
        var someObject = SomeObject()

        val letExample = someObject?.let {
            print(it.someField)
            this.someOtherFunction()
            "some result"
        }

        val applyExample = someObject.apply {
            someField = "some field"
            this.otherField = 99
            "some result"
        }


        val runExample = someObject.run {
            print(someField)
            this.otherField = 99
            "some result"
        }

        val alsoExample = someObject.also {
            print(it.someField)
            this.someOtherFunction()
            "some result"
        }

        val withExample = with(someObject) {
            print(someField)
            this.otherField = 99
            "some result"
        }
    }

    fun someOtherFunction() {
        print("random message")
    }
}
