package com.pugb.pugb.controllers.request;

public class PlayerSeasonRequest {
	
	String links, meta;
	InfoPlayerSeason[] data;
	
}

class InfoPlayerSeason {
	
	String type;
	InfoAttributesPlayerSeason[] attributes;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public InfoAttributesPlayerSeason[] getAttributes() {
		return attributes;
	}
	public void setAttributes(InfoAttributesPlayerSeason[] attributes) {
		this.attributes = attributes;
	}
	
}

class InfoAttributesPlayerSeason {
	
	InfoGameModeStatsPlayerSeason[] gameModeStats;

	public InfoGameModeStatsPlayerSeason[] getGameModeStats() {
		return gameModeStats;
	}

	public void setGameModeStats(InfoGameModeStatsPlayerSeason[] gameModeStats) {
		this.gameModeStats = gameModeStats;
	}
}

class InfoGameModeStatsPlayerSeason {
	InfoDuo[] Dou;
	InfoDuoFpp[] douFpp;
	InfoSolo[] solo;
	InfoSoloFpp[] soloFpp;
	InfoSquad[] squad;
	InfoSquadFpp[] squadFpp;
	
	public InfoDuo[] getDou() {
		return Dou;
	}
	public void setDou(InfoDuo[] dou) {
		Dou = dou;
	}
	public InfoDuoFpp[] getDouFpp() {
		return douFpp;
	}
	public void setDouFpp(InfoDuoFpp[] douFpp) {
		this.douFpp = douFpp;
	}
	public InfoSolo[] getSolo() {
		return solo;
	}
	public void setSolo(InfoSolo[] solo) {
		this.solo = solo;
	}
	public InfoSoloFpp[] getSoloFpp() {
		return soloFpp;
	}
	public void setSoloFpp(InfoSoloFpp[] soloFpp) {
		this.soloFpp = soloFpp;
	}
	public InfoSquad[] getSquad() {
		return squad;
	}
	public void setSquad(InfoSquad[] squad) {
		this.squad = squad;
	}
	public InfoSquadFpp[] getSquadFpp() {
		return squadFpp;
	}
	public void setSquadFpp(InfoSquadFpp[] squadFpp) {
		this.squadFpp = squadFpp;
	}
}

class InfoDuo {
	int assists, boosts, dBNOs, dailyKills, damageDealt, days, headshotKills, heals, killPoints, kills, longestKill, longestTimeSurvived, 
    	losses, maxKillStreaks, mostSurvivalTime, revives, rideDistance, roadKills, roundMostKills, roundsPlayed, suicides, teamKills, 
    	timeSurvived, top10s, vehicleDestroys, walkDistance, weaponsAcquired, weeklyKills, winPoints, wins;

	public int getAssists() {
		return assists;
	}

	public void setAssists(int assists) {
		this.assists = assists;
	}

	public int getBoosts() {
		return boosts;
	}

	public void setBoosts(int boosts) {
		this.boosts = boosts;
	}

	public int getdBNOs() {
		return dBNOs;
	}

	public void setdBNOs(int dBNOs) {
		this.dBNOs = dBNOs;
	}

	public int getDailyKills() {
		return dailyKills;
	}

	public void setDailyKills(int dailyKills) {
		this.dailyKills = dailyKills;
	}

	public int getDamageDealt() {
		return damageDealt;
	}

