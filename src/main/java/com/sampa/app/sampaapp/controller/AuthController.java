package com.sampa.app.sampaapp.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

	@PostMapping("/login")
	public String login() {
		return "Login Successful.";
	}

	@PostMapping("/logout")
	public String logout() {
		return "Logged out successfully.";
	}

}
