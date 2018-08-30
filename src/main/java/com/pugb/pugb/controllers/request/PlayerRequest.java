package com.pugb.pugb.controllers.request;

public class PlayerRequest {
	
	String links, meta;
	private InfoPlayerRequest[] data;

	public InfoPlayerRequest[] getData() {
		return data;
	}

	public void setData(InfoPlayerRequest[] data) {
		this.data = data;
	}
}

