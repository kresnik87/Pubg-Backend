package com.pugb.pugb.services.season.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pugb.pugb.controllers.request.SeasonRequest;
import com.pugb.pugb.domain.Season;
import com.pugb.pugb.services.season.repository.SeasonRepository;
import com.pugb.pugb.services.season.service.SeasonService;

@Service
public class SeasonServiceImpl implements SeasonService {

	@Autowired
	SeasonRepository seasonRepository;

	@Override
	public int getSeasonsCount() {
		List<Season> seasons = (List<Season>) seasonRepository.findAll();
		return seasons.size();
	}

	@Override
	public boolean UpdateSeason(SeasonRequest sr) {
		sr.getListData().forEach(s -> {
			Season season = seasonRepository.getSeason(s.getId());
			if (season == null) {
				season = new Season();
				season.setId(s.getId());
				season.setType(s.getType());
				season.setCurrentSeason(s.getIsCurrentSeason());
				season.setOffseason(s.getIsOffseason());
				seasonRepository.save(season);
			} else {
				season = new Season();
				//season.setId(s.getId());
				season.setType(s.getType());
				seasonRepository.save(season);
				season.setCurrentSeason(s.getIsCurrentSeason());
				season.setOffseason(s.getIsOffseason());
				
			}
		});
		return true;
	}

}
