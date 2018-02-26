package com.jcmsalves.kotlinplayground.syntax

fun aFunction(x: Int, y: Int): Int {
    return x + y
}

fun aFunctionWithExplicitReturnType(x: Int, y: Int) {
    println("sum of $x and $y is ${x + y}")
}

fun aFunctionWithoutReduntant(x: Int, y: Int) {
    println("sum of $x and $y is ${x + y}")
}

fun aFunctionAsExpression(x: Int, y: Int) = x + y