	public void setDamageDealt(int damageDealt) {
		this.damageDealt = damageDealt;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public int getHeadshotKills() {
		return headshotKills;
	}

	public void setHeadshotKills(int headshotKills) {
		this.headshotKills = headshotKills;
	}

	public int getHeals() {
		return heals;
	}

	public void setHeals(int heals) {
		this.heals = heals;
	}

	public int getKillPoints() {
		return killPoints;
	}

	public void setKillPoints(int killPoints) {
		this.killPoints = killPoints;
	}

	public int getKills() {
		return kills;
	}

	public void setKills(int kills) {
		this.kills = kills;
	}

	public int getLongestKill() {
		return longestKill;
	}

	public void setLongestKill(int longestKill) {
		this.longestKill = longestKill;
	}

	public int getLongestTimeSurvived() {
		return longestTimeSurvived;
	}

	public void setLongestTimeSurvived(int longestTimeSurvived) {
		this.longestTimeSurvived = longestTimeSurvived;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}

	public int getMaxKillStreaks() {
		return maxKillStreaks;
	}

	public void setMaxKillStreaks(int maxKillStreaks) {
		this.maxKillStreaks = maxKillStreaks;
	}

	public int getMostSurvivalTime() {
		return mostSurvivalTime;
	}

	public void setMostSurvivalTime(int mostSurvivalTime) {
		this.mostSurvivalTime = mostSurvivalTime;
	}

	public int getRevives() {
		return revives;
	}

	public void setRevives(int revives) {
		this.revives = revives;
	}

	public int getRideDistance() {
		return rideDistance;
	}

	public void setRideDistance(int rideDistance) {
		this.rideDistance = rideDistance;
	}

	public int getRoadKills() {
		return roadKills;
	}

	public void setRoadKills(int roadKills) {
		this.roadKills = roadKills;
	}

	public int getRoundMostKills() {
		return roundMostKills;
	}

	public void setRoundMostKills(int roundMostKills) {
		this.roundMostKills = roundMostKills;
	}

	public int getRoundsPlayed() {
		return roundsPlayed;
	}

	public void setRoundsPlayed(int roundsPlayed) {
		this.roundsPlayed = roundsPlayed;
	}

	public int getSuicides() {
		return suicides;
	}

	public void setSuicides(int suicides) {
		this.suicides = suicides;
	}

	public int getTeamKills() {
		return teamKills;
	}

	public void setTeamKills(int teamKills) {
		this.teamKills = teamKills;
	}

	public int getTimeSurvived() {
		return timeSurvived;
	}

	public void setTimeSurvived(int timeSurvived) {
		this.timeSurvived = timeSurvived;
	}

	public int getTop10s() {
		return top10s;
	}

	public void setTop10s(int top10s) {
		this.top10s = top10s;
	}

	public int getVehicleDestroys() {
		return vehicleDestroys;
	}

	public void setVehicleDestroys(int vehicleDestroys) {
		this.vehicleDestroys = vehicleDestroys;
	}

	public int getWalkDistance() {
		return walkDistance;
	}

	public void setWalkDistance(int walkDistance) {
		this.walkDistance = walkDistance;
	}

	public int getWeaponsAcquired() {
		return weaponsAcquired;
	}

	public void setWeaponsAcquired(int weaponsAcquired) {
		this.weaponsAcquired = weaponsAcquired;
	}

	public int getWeeklyKills() {
		return weeklyKills;
	}

	public void setWeeklyKills(int weeklyKills) {
		this.weeklyKills = weeklyKills;
	}

	public int getWinPoints() {
		return winPoints;
	}

	public void setWinPoints(int winPoints) {
		this.winPoints = winPoints;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}
	
}

class InfoDuoFpp{
	int assists, boosts, dBNOs, dailyKills, damageDealt, days, headshotKills, heals, killPoints, kills, longestKill, longestTimeSurvived, 
	losses, maxKillStreaks, mostSurvivalTime, revives, rideDistance, roadKills, roundMostKills, roundsPlayed, suicides, teamKills, 
	timeSurvived, top10s, vehicleDestroys, walkDistance, weaponsAcquired, weeklyKills, winPoints, wins;

	public int getAssists() {
		return assists;
	}

	public void setAssists(int assists) {
		this.assists = assists;
	}

	public int getBoosts() {
		return boosts;
	}

	public void setBoosts(int boosts) {
		this.boosts = boosts;
	}

	public int getdBNOs() {
		return dBNOs;
	}

	public void setdBNOs(int dBNOs) {
		this.dBNOs = dBNOs;
	}

	public int getDailyKills() {
		return dailyKills;
	}

	public void setDailyKills(int dailyKills) {
		this.dailyKills = dailyKills;
	}

	public int getDamageDealt() {
		return damageDealt;
	}

