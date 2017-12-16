package com.jcmsalves.kotlinplayground.syntax

enum class SemiColonNotRequired {
    WITH,
    WITHOUT
}

enum class SemiColonRequired {
    WITH,
    WITHOUT;

    fun isRequired(): Boolean = this == WITH
}

fun semicolon() {
    var list = 1..10
    list.forEach { val result = it * 2; println("$it times 2 is $result")}
}