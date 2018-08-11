package com.pugb.pugb.domain;

import java.util.List;

import com.pugb.pugb.domain.enumerator.GameModeEnum;
import com.pugb.pugb.domain.enumerator.MapNameEnum;

public class Matches {
	String id, type, createAt, titleId, patchVersion, shardId;
	GameModeEnum gameMode;
	MapNameEnum mapName;
	Integer duration;
	Boolean isCustomMatch;
	List<String> stats, tags;

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

	public String getCreateAt() {
		return createAt;
	}

	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}

	public String getTitleId() {
		return titleId;
	}

	public void setTitleId(String titleId) {
		this.titleId = titleId;
	}

	public String getPatchVersion() {
		return patchVersion;
	}

	public void setPatchVersion(String patchVersion) {
		this.patchVersion = patchVersion;
	}

	public String getShardId() {
		return shardId;
	}

	public void setShardId(String shardId) {
		this.shardId = shardId;
	}

	public GameModeEnum getGameMode() {
		return gameMode;
	}

	public void setGameMode(GameModeEnum gameMode) {
		this.gameMode = gameMode;
	}

	public MapNameEnum getMapName() {
		return mapName;
	}

	public void setMapName(MapNameEnum mapName) {
		this.mapName = mapName;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Boolean getIsCustomMatch() {
		return isCustomMatch;
	}

	public void setIsCustomMatch(Boolean isCustomMatch) {
		this.isCustomMatch = isCustomMatch;
	}

	public List<String> getStats() {
		return stats;
	}

	public void setStats(List<String> stats) {
		this.stats = stats;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createAt == null) ? 0 : createAt.hashCode());
		result = prime * result + ((duration == null) ? 0 : duration.hashCode());
		result = prime * result + ((gameMode == null) ? 0 : gameMode.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((isCustomMatch == null) ? 0 : isCustomMatch.hashCode());
		result = prime * result + ((mapName == null) ? 0 : mapName.hashCode());
		result = prime * result + ((patchVersion == null) ? 0 : patchVersion.hashCode());
		result = prime * result + ((shardId == null) ? 0 : shardId.hashCode());
		result = prime * result + ((stats == null) ? 0 : stats.hashCode());
		result = prime * result + ((tags == null) ? 0 : tags.hashCode());
		result = prime * result + ((titleId == null) ? 0 : titleId.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Matches other = (Matches) obj;
		if (createAt == null) {
			if (other.createAt != null)
				return false;
		} else if (!createAt.equals(other.createAt))
			return false;
		if (duration == null) {
			if (other.duration != null)
				return false;
		} else if (!duration.equals(other.duration))
			return false;
		if (gameMode != other.gameMode)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isCustomMatch == null) {
			if (other.isCustomMatch != null)
				return false;
		} else if (!isCustomMatch.equals(other.isCustomMatch))
			return false;
		if (mapName != other.mapName)
			return false;
		if (patchVersion == null) {
			if (other.patchVersion != null)
				return false;
		} else if (!patchVersion.equals(other.patchVersion))
			return false;
		if (shardId == null) {
			if (other.shardId != null)
				return false;
		} else if (!shardId.equals(other.shardId))
			return false;
		if (stats == null) {
			if (other.stats != null)
				return false;
		} else if (!stats.equals(other.stats))
			return false;
		if (tags == null) {
			if (other.tags != null)
				return false;
		} else if (!tags.equals(other.tags))
			return false;
		if (titleId == null) {
			if (other.titleId != null)
				return false;
		} else if (!titleId.equals(other.titleId))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

}
