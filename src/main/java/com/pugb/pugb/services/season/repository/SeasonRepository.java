package com.pugb.pugb.services.season.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pugb.pugb.domain.Season;

@Repository
public interface SeasonRepository extends CrudRepository<Season, Long>{

}
