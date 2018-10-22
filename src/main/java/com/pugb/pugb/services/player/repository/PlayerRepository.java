package com.pugb.pugb.services.player.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pugb.pugb.domain.Player;
@Repository
public interface PlayerRepository extends CrudRepository<Player, String> {
	
	public List<Player> findByName(String name);
	
	
	public List<Player> findByShardId(String shardId);
	

}