	public void setDamageDealt(int damageDealt) {
		this.damageDealt = damageDealt;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public int getHeadshotKills() {
		return headshotKills;
	}

	public void setHeadshotKills(int headshotKills) {
		this.headshotKills = headshotKills;
	}

	public int getHeals() {
		return heals;
	}

	public void setHeals(int heals) {
		this.heals = heals;
	}

	public int getKillPoints() {
		return killPoints;
	}

	public void setKillPoints(int killPoints) {
		this.killPoints = killPoints;
	}

	public int getKills() {
		return kills;
	}

	public void setKills(int kills) {
		this.kills = kills;
	}

	public int getLongestKill() {
		return longestKill;
	}

	public void setLongestKill(int longestKill) {
		this.longestKill = longestKill;
	}

	public int getLongestTimeSurvived() {
		return longestTimeSurvived;
	}

	public void setLongestTimeSurvived(int longestTimeSurvived) {
		this.longestTimeSurvived = longestTimeSurvived;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}

	public int getMaxKillStreaks() {
		return maxKillStreaks;
	}

	public void setMaxKillStreaks(int maxKillStreaks) {
		this.maxKillStreaks = maxKillStreaks;
	}

	public int getMostSurvivalTime() {
		return mostSurvivalTime;
	}

	public void setMostSurvivalTime(int mostSurvivalTime) {
		this.mostSurvivalTime = mostSurvivalTime;
	}

	public int getRevives() {
		return revives;
	}

	public void setRevives(int revives) {
		this.revives = revives;
	}

	public int getRideDistance() {
		return rideDistance;
	}

	public void setRideDistance(int rideDistance) {
		this.rideDistance = rideDistance;
	}

	public int getRoadKills() {
		return roadKills;
	}

	public void setRoadKills(int roadKills) {
		this.roadKills = roadKills;
	}

	public int getRoundMostKills() {
		return roundMostKills;
	}

	public void setRoundMostKills(int roundMostKills) {
		this.roundMostKills = roundMostKills;
	}

	public int getRoundsPlayed() {
		return roundsPlayed;
	}

	public void setRoundsPlayed(int roundsPlayed) {
		this.roundsPlayed = roundsPlayed;
	}

	public int getSuicides() {
		return suicides;
	}

	public void setSuicides(int suicides) {
		this.suicides = suicides;
	}

	public int getTeamKills() {
		return teamKills;
	}

	public void setTeamKills(int teamKills) {
		this.teamKills = teamKills;
	}

	public int getTimeSurvived() {
		return timeSurvived;
	}

	public void setTimeSurvived(int timeSurvived) {
		this.timeSurvived = timeSurvived;
	}

	public int getTop10s() {
		return top10s;
	}

	public void setTop10s(int top10s) {
		this.top10s = top10s;
	}

	public int getVehicleDestroys() {
		return vehicleDestroys;
	}

	public void setVehicleDestroys(int vehicleDestroys) {
		this.vehicleDestroys = vehicleDestroys;
	}

	public int getWalkDistance() {
		return walkDistance;
	}

	public void setWalkDistance(int walkDistance) {
		this.walkDistance = walkDistance;
	}

	public int getWeaponsAcquired() {
		return weaponsAcquired;
	}

	public void setWeaponsAcquired(int weaponsAcquired) {
		this.weaponsAcquired = weaponsAcquired;
	}

	public int getWeeklyKills() {
		return weeklyKills;
	}

	public void setWeeklyKills(int weeklyKills) {
		this.weeklyKills = weeklyKills;
	}

	public int getWinPoints() {
		return winPoints;
	}

	public void setWinPoints(int winPoints) {
		this.winPoints = winPoints;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}
	
}

class InfoSolo {
	int assists, boosts, dBNOs, dailyKills, damageDealt, days, headshotKills, heals, killPoints, kills, longestKill, longestTimeSurvived, 
	losses, maxKillStreaks, mostSurvivalTime, revives, rideDistance, roadKills, roundMostKills, roundsPlayed, suicides, teamKills, 
	timeSurvived, top10s, vehicleDestroys, walkDistance, weaponsAcquired, weeklyKills, winPoints, wins;

	public int getAssists() {
		return assists;
	}

	public void setAssists(int assists) {
		this.assists = assists;
	}

	public int getBoosts() {
		return boosts;
	}

	public void setBoosts(int boosts) {
		this.boosts = boosts;
	}

	public int getdBNOs() {
		return dBNOs;
	}

	public void setdBNOs(int dBNOs) {
		this.dBNOs = dBNOs;
	}

	public int getDailyKills() {
		return dailyKills;
	}

	public void setDailyKills(int dailyKills) {
		this.dailyKills = dailyKills;
	}

	public int getDamageDealt() {
		return damageDealt;
	}

