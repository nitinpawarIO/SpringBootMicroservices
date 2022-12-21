package com.practice.restfulwebservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.restfulwebservices.user.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
