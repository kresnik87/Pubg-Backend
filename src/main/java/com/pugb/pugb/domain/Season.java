package com.pugb.pugb.domain;

public class Season {
	String id, type;
	Boolean isCurrentSeason, isOffSeason;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getIsCurrentSeason() {
		return isCurrentSeason;
	}

	public void setIsCurrentSeason(Boolean isCurrentSeason) {
		this.isCurrentSeason = isCurrentSeason;
	}

	public Boolean getIsOffSeason() {
		return isOffSeason;
	}

	public void setIsOffSeason(Boolean isOffSeason) {
		this.isOffSeason = isOffSeason;
	}

}