	public void setDamageDealt(int damageDealt) {
		this.damageDealt = damageDealt;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public int getHeadshotKills() {
		return headshotKills;
	}

	public void setHeadshotKills(int headshotKills) {
		this.headshotKills = headshotKills;
	}

	public int getHeals() {
		return heals;
	}

	public void setHeals(int heals) {
		this.heals = heals;
	}

	public int getKillPoints() {
		return killPoints;
	}

	public void setKillPoints(int killPoints) {
		this.killPoints = killPoints;
	}

	public int getKills() {
		return kills;
	}

	public void setKills(int kills) {
		this.kills = kills;
	}

	public int getLongestKill() {
		return longestKill;
	}

	public void setLongestKill(int longestKill) {
		this.longestKill = longestKill;
	}

	public int getLongestTimeSurvived() {
		return longestTimeSurvived;
	}

	public void setLongestTimeSurvived(int longestTimeSurvived) {
		this.longestTimeSurvived = longestTimeSurvived;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}

	public int getMaxKillStreaks() {
		return maxKillStreaks;
	}

	public void setMaxKillStreaks(int maxKillStreaks) {
		this.maxKillStreaks = maxKillStreaks;
	}

	public int getMostSurvivalTime() {
		return mostSurvivalTime;
	}

	public void setMostSurvivalTime(int mostSurvivalTime) {
		this.mostSurvivalTime = mostSurvivalTime;
	}

	public int getRevives() {
		return revives;
	}

	public void setRevives(int revives) {
		this.revives = revives;
	}

	public int getRideDistance() {
		return rideDistance;
	}

	public void setRideDistance(int rideDistance) {
		this.rideDistance = rideDistance;
	}

	public int getRoadKills() {
		return roadKills;
	}

	public void setRoadKills(int roadKills) {
		this.roadKills = roadKills;
	}

	public int getRoundMostKills() {
		return roundMostKills;
	}

	public void setRoundMostKills(int roundMostKills) {
		this.roundMostKills = roundMostKills;
	}

	public int getRoundsPlayed() {
		return roundsPlayed;
	}

	public void setRoundsPlayed(int roundsPlayed) {
		this.roundsPlayed = roundsPlayed;
	}

	public int getSuicides() {
		return suicides;
	}

	public void setSuicides(int suicides) {
		this.suicides = suicides;
	}

	public int getTeamKills() {
		return teamKills;
	}

	public void setTeamKills(int teamKills) {
		this.teamKills = teamKills;
	}

	public int getTimeSurvived() {
		return timeSurvived;
	}

	public void setTimeSurvived(int timeSurvived) {
		this.timeSurvived = timeSurvived;
	}

	public int getTop10s() {
		return top10s;
	}

	public void setTop10s(int top10s) {
		this.top10s = top10s;
	}

	public int getVehicleDestroys() {
		return vehicleDestroys;
	}

	public void setVehicleDestroys(int vehicleDestroys) {
		this.vehicleDestroys = vehicleDestroys;
	}

	public int getWalkDistance() {
		return walkDistance;
	}

	public void setWalkDistance(int walkDistance) {
		this.walkDistance = walkDistance;
	}

	public int getWeaponsAcquired() {
		return weaponsAcquired;
	}

	public void setWeaponsAcquired(int weaponsAcquired) {
		this.weaponsAcquired = weaponsAcquired;
	}

	public int getWeeklyKills() {
		return weeklyKills;
	}

	public void setWeeklyKills(int weeklyKills) {
		this.weeklyKills = weeklyKills;
	}

	public int getWinPoints() {
		return winPoints;
	}

	public void setWinPoints(int winPoints) {
		this.winPoints = winPoints;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}
	
}

class InfoSoloFpp {
	int assists, boosts, dBNOs, dailyKills, damageDealt, days, headshotKills, heals, killPoints, kills, longestKill, longestTimeSurvived, 
	losses, maxKillStreaks, mostSurvivalTime, revives, rideDistance, roadKills, roundMostKills, roundsPlayed, suicides, teamKills, 
	timeSurvived, top10s, vehicleDestroys, walkDistance, weaponsAcquired, weeklyKills, winPoints, wins;

	public int getAssists() {
		return assists;
	}

	public void setAssists(int assists) {
		this.assists = assists;
	}

	public int getBoosts() {
		return boosts;
	}

	public void setBoosts(int boosts) {
		this.boosts = boosts;
	}

	public int getdBNOs() {
		return dBNOs;
	}

	public void setdBNOs(int dBNOs) {
		this.dBNOs = dBNOs;
	}

	public int getDailyKills() {
		return dailyKills;
	}

	public void setDailyKills(int dailyKills) {
		this.dailyKills = dailyKills;
	}

	public int getDamageDealt() {
		return damageDealt;
	}

