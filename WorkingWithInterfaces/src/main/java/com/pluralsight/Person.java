package com.pluralsight;

public class Person implements Comparable<Person> { // object called person. compare one person to another then sort them
    // Every person has first and last name and age
    String firstName;
    String lastName;
    int age;

    // Constructor to create a new person
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Compare by lastName, then firstName, then age
    //if they have the same last name , check the first name
    // if both names are the same , check who is goes first

    @Override
    public int compareTo(Person other) {//Override(Change) how people are compared
        int lastNameCompare = this.lastName.compareTo(other.lastName); // compare my last name to the other person last name
        //.compare() helps figure that out
        if (lastNameCompare != 0) {
            return lastNameCompare; // if the last name are not the same then return result
        }

        int firstNameCompare = this.firstName.compareTo(other.firstName); // if the last names are the same then compare first name
        if (firstNameCompare != 0) {
            return firstNameCompare;
        }

        return Integer.compare(this.age, other.age); // compare by age if names are the same
    }

    // To display the person nicely
    // When i show a person, print their  name and age like
    @Override
    public String toString() { // this is how it looks when it print out
        return firstName + " " + lastName + " (" + age + ")";//When it shows a person then print their name and age
    }
}

