package com.pugb.pugb.services.user.assembler;

import com.pugb.pugb.domain.User;
import com.pugb.pugb.services.user.dto.UserPlayerDto;

public class UserAssembler {
	
	public static UserPlayerDto UserPlayerDto(User user) {
		UserPlayerDto dto = new UserPlayerDto();
		
		dto.setUserEmail(user.getEmail());
		dto.setPlayers(user.getPlayers());
		
		return dto;
	}

}
