package com.pugb.pugb.controllers.request;

import com.pugb.pugb.domain.Player;

public class UserRequest {
	
	private Long id;
	private String email;
	private Player player;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	
	
}
