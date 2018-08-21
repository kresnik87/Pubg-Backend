package com.pugb.pugb.services.user.service;

import com.pugb.pugb.controllers.request.UserRequest;
import com.pugb.pugb.domain.User;
import com.pugb.pugb.services.user.dto.UserPlayerDto;

public interface UserService {

	UserPlayerDto login(String email);

	Boolean findPlayer(UserRequest userRequest);

}