	public void setDamageDealt(int damageDealt) {
		this.damageDealt = damageDealt;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public int getHeadshotKills() {
		return headshotKills;
	}

	public void setHeadshotKills(int headshotKills) {
		this.headshotKills = headshotKills;
	}

	public int getHeals() {
		return heals;
	}

	public void setHeals(int heals) {
		this.heals = heals;
	}

	public int getKillPoints() {
		return killPoints;
	}

	public void setKillPoints(int killPoints) {
		this.killPoints = killPoints;
	}

	public int getKills() {
		return kills;
	}

	public void setKills(int kills) {
		this.kills = kills;
	}

	public int getLongestKill() {
		return longestKill;
	}

	public void setLongestKill(int longestKill) {
		this.longestKill = longestKill;
	}

	public int getLongestTimeSurvived() {
		return longestTimeSurvived;
	}

	public void setLongestTimeSurvived(int longestTimeSurvived) {
		this.longestTimeSurvived = longestTimeSurvived;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}

	public int getMaxKillStreaks() {
		return maxKillStreaks;
	}

	public void setMaxKillStreaks(int maxKillStreaks) {
		this.maxKillStreaks = maxKillStreaks;
	}

	public int getMostSurvivalTime() {
		return mostSurvivalTime;
	}

	public void setMostSurvivalTime(int mostSurvivalTime) {
		this.mostSurvivalTime = mostSurvivalTime;
	}

	public int getRevives() {
		return revives;
	}

	public void setRevives(int revives) {
		this.revives = revives;
	}

	public int getRideDistance() {
		return rideDistance;
	}

	public void setRideDistance(int rideDistance) {
		this.rideDistance = rideDistance;
	}

	public int getRoadKills() {
		return roadKills;
	}

	public void setRoadKills(int roadKills) {
		this.roadKills = roadKills;
	}

	public int getRoundMostKills() {
		return roundMostKills;
	}

	public void setRoundMostKills(int roundMostKills) {
		this.roundMostKills = roundMostKills;
	}

	public int getRoundsPlayed() {
		return roundsPlayed;
	}

	public void setRoundsPlayed(int roundsPlayed) {
		this.roundsPlayed = roundsPlayed;
	}

	public int getSuicides() {
		return suicides;
	}

	public void setSuicides(int suicides) {
		this.suicides = suicides;
	}

	public int getTeamKills() {
		return teamKills;
	}

	public void setTeamKills(int teamKills) {
		this.teamKills = teamKills;
	}

	public int getTimeSurvived() {
		return timeSurvived;
	}

	public void setTimeSurvived(int timeSurvived) {
		this.timeSurvived = timeSurvived;
	}

	public int getTop10s() {
		return top10s;
	}

	public void setTop10s(int top10s) {
		this.top10s = top10s;
	}

	public int getVehicleDestroys() {
		return vehicleDestroys;
	}

	public void setVehicleDestroys(int vehicleDestroys) {
		this.vehicleDestroys = vehicleDestroys;
	}

	public int getWalkDistance() {
		return walkDistance;
	}

	public void setWalkDistance(int walkDistance) {
		this.walkDistance = walkDistance;
	}

	public int getWeaponsAcquired() {
		return weaponsAcquired;
	}

	public void setWeaponsAcquired(int weaponsAcquired) {
		this.weaponsAcquired = weaponsAcquired;
	}

	public int getWeeklyKills() {
		return weeklyKills;
	}

	public void setWeeklyKills(int weeklyKills) {
		this.weeklyKills = weeklyKills;
	}

	public int getWinPoints() {
		return winPoints;
	}

	public void setWinPoints(int winPoints) {
		this.winPoints = winPoints;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}
	
}

class InfoSquad {
	int assists, boosts, dBNOs, dailyKills, damageDealt, days, headshotKills, heals, killPoints, kills, longestKill, longestTimeSurvived, 
	losses, maxKillStreaks, mostSurvivalTime, revives, rideDistance, roadKills, roundMostKills, roundsPlayed, suicides, teamKills, 
	timeSurvived, top10s, vehicleDestroys, walkDistance, weaponsAcquired, weeklyKills, winPoints, wins;

	public int getAssists() {
		return assists;
	}

	public void setAssists(int assists) {
		this.assists = assists;
	}

	public int getBoosts() {
		return boosts;
	}

	public void setBoosts(int boosts) {
		this.boosts = boosts;
	}

