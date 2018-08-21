package com.pugb.pugb.services.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pugb.pugb.controllers.request.UserRequest;
import com.pugb.pugb.domain.User;
import com.pugb.pugb.services.player.service.PlayerService;
import com.pugb.pugb.services.user.assembler.UserAssembler;
import com.pugb.pugb.services.user.dto.UserPlayerDto;
import com.pugb.pugb.services.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private com.pugb.pugb.services.user.repositoriy.UserRepository userRepository;
	
	@Autowired
	private PlayerService playerService; 

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
	
	@Override
	public Boolean findPlayer(UserRequest userRequest) {		
		return playerService.exitUser(userRequest.getPlayer().getId());
	}

	
}
