package com.mysport.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mysport.model.SportsFacility;
@Repository
public interface SportsFacilityRepository  extends MongoRepository<SportsFacility, String>{

	

	//boolean getByDateOfGameAndGameName(Date dateOfGame, String gameName);

	//Boolean getByDateOfGameAndGameName(Date dateOfGame, String gameName);

	Boolean existsByDateOfGameAndGameName(Date dateOfGame, String gameName);

	//boolean existByDateOfGame(Date dateOfGame);
	

	

}
