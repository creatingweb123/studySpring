package com.in28minutes.rest.webservices.restfulwebwervices.versioning;

public class PersonV2 {
    private Name name;

    public Name getName() {
        return name;
    }

    public PersonV2(Name name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonV1 [name=" + name + "]";
    }

}
