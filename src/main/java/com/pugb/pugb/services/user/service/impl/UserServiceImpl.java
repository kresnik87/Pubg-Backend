package com.pugb.pugb.services.user.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pugb.pugb.controllers.request.PlayerRequest;
import com.pugb.pugb.domain.Player;
import com.pugb.pugb.domain.User;
import com.pugb.pugb.services.player.repository.PlayerRepository;
import com.pugb.pugb.services.user.assembler.UserAssembler;
import com.pugb.pugb.services.user.dto.UserPlayerDto;
import com.pugb.pugb.services.user.repository.UserRepository;
import com.pugb.pugb.services.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PlayerRepository playerRepository;

	@Override
	public UserPlayerDto login(String email) {
		User user = new User();
		user.setEmail(email);
		user.setPremium(false);

		if (userRepository.findByEmail(email).isPresent()) {
			User exist = userRepository.findByEmail(email).get();
			return UserAssembler.UserPlayerDto(exist);
		}

		userRepository.save(user);

		return UserAssembler.UserPlayerDto(user);
	}
	
	@Override
	public List<UserPlayerDto> getAllUsers(){
		List<User> users = (List<User>) userRepository.findAll();
		List<UserPlayerDto> dtos = new ArrayList<>();
		users.forEach(e -> {
		UserPlayerDto dto = new UserPlayerDto();
		dto.setUserEmail(e.getEmail());
		dtos.add(dto);});
		return dtos;
	}

}
