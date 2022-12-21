package com.practice.restfulwebservices.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Component;
import static org.springframework.security.config.Customizer.withDefaults;

@Component
public class SpringSecurityConfiguration {
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		
		// All requests should be authenticated.
		http.authorizeHttpRequests(
				auth -> auth.anyRequest().authenticated());
		
		// If a request is not authenticated, use http basic
		http.httpBasic(withDefaults());
		
		//CSRF -> POST, PUT
		http.csrf().disable();
		
		return http.build();
		
	}

}
