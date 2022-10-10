package com.mysport.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("roles")
public class Role {
	@Id
	private String id;
	
	private  UserRole name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public UserRole getName() {
		return name;
	}

	public void setName(UserRole name) {
		this.name = name;
	}

	public Role( UserRole name) {
		super();
		
		this.name = name;
	}

	public Role() {
		super();
	}
	
	
	

}
