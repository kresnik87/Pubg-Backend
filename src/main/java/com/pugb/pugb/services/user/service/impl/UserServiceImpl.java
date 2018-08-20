package com.pugb.pugb.services.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pugb.pugb.domain.User;
import com.pugb.pugb.services.user.repositories.UserRepository;
import com.pugb.pugb.services.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	public boolean existUser(String email) {
		if (userRepository.findByEmail(email).get() != null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public User login(String email) {
		if (existUser(email)) {
			return userRepository.findByEmail(email).get();
		}
		User user = new User();
		user.setEmail(email);
		userRepository.save(user);

		return user;
	}
}
