package com.educando.demo.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educando.demo.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){	
		User u = new User(1L, "Alex", "alex@gmail.com", "12345678", "123");
		return ResponseEntity.ok().body(u);
	}

}
