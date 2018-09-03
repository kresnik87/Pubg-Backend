package com.pugb.pugb.services.player.service;

import com.pugb.pugb.controllers.request.InfoPlayerRequest;
import com.pugb.pugb.services.player.dto.PlayerDto;
import com.pugb.pugb.services.player.dto.SavePlayerDto;

public interface PlayerService {

	Boolean exitUser(String id);

	SavePlayerDto savePlayer(InfoPlayerRequest infoPlayerRequest);

	PlayerDto getPlayer(String playerId);

}
