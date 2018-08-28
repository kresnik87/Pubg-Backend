package com.pugb.pugb.controllers.request;

public class InfoSeasonRequest {

	private String type, id;
	// private InfoSeason[] data;
	private InfoAttributesSeason attributes;

	public InfoAttributesSeason getAttributes() {
		return attributes;
	}

	public void setAttributes(InfoAttributesSeason attributes) {
		this.attributes = attributes;
	}

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

	public boolean getIsCurrentSeason() {
		return this.attributes.isCurrentSeason();
	}

	public boolean getIsOffseason() {
		return this.attributes.isOffseason();
	}

	public class InfoAttributesSeason {

		boolean isCurrentSeason, isOffseason;

		public boolean isCurrentSeason() {
			return isCurrentSeason;
		}

		public void setIsCurrentSeason(boolean isCurrentSeason) {
			this.isCurrentSeason = isCurrentSeason;
		}

		public boolean isOffseason() {
			return isOffseason;
		}

		public void setIsOffseason(boolean isOffseason) {
			this.isOffseason = isOffseason;
		}

	}
}
