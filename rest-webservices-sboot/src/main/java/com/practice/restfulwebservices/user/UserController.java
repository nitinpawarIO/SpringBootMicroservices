package com.practice.restfulwebservices.user;

import java.net.URI;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserController {
	
	@Autowired 
	private UserDaoService userDaoService;
	
	@GetMapping("/users")
	public List<User> getAllUsers()
	{
		return userDaoService.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User getUser(@PathVariable int id)
	{
		
		User user = userDaoService.getUser(id);
		if (user == null)
			throw new UserNotFoundException("id : "+id);
		return user;
	}
	
	@PostMapping("/users")
	public ResponseEntity<User> addUser(@Valid @RequestBody User user)
	{
		User createdUser = userDaoService.createUser(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(createdUser.getId())
				.toUri();

		return ResponseEntity.created(location).build();
	}
	
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable int id)
	{
		 userDaoService.deleteById(id);
	}
}
