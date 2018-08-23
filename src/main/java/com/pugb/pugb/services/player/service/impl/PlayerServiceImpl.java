package com.pugb.pugb.services.player.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pugb.pugb.domain.Player;
import com.pugb.pugb.services.player.repository.PlayerRepository;
import com.pugb.pugb.services.player.service.PlayerService;

@Service
public class PlayerServiceImpl implements PlayerService {

	@Autowired
	PlayerRepository playerRepository;

	@Override
	public Boolean exitUser(Long id) {
		Player player = playerRepository.findById(id).get();
		if (player != null) {
			return true;
		} else {
			return false;
		}
	}

}
