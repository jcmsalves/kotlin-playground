package com.jcmsalves.kotlinplayground.syntax

import java.time.LocalDateTime

class ClassWithEmptyBody

class ClassWithBody(val name: String) {
    val nameLength = name.length
}

class ClassWithoutConstructorKeyword (val name: String) {
    val nameLength = name.length
}

class ClassWithConstructorKeyword constructor (val name: String) {
    val nameLength = name.length
}

class ClassWithAccessModifier public constructor (val name: String) {
    val nameLength = name.length
}

class ClassWithInitialization public constructor (val name: String) {
    val nameLength: Int

    init {
        nameLength = name.length
    }
}

class ClassWithMultipleConstructors (val name: String) {
    val nameLength = name.length

    constructor(name: String, age: Int) : this(name) {
        val yearOfBirth = LocalDateTime.now().year - age
    }
}

class Instantiations {
    val ClassWithEmptyBody = ClassWithEmptyBody()

    val ClassWithBody = ClassWithBody("a name")
}

open class ParentClass (someNumber: Int)

class ChildClass (someNumber: Int) : ParentClass(someNumber)

interface InterfaceExample {
    fun test()
}

class InterfaceImplementation : InterfaceExample {
    override fun test() {
        //Some implementation
    }
}
