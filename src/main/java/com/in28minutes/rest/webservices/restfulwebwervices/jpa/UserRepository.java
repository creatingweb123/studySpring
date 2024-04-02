package com.in28minutes.rest.webservices.restfulwebwervices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.rest.webservices.restfulwebwervices.user.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
