package com.in24minutes.jpademo.service;

import org.springframework.data.jpa.repository.JpaRepository;
import com.in24minutes.jpademo.entity.User1;

public interface UserRepository extends JpaRepository<User1, Integer>{

}