	public int getdBNOs() {
		return dBNOs;
	}

	public void setdBNOs(int dBNOs) {
		this.dBNOs = dBNOs;
	}

	public int getDailyKills() {
		return dailyKills;
	}

	public void setDailyKills(int dailyKills) {
		this.dailyKills = dailyKills;
	}

	public int getDamageDealt() {
		return damageDealt;
	}

	public void setDamageDealt(int damageDealt) {
		this.damageDealt = damageDealt;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public int getHeadshotKills() {
		return headshotKills;
	}

	public void setHeadshotKills(int headshotKills) {
		this.headshotKills = headshotKills;
	}

	public int getHeals() {
		return heals;
	}

	public void setHeals(int heals) {
		this.heals = heals;
	}

	public int getKillPoints() {
		return killPoints;
	}

	public void setKillPoints(int killPoints) {
		this.killPoints = killPoints;
	}

	public int getKills() {
		return kills;
	}

	public void setKills(int kills) {
		this.kills = kills;
	}

	public int getLongestKill() {
		return longestKill;
	}

	public void setLongestKill(int longestKill) {
		this.longestKill = longestKill;
	}

	public int getLongestTimeSurvived() {
		return longestTimeSurvived;
	}

	public void setLongestTimeSurvived(int longestTimeSurvived) {
		this.longestTimeSurvived = longestTimeSurvived;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}

	public int getMaxKillStreaks() {
		return maxKillStreaks;
	}

	public void setMaxKillStreaks(int maxKillStreaks) {
		this.maxKillStreaks = maxKillStreaks;
	}

	public int getMostSurvivalTime() {
		return mostSurvivalTime;
	}

	public void setMostSurvivalTime(int mostSurvivalTime) {
		this.mostSurvivalTime = mostSurvivalTime;
	}

	public int getRevives() {
		return revives;
	}

	public void setRevives(int revives) {
		this.revives = revives;
	}

	public int getRideDistance() {
		return rideDistance;
	}

	public void setRideDistance(int rideDistance) {
		this.rideDistance = rideDistance;
	}

	public int getRoadKills() {
		return roadKills;
	}

	public void setRoadKills(int roadKills) {
		this.roadKills = roadKills;
	}

	public int getRoundMostKills() {
		return roundMostKills;
	}

	public void setRoundMostKills(int roundMostKills) {
		this.roundMostKills = roundMostKills;
	}

	public int getRoundsPlayed() {
		return roundsPlayed;
	}

	public void setRoundsPlayed(int roundsPlayed) {
		this.roundsPlayed = roundsPlayed;
	}

	public int getSuicides() {
		return suicides;
	}

	public void setSuicides(int suicides) {
		this.suicides = suicides;
	}

	public int getTeamKills() {
		return teamKills;
	}

	public void setTeamKills(int teamKills) {
		this.teamKills = teamKills;
	}

	public int getTimeSurvived() {
		return timeSurvived;
	}

	public void setTimeSurvived(int timeSurvived) {
		this.timeSurvived = timeSurvived;
	}

	public int getTop10s() {
		return top10s;
	}

	public void setTop10s(int top10s) {
		this.top10s = top10s;
	}

	public int getVehicleDestroys() {
		return vehicleDestroys;
	}

	public void setVehicleDestroys(int vehicleDestroys) {
		this.vehicleDestroys = vehicleDestroys;
	}

	public int getWalkDistance() {
		return walkDistance;
	}

	public void setWalkDistance(int walkDistance) {
		this.walkDistance = walkDistance;
	}

	public int getWeaponsAcquired() {
		return weaponsAcquired;
	}

	public void setWeaponsAcquired(int weaponsAcquired) {
		this.weaponsAcquired = weaponsAcquired;
	}

	public int getWeeklyKills() {
		return weeklyKills;
	}

	public void setWeeklyKills(int weeklyKills) {
		this.weeklyKills = weeklyKills;
	}

	public int getWinPoints() {
		return winPoints;
	}

	public void setWinPoints(int winPoints) {
		this.winPoints = winPoints;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}
	
}

class InfoSquadFpp {
	int assists, boosts, dBNOs, dailyKills, damageDealt, days, headshotKills, heals, killPoints, kills, longestKill, longestTimeSurvived, 
	losses, maxKillStreaks, mostSurvivalTime, revives, rideDistance, roadKills, roundMostKills, roundsPlayed, suicides, teamKills, 
	timeSurvived, top10s, vehicleDestroys, walkDistance, weaponsAcquired, weeklyKills, winPoints, wins;

