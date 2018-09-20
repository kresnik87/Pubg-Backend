package com.pugb.pugb.services.season.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pugb.pugb.domain.Season;

@Repository
public interface SeasonRepository extends CrudRepository<Season, Long>{
	
	@Query("SELECT s FROM Season s WHERE s.id = ?1")
	public Season getSeason(String id);
	
	/*
	@Query("SELECT s FROM Season s WHERE s.isCurrentSeason = true")
	public Season seasonTrue();
	*/
	
	public List<Season> findByType(String type);

}
