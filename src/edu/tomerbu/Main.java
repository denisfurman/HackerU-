package edu.tomerbu;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("Moe", "Green");
        Person p2 = new Person("Jane", "Javka");


        //arr of length 3
        Person[] people = new Person[3];
        people[0] = p1;
        people[1] = p2;
        people[2] = new Person("Dave", "Cohen");


        //shorthand syntax to declare arrays
        Person[] pArray = {
                new Person("Shak", "nil"),
                new Person("Dave", "Blat"),
                p1
        };



    }
}
