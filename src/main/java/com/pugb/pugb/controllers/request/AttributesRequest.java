package com.pugb.pugb.controllers.request;

import java.util.Date;

import com.pugb.pugb.domain.enumerator.GameModeEnum;

public class AttributesRequest {

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