	public int getAssists() {
		return assists;
	}

	public void setAssists(int assists) {
		this.assists = assists;
	}

	public int getBoosts() {
		return boosts;
	}

	public void setBoosts(int boosts) {
		this.boosts = boosts;
	}

	public int getdBNOs() {
		return dBNOs;
	}

	public void setdBNOs(int dBNOs) {
		this.dBNOs = dBNOs;
	}

	public int getDailyKills() {
		return dailyKills;
	}

	public void setDailyKills(int dailyKills) {
		this.dailyKills = dailyKills;
	}

	public int getDamageDealt() {
		return damageDealt;
	}

	public void setDamageDealt(int damageDealt) {
		this.damageDealt = damageDealt;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public int getHeadshotKills() {
		return headshotKills;
	}

	public void setHeadshotKills(int headshotKills) {
		this.headshotKills = headshotKills;
	}

	public int getHeals() {
		return heals;
	}

	public void setHeals(int heals) {
		this.heals = heals;
	}

	public int getKillPoints() {
		return killPoints;
	}

	public void setKillPoints(int killPoints) {
		this.killPoints = killPoints;
	}

	public int getKills() {
		return kills;
	}

	public void setKills(int kills) {
		this.kills = kills;
	}

	public int getLongestKill() {
		return longestKill;
	}

	public void setLongestKill(int longestKill) {
		this.longestKill = longestKill;
	}

	public int getLongestTimeSurvived() {
		return longestTimeSurvived;
	}

	public void setLongestTimeSurvived(int longestTimeSurvived) {
		this.longestTimeSurvived = longestTimeSurvived;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}

	public int getMaxKillStreaks() {
		return maxKillStreaks;
	}

	public void setMaxKillStreaks(int maxKillStreaks) {
		this.maxKillStreaks = maxKillStreaks;
	}

	public int getMostSurvivalTime() {
		return mostSurvivalTime;
	}

	public void setMostSurvivalTime(int mostSurvivalTime) {
		this.mostSurvivalTime = mostSurvivalTime;
	}

	public int getRevives() {
		return revives;
	}

	public void setRevives(int revives) {
		this.revives = revives;
	}

	public int getRideDistance() {
		return rideDistance;
	}

	public void setRideDistance(int rideDistance) {
		this.rideDistance = rideDistance;
	}

	public int getRoadKills() {
		return roadKills;
	}

	public void setRoadKills(int roadKills) {
		this.roadKills = roadKills;
	}

	public int getRoundMostKills() {
		return roundMostKills;
	}

	public void setRoundMostKills(int roundMostKills) {
		this.roundMostKills = roundMostKills;
	}

	public int getRoundsPlayed() {
		return roundsPlayed;
	}

	public void setRoundsPlayed(int roundsPlayed) {
		this.roundsPlayed = roundsPlayed;
	}

	public int getSuicides() {
		return suicides;
	}

	public void setSuicides(int suicides) {
		this.suicides = suicides;
	}

	public int getTeamKills() {
		return teamKills;
	}

	public void setTeamKills(int teamKills) {
		this.teamKills = teamKills;
	}

	public int getTimeSurvived() {
		return timeSurvived;
	}

	public void setTimeSurvived(int timeSurvived) {
		this.timeSurvived = timeSurvived;
	}

	public int getTop10s() {
		return top10s;
	}

	public void setTop10s(int top10s) {
		this.top10s = top10s;
	}

	public int getVehicleDestroys() {
		return vehicleDestroys;
	}

	public void setVehicleDestroys(int vehicleDestroys) {
		this.vehicleDestroys = vehicleDestroys;
	}

	public int getWalkDistance() {
		return walkDistance;
	}

	public void setWalkDistance(int walkDistance) {
		this.walkDistance = walkDistance;
	}

	public int getWeaponsAcquired() {
		return weaponsAcquired;
	}

	public void setWeaponsAcquired(int weaponsAcquired) {
		this.weaponsAcquired = weaponsAcquired;
	}

	public int getWeeklyKills() {
		return weeklyKills;
	}

	public void setWeeklyKills(int weeklyKills) {
		this.weeklyKills = weeklyKills;
	}

	public int getWinPoints() {
		return winPoints;
	}

	public void setWinPoints(int winPoints) {
		this.winPoints = winPoints;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}
	
}