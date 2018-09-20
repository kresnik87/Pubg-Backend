package com.pugb.pugb.controllers.request;

import java.util.Date;
import java.util.List;

import com.pugb.pugb.domain.enumerator.GameModeEnum;
import com.pugb.pugb.domain.enumerator.TypeEnum;

public class PlayerRequest {

	String links, meta;
	private List<InfoPlayer> data;

	public List<InfoPlayer> getData() {
		return data;
	}

	public void setData(List<InfoPlayer> data) {
		this.data = data;
	}

<<<<<<< HEAD
class InfoPlayer {
	private String id, type;
	private InfoAttributesPlayer attributes;
	private InfoRelationShipsPlayer relationships;
=======
	public class InfoPlayer {
		private String id, type;
		private InfoAttributes attributes;
		private InfoRelationShips relationships;
>>>>>>> refs/remotes/origin/Security

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

		public InfoRelationShips getRelationships() {
			return relationships;
		}

		public void setRelationships(InfoRelationShips relationships) {
			this.relationships = relationships;
		}
	}

	public class InfoAttributes {

		private Date createdAt, updatedAt;
		private String patchVersion, name, titleId, shardId;
		private GameModeEnum stats;

		public Date getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}

		public Date getUpdatedAt() {
			return updatedAt;
		}

		public void setUpdatedAt(Date updatedAt) {
			this.updatedAt = updatedAt;
		}

		public String getPatchVersion() {
			return patchVersion;
		}

		public void setPatchVersion(String patchVersion) {
			this.patchVersion = patchVersion;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getTitleId() {
			return titleId;
		}

		public void setTitleId(String titleId) {
			this.titleId = titleId;
		}

		public String getShardId() {
			return shardId;
		}

		public void setShardId(String shardId) {
			this.shardId = shardId;
		}

		public GameModeEnum getStats() {
			return stats;
		}

		public void setStats(GameModeEnum stats) {
			this.stats = stats;
		}
	}

<<<<<<< HEAD
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public InfoAttributesPlayer getAttributes() {
		return attributes;
	}

	public void setAttributes(InfoAttributesPlayer attributes) {
		this.attributes = attributes;
	}

	public InfoRelationShipsPlayer getRelationships() {
		return relationships;
	}

	public void setRelationships(InfoRelationShipsPlayer relationships) {
		this.relationships = relationships;
	}
}

class InfoAttributesPlayer {

	private Date createdAt, updatedAt;
	private String patchVersion, name, titleId, shardId;
	private GameModeEnum stats;

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getPatchVersion() {
		return patchVersion;
	}

	public void setPatchVersion(String patchVersion) {
		this.patchVersion = patchVersion;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitleId() {
		return titleId;
	}

	public void setTitleId(String titleId) {
		this.titleId = titleId;
	}

	public String getShardId() {
		return shardId;
	}

	public void setShardId(String shardId) {
		this.shardId = shardId;
	}

	public GameModeEnum getStats() {
		return stats;
	}

	public void setStats(GameModeEnum stats) {
		this.stats = stats;
	}
=======
>>>>>>> refs/remotes/origin/Security
}

<<<<<<< HEAD
class InfoRelationShipsPlayer {
	
	InfoDataMatchesPlayer matches;
=======
class InfoRelationShips {

	InfoDataMatches matches;
>>>>>>> refs/remotes/origin/Security

	public InfoDataMatchesPlayer getMatches() {
		return matches;
	}

	public void setMatches(InfoDataMatchesPlayer matches) {
		this.matches = matches;
	}
}

class InfoDataMatchesPlayer {
	InfoMatchPlayer[] data;

	public InfoMatchPlayer[] getData() {
		return data;
	}

	public void setData(InfoMatchPlayer[] data) {
		this.data = data;
	}
}

class InfoMatchPlayer {
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
