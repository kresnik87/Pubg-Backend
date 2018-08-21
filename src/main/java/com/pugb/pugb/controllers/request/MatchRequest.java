package com.pugb.pugb.controllers.request;

import com.pugb.pugb.domain.enumerator.TypeEnum;

public class MatchRequest {

	private TypeEnum type;
	private String id;

	public TypeEnum getType() {
		return type;
	}

	public void setType(TypeEnum type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
