package com.pugb.pugb.services.player.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pugb.pugb.controllers.request.PlayerRequest;
import com.pugb.pugb.domain.Player;
import com.pugb.pugb.domain.User;
import com.pugb.pugb.services.player.dto.PlayerDto;
import com.pugb.pugb.services.player.repository.PlayerRepository;
import com.pugb.pugb.services.player.service.PlayerService;
import com.pugb.pugb.services.user.repository.UserRepository;

@Service
public class PlayerServiceImpl implements PlayerService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PlayerRepository playerRepository;

	@Override
	public Boolean exitUser(String id) {
		Player player = playerRepository.findById(id).get();
		if (player != null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean addPlayer(PlayerRequest playerRequest, String email) {
		User user = new User();
		user.setEmail(email);

		Player player = new Player();
		player.setName(playerRequest.getData().get(0).getAttributes().getName());
		player.setShardId(playerRequest.getData().get(0).getAttributes().getShardId());

		if (userRepository.findByEmail(email).isPresent()) {
			User u = userRepository.findByEmail(email).get();
			if (!u.getPlayers().isEmpty()) {
				u.getPlayers().add(player);
				playerRepository.save(player);
				return true;
			}
		}
		return false;
	}

	@Override
	public PlayerDto getPlayer(String playerId) {
		Player player = playerRepository.findById(playerId).get();
		PlayerDto dto = new PlayerDto();
		dto.setName(player.getName());
		dto.setPlayerid(player.getPlayerid());
		dto.setShardId(player.getShardId());
		return dto;
	}
	
	
	
	

}

