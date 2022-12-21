package com.practice.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

@Service
public class UserDaoService {
	
	private static List<User> usersList = new ArrayList<>();
	private static Integer userCount = 0;
	
	static {
		usersList.add(new User(++userCount, "John", LocalDate.now().minusYears(30)));
		usersList.add(new User(++userCount, "Henry", LocalDate.now().minusYears(25)));
		usersList.add(new User(++userCount, "Steve", LocalDate.now().minusYears(27)));
		usersList.add(new User(++userCount, "Luke", LocalDate.now().minusYears(22)));
	}

	public List<User> findAll(){
		return usersList;
	}
	
	public User getUser(int id){
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		return usersList.stream().filter(predicate).findFirst().orElse(null);
	}

	public User createUser(User user) {
		user.setId(++userCount);
		usersList.add(user);
		return user;
	}
	
	public void deleteById(int id){
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		usersList.removeIf(predicate);
	}
	
}
