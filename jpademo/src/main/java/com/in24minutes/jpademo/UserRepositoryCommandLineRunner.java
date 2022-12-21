package com.in24minutes.jpademo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in24minutes.jpademo.entity.User1;
import com.in24minutes.jpademo.service.UserRepository;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner{

	private static final Logger log = LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);
	
	@Autowired
	private UserRepository userDao;
	
	@Override
	public void run(String... args) throws Exception {
		User1 user = new User1("Pihu","Admin");
		userDao.save(user);
		log.info("User Created with ID : "+ user);
		
		List<User1> users = userDao.findAll();
		log.info("All Users : "+users);
	}

}
