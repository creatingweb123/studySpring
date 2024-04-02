package com.in28minutes.rest.webservices.restfulwebwervices.versioning;

public class PersonV1 {
    private String name;

    public String getName() {
        return name;
    }

    public PersonV1(String name) {
        super();
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonV1 [name=" + name + "]";
    }

}
