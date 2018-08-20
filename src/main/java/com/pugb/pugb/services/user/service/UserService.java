package com.pugb.pugb.services.user.service;

import com.pugb.pugb.controllers.request.UserRequest;
import com.pugb.pugb.domain.User;

public interface UserService {

	User login(String email);

	Boolean findPlayer(UserRequest userRequest);

}
