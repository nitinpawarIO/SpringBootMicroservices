package com.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("authenticate")
public class AuthenticationController {

	@GetMapping
	public String welcome()
	{
		return "<h3>Welcome Nitin ! </h3>";
	}
}
