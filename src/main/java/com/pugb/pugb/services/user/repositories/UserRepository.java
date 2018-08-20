package com.pugb.pugb.services.user.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pugb.pugb.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	
	Optional<User> findByEmail(String email);
}
