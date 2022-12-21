package com.in24minutes.jpademo.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.in24minutes.jpademo.entity.User1;

@Repository
@Transactional
public class UserDAOService {
	
	@PersistenceContext
	EntityManager entityManager;
	
	public int insert(User1 user) {
		entityManager.persist(user);
		return user.getId();
	}
	
}
