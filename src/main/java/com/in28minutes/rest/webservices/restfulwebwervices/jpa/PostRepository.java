package com.in28minutes.rest.webservices.restfulwebwervices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.rest.webservices.restfulwebwervices.user.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
