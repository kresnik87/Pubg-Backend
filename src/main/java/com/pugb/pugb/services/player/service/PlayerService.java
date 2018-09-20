package com.pugb.pugb.services.player.service;

import com.pugb.pugb.controllers.request.PlayerRequest;

public interface PlayerService {

	Boolean exitUser(Long id);

	boolean addPlayer(PlayerRequest playerRequest, String email);

}
