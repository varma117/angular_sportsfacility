package com.mysport.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mysport.model.SportsFacility;

public interface SportsFacilityRepository  extends MongoRepository<SportsFacility, String>{

}
