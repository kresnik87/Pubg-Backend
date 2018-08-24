package com.pugb.pugb.controllers.request;

public class SeasonRequest {
	
	String links, meta;
	private InfoSeason[] data;
	
	public String getLinks() {
		return links;
	}
	public void setLinks(String links) {
		this.links = links;
	}
	public String getMeta() {
		return meta;
	}
	public void setMeta(String meta) {
		this.meta = meta;
	}
	public InfoSeason[] getData() {
		return data;
	}
	public void setData(InfoSeason[] data) {
		this.data = data;
	}
	
}

class InfoSeason {
	
	private String id, type;

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
	
}

class InfoAttributesSeason {
	
	boolean isCurrentSeason, isOffseason;

	public boolean isCurrentSeason() {
		return isCurrentSeason;
	}

	public void setCurrentSeason(boolean isCurrentSeason) {
		this.isCurrentSeason = isCurrentSeason;
	}

	public boolean isOffseason() {
		return isOffseason;
	}

	public void setOffseason(boolean isOffseason) {
		this.isOffseason = isOffseason;
	}
	
}
