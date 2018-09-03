package com.pugb.pugb.services.player.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pugb.pugb.domain.Player;
@Repository
public interface PlayerRepository extends CrudRepository<Player, String> {

}
