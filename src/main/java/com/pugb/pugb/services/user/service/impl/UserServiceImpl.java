package com.pugb.pugb.services.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pugb.pugb.domain.User;
import com.pugb.pugb.services.user.assembler.UserAssembler;
import com.pugb.pugb.services.user.dto.UserPlayerDto;
import com.pugb.pugb.services.user.repositories.UserRepository;
import com.pugb.pugb.services.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserPlayerDto login(String email) {
		User user = new User();
		user.setEmail(email);
		
		if(userRepository.findByEmail(email).isPresent()) {
			user.setPlayer(userRepository.findByEmail(email).get().getPlayer());
			return UserAssembler.UserPlayerDto(user);
		}
		
		userRepository.save(user);

		return UserAssembler.UserPlayerDto(user);
	}
}
