package com.simpletest;

import com.example.tutorial.protos.Person;

public class AdressBookMain {
    public static void main(String[] args) {
        System.out.println("AdressBook Proto");
        Person.PhoneNumber phoneBuild = Person.PhoneNumber.newBuilder()
                .setType(Person.PhoneType.MOBILE)
                .setNumber("9074673854")
                .build();
        Person person = Person.newBuilder()
                .setId(1)
                .setName("Vineetha")
                .setEmail("vini@123.com")
                .setPhones(0,phoneBuild)
                .build();

        System.out.println(person);
    }
}
