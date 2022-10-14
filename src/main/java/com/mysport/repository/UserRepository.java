package com.mysport.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mysport.model.Users;
@Repository
public interface UserRepository extends MongoRepository<Users, String> {

	Users findByEmail(String email);

}
