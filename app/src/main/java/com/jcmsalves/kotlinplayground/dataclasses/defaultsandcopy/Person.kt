package com.jcmsalves.kotlinplayground.dataclasses.defaultsandcopy

data class Person(val name: String = "default name", val age: Int = 30,
                  val email: String = "dummy email", val phone: Long = 1234567890)

val person1: Person = Person("name", 25, "email@gmail.com", 555544448)

val person2: Person = Person()

val person3: Person = Person("name", 25)

val person4: Person = Person(name = "name", phone = 9876543210)

val person1Copy = person1.copy()

val person1With30 = person1.copy(age = 30)

val person4WithEmail = person4.copy(email = "person4@gmail.com")
