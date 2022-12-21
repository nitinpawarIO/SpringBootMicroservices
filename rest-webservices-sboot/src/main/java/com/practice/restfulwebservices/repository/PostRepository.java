package com.practice.restfulwebservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.restfulwebservices.user.Post;

public interface PostRepository extends JpaRepository<Post, Integer>{

}
