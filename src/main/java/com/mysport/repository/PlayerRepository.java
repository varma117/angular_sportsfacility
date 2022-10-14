package com.mysport.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mysport.model.Player;
@Repository
public interface PlayerRepository extends MongoRepository<Player, String>{

	Player findByEmail(String email);

}
