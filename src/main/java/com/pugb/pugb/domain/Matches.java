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

}
