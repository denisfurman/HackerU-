package edu.tomerbu;

/**
 * Created by hackeru on 26/12/2018.
 */


//class level: declarations only.
public class Person {
    //properties:
    String firstName;
    String lastName;

    //ctor:
    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //methods:
    void sayYourFullName() {
        System.out.println("My Name is: " + firstName + " " + lastName);
    }
}
