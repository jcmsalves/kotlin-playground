package com.jcmsalves.kotlinplayground.dataclasses.autovalue

data class OverloadPerson @JvmOverloads constructor(val name: String = "some name",
                                                    val age: Int = 25,
                                                    val email: String = "some email",
                                                    val phone: Long = 1234)