package com.pugb.pugb.controllers.request;

import java.util.List;

public class SeasonRequest {

	private String links, meta;
	List<SeasonData> data;
	
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

	public List<SeasonData> getData() {
		return data;
	}

	public void setData(List<SeasonData> data) {
		this.data = data;
	}

	public class SeasonData{
		private String id, type;
		private InfoAttributes attributes;
		
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
		public InfoAttributes getAttributes() {
			return attributes;
		}
		public void setAttributes(InfoAttributes attributes) {
			this.attributes = attributes;
		}
	}
	
	public class InfoAttributes {
		private boolean isCurrentSeason, isOffseason;

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
}
