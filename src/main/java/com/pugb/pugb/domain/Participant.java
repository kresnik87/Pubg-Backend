package com.pugb.pugb.domain;

public class Participant {
	private String id, type, actor, shardId, deathType, name, playerId;
	private Integer DBNOs, assists, boosts, headshotKills, heals, killsPalce, killPoints, killPointsDelta, killStreaks, kills,
			lastKillPoints, lastWinPoints, revives, roadKills, teamKills, vehiculeDestroys, weaponsAcquired, winPlace,
			winPoints;
	private Number damageDealt, longestKill, mostDamage, rideDistance, SwimDistance, teamSurvived, walkDistance, winPointsDelta;

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

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getShardId() {
		return shardId;
	}

	public void setShardId(String shardId) {
		this.shardId = shardId;
	}

	public String getDeathType() {
		return deathType;
	}

	public void setDeathType(String deathType) {
		this.deathType = deathType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

	public Integer getDBNOs() {
		return DBNOs;
	}

	public void setDBNOs(Integer dBNOs) {
		DBNOs = dBNOs;
	}

	public Integer getAssists() {
		return assists;
	}

	public void setAssists(Integer assists) {
		this.assists = assists;
	}

	public Integer getBoosts() {
		return boosts;
	}

	public void setBoosts(Integer boosts) {
		this.boosts = boosts;
	}

	public Integer getHeadshotKills() {
		return headshotKills;
	}

	public void setHeadshotKills(Integer headshotKills) {
		this.headshotKills = headshotKills;
	}

	public Integer getHeals() {
		return heals;
	}

	public void setHeals(Integer heals) {
		this.heals = heals;
	}

	public Integer getKillsPalce() {
		return killsPalce;
	}

	public void setKillsPalce(Integer killsPalce) {
		this.killsPalce = killsPalce;
	}

	public Integer getKillPoints() {
		return killPoints;
	}

	public void setKillPoints(Integer killPoints) {
		this.killPoints = killPoints;
	}

	public Integer getKillPointsDelta() {
		return killPointsDelta;
	}

	public void setKillPointsDelta(Integer killPointsDelta) {
		this.killPointsDelta = killPointsDelta;
	}

	public Integer getKillStreaks() {
		return killStreaks;
	}

	public void setKillStreaks(Integer killStreaks) {
		this.killStreaks = killStreaks;
	}

	public Integer getKills() {
		return kills;
	}

	public void setKills(Integer kills) {
		this.kills = kills;
	}

	public Integer getLastKillPoints() {
		return lastKillPoints;
	}

	public void setLastKillPoints(Integer lastKillPoints) {
		this.lastKillPoints = lastKillPoints;
	}

	public Integer getLastWinPoints() {
		return lastWinPoints;
	}

	public void setLastWinPoints(Integer lastWinPoints) {
		this.lastWinPoints = lastWinPoints;
	}

	public Integer getRevives() {
		return revives;
	}

	public void setRevives(Integer revives) {
		this.revives = revives;
	}

	public Integer getRoadKills() {
		return roadKills;
	}

	public void setRoadKills(Integer roadKills) {
		this.roadKills = roadKills;
	}

	public Integer getTeamKills() {
		return teamKills;
	}

	public void setTeamKills(Integer teamKills) {
		this.teamKills = teamKills;
	}

	public Integer getVehiculeDestroys() {
		return vehiculeDestroys;
	}

	public void setVehiculeDestroys(Integer vehiculeDestroys) {
		this.vehiculeDestroys = vehiculeDestroys;
	}

	public Integer getWeaponsAcquired() {
		return weaponsAcquired;
	}

	public void setWeaponsAcquired(Integer weaponsAcquired) {
		this.weaponsAcquired = weaponsAcquired;
	}

	public Integer getWinPlace() {
		return winPlace;
	}

	public void setWinPlace(Integer winPlace) {
		this.winPlace = winPlace;
	}

	public Integer getWinPoints() {
		return winPoints;
	}

	public void setWinPoints(Integer winPoints) {
		this.winPoints = winPoints;
	}

	public Number getDamageDealt() {
		return damageDealt;
	}

	public void setDamageDealt(Number damageDealt) {
		this.damageDealt = damageDealt;
	}

	public Number getLongestKill() {
		return longestKill;
	}

	public void setLongestKill(Number longestKill) {
		this.longestKill = longestKill;
	}

	public Number getMostDamage() {
		return mostDamage;
	}

	public void setMostDamage(Number mostDamage) {
		this.mostDamage = mostDamage;
	}

	public Number getRideDistance() {
		return rideDistance;
	}

	public void setRideDistance(Number rideDistance) {
		this.rideDistance = rideDistance;
	}

	public Number getSwimDistance() {
		return SwimDistance;
	}

	public void setSwimDistance(Number swimDistance) {
		SwimDistance = swimDistance;
	}

	public Number getTeamSurvived() {
		return teamSurvived;
	}

	public void setTeamSurvived(Number teamSurvived) {
		this.teamSurvived = teamSurvived;
	}

	public Number getWalkDistance() {
		return walkDistance;
	}

	public void setWalkDistance(Number walkDistance) {
		this.walkDistance = walkDistance;
	}

	public Number getWinPointsDelta() {
		return winPointsDelta;
	}

	public void setWinPointsDelta(Number winPointsDelta) {
		this.winPointsDelta = winPointsDelta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DBNOs == null) ? 0 : DBNOs.hashCode());
		result = prime * result + ((SwimDistance == null) ? 0 : SwimDistance.hashCode());
		result = prime * result + ((actor == null) ? 0 : actor.hashCode());
		result = prime * result + ((assists == null) ? 0 : assists.hashCode());
		result = prime * result + ((boosts == null) ? 0 : boosts.hashCode());
		result = prime * result + ((damageDealt == null) ? 0 : damageDealt.hashCode());
		result = prime * result + ((deathType == null) ? 0 : deathType.hashCode());
		result = prime * result + ((headshotKills == null) ? 0 : headshotKills.hashCode());
		result = prime * result + ((heals == null) ? 0 : heals.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((killPoints == null) ? 0 : killPoints.hashCode());
		result = prime * result + ((killPointsDelta == null) ? 0 : killPointsDelta.hashCode());
		result = prime * result + ((killStreaks == null) ? 0 : killStreaks.hashCode());
		result = prime * result + ((kills == null) ? 0 : kills.hashCode());
		result = prime * result + ((killsPalce == null) ? 0 : killsPalce.hashCode());
		result = prime * result + ((lastKillPoints == null) ? 0 : lastKillPoints.hashCode());
		result = prime * result + ((lastWinPoints == null) ? 0 : lastWinPoints.hashCode());
		result = prime * result + ((longestKill == null) ? 0 : longestKill.hashCode());
		result = prime * result + ((mostDamage == null) ? 0 : mostDamage.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((playerId == null) ? 0 : playerId.hashCode());
		result = prime * result + ((revives == null) ? 0 : revives.hashCode());
		result = prime * result + ((rideDistance == null) ? 0 : rideDistance.hashCode());
		result = prime * result + ((roadKills == null) ? 0 : roadKills.hashCode());
		result = prime * result + ((shardId == null) ? 0 : shardId.hashCode());
		result = prime * result + ((teamKills == null) ? 0 : teamKills.hashCode());
		result = prime * result + ((teamSurvived == null) ? 0 : teamSurvived.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((vehiculeDestroys == null) ? 0 : vehiculeDestroys.hashCode());
		result = prime * result + ((walkDistance == null) ? 0 : walkDistance.hashCode());
		result = prime * result + ((weaponsAcquired == null) ? 0 : weaponsAcquired.hashCode());
		result = prime * result + ((winPlace == null) ? 0 : winPlace.hashCode());
		result = prime * result + ((winPoints == null) ? 0 : winPoints.hashCode());
		result = prime * result + ((winPointsDelta == null) ? 0 : winPointsDelta.hashCode());
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
		Participant other = (Participant) obj;
		if (DBNOs == null) {
			if (other.DBNOs != null)
				return false;
		} else if (!DBNOs.equals(other.DBNOs))
			return false;
		if (SwimDistance == null) {
			if (other.SwimDistance != null)
				return false;
		} else if (!SwimDistance.equals(other.SwimDistance))
			return false;
		if (actor == null) {
			if (other.actor != null)
				return false;
		} else if (!actor.equals(other.actor))
			return false;
		if (assists == null) {
			if (other.assists != null)
				return false;
		} else if (!assists.equals(other.assists))
			return false;
		if (boosts == null) {
			if (other.boosts != null)
				return false;
		} else if (!boosts.equals(other.boosts))
			return false;
		if (damageDealt == null) {
			if (other.damageDealt != null)
				return false;
		} else if (!damageDealt.equals(other.damageDealt))
			return false;
		if (deathType == null) {
			if (other.deathType != null)
				return false;
		} else if (!deathType.equals(other.deathType))
			return false;
		if (headshotKills == null) {
			if (other.headshotKills != null)
				return false;
		} else if (!headshotKills.equals(other.headshotKills))
			return false;
		if (heals == null) {
			if (other.heals != null)
				return false;
		} else if (!heals.equals(other.heals))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (killPoints == null) {
			if (other.killPoints != null)
				return false;
		} else if (!killPoints.equals(other.killPoints))
			return false;
		if (killPointsDelta == null) {
			if (other.killPointsDelta != null)
				return false;
		} else if (!killPointsDelta.equals(other.killPointsDelta))
			return false;
		if (killStreaks == null) {
			if (other.killStreaks != null)
				return false;
		} else if (!killStreaks.equals(other.killStreaks))
			return false;
		if (kills == null) {
			if (other.kills != null)
				return false;
		} else if (!kills.equals(other.kills))
			return false;
		if (killsPalce == null) {
			if (other.killsPalce != null)
				return false;
		} else if (!killsPalce.equals(other.killsPalce))
			return false;
		if (lastKillPoints == null) {
			if (other.lastKillPoints != null)
				return false;
		} else if (!lastKillPoints.equals(other.lastKillPoints))
			return false;
		if (lastWinPoints == null) {
			if (other.lastWinPoints != null)
				return false;
		} else if (!lastWinPoints.equals(other.lastWinPoints))
			return false;
		if (longestKill == null) {
			if (other.longestKill != null)
				return false;
		} else if (!longestKill.equals(other.longestKill))
			return false;
		if (mostDamage == null) {
			if (other.mostDamage != null)
				return false;
		} else if (!mostDamage.equals(other.mostDamage))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (playerId == null) {
			if (other.playerId != null)
				return false;
		} else if (!playerId.equals(other.playerId))
			return false;
		if (revives == null) {
			if (other.revives != null)
				return false;
		} else if (!revives.equals(other.revives))
			return false;
		if (rideDistance == null) {
			if (other.rideDistance != null)
				return false;
		} else if (!rideDistance.equals(other.rideDistance))
			return false;
		if (roadKills == null) {
			if (other.roadKills != null)
				return false;
		} else if (!roadKills.equals(other.roadKills))
			return false;
		if (shardId == null) {
			if (other.shardId != null)
				return false;
		} else if (!shardId.equals(other.shardId))
			return false;
		if (teamKills == null) {
			if (other.teamKills != null)
				return false;
		} else if (!teamKills.equals(other.teamKills))
			return false;
		if (teamSurvived == null) {
			if (other.teamSurvived != null)
				return false;
		} else if (!teamSurvived.equals(other.teamSurvived))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (vehiculeDestroys == null) {
			if (other.vehiculeDestroys != null)
				return false;
		} else if (!vehiculeDestroys.equals(other.vehiculeDestroys))
			return false;
		if (walkDistance == null) {
			if (other.walkDistance != null)
				return false;
		} else if (!walkDistance.equals(other.walkDistance))
			return false;
		if (weaponsAcquired == null) {
			if (other.weaponsAcquired != null)
				return false;
		} else if (!weaponsAcquired.equals(other.weaponsAcquired))
			return false;
		if (winPlace == null) {
			if (other.winPlace != null)
				return false;
		} else if (!winPlace.equals(other.winPlace))
			return false;
		if (winPoints == null) {
			if (other.winPoints != null)
				return false;
		} else if (!winPoints.equals(other.winPoints))
			return false;
		if (winPointsDelta == null) {
			if (other.winPointsDelta != null)
				return false;
		} else if (!winPointsDelta.equals(other.winPointsDelta))
			return false;
		return true;
	}

}
