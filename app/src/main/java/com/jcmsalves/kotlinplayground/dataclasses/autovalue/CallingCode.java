package com.jcmsalves.kotlinplayground.dataclasses.autovalue;

import com.jcmsalves.kotlinplayground.dataclasses.Person;

public class CallingCode {

    PersonAutoValue personAutoValue = PersonAutoValue.builder()
            .setName("name")
            .setEmail("email@gmail.com")
            // .setAge(32) - not mandatory
            .setPhone(1234567890)
            .build();

    Person person = new Person("name", 32, "email@gmail.com", 1234567890);

    OverloadPerson overloadPerson1 = new OverloadPerson("name", 32, "email@gmail.com", 1234567890);
    OverloadPerson overloadPerson2 = new OverloadPerson("name", 32, "email@gmail.com");
    OverloadPerson overloadPerson3 = new OverloadPerson("name", 32);
    OverloadPerson overloadPerson4 = new OverloadPerson("name");

}
