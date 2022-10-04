package com.mysport.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mysport.model.Player;

public interface PlayerRepository extends MongoRepository<Player, String>{

}
