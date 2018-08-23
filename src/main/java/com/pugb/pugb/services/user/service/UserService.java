package com.pugb.pugb.services.user.service;

import java.util.List;

import com.pugb.pugb.services.user.dto.UserPlayerDto;

public interface UserService {

	UserPlayerDto login(String email);

	boolean addPlayer(String playerName, String shardId, String email);

	List<UserPlayerDto> getAllUsers();

}
