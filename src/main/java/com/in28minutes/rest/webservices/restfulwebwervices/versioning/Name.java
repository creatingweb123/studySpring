package com.in28minutes.rest.webservices.restfulwebwervices.versioning;

public class Name {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Name [firstName=" + firstName + ", lastName=" + lastName + "]";
    }
}
