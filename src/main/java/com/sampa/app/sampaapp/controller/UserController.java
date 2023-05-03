package com.sampa.app.sampaapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sampa.app.sampaapp.model.User;
import com.sampa.app.sampaapp.service.UserService;

import jakarta.validation.Valid;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/signup")
	public User createUser(@RequestBody @Valid User user) {
		return userService.createUser(user);
	}
}
