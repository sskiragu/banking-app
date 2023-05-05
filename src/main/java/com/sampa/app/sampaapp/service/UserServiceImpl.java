package com.sampa.app.sampaapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.sampa.app.sampaapp.model.User;
import com.sampa.app.sampaapp.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder bCryptPasswordEncoder;
	
	@Override
	public User createUser(User user) {
		String encodedPassword = bCryptPasswordEncoder.encode(user.getPassword());
		user.setPassword(encodedPassword);
		return userRepository.save(user);
	}

}
