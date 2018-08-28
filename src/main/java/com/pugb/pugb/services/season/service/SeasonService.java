package com.pugb.pugb.services.season.service;

import com.pugb.pugb.controllers.request.SeasonRequest;

public interface SeasonService {

	boolean UpdateSeason(SeasonRequest sr);
	
	int getSeasonsCount();
}
