package com.pugb.pugb.services.player.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pugb.pugb.controllers.request.InfoPlayerRequest;
import com.pugb.pugb.controllers.request.PlayerRequest;
import com.pugb.pugb.domain.Player;
import com.pugb.pugb.services.player.dto.SavePlayerDto;
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

	@Override
	public SavePlayerDto savePlayer(InfoPlayerRequest infoPlayerRequest) {
		Player player = new Player();
		player.setName(infoPlayerRequest.getType());
		player.setPlayerid(infoPlayerRequest.getId());
		player.setShardId(infoPlayerRequest.getshardId());
		
		player = playerRepository.save(player);
		
		SavePlayerDto dto =  new SavePlayerDto();
		
		dto.setId(player.getPlayerid());
		dto.setType(player.getName());
		return dto;
	}

}
