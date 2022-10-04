package com.mysport.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mysport.model.Role;

public interface RoleRepository extends MongoRepository<Role, String>  {

}
