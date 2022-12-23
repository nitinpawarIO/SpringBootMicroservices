package com.practice.microservice.limits.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.microservice.limits.bean.Limits;
import com.practice.microservice.limits.configuration.Configuration;

@RestController
public class LimitsController {

	@Autowired
	Configuration configuration;

	@GetMapping("/getLimits")
	public Limits retriveLimits() {
		return new Limits(configuration.getMinimum(), configuration.getMaximum());
	}

}
