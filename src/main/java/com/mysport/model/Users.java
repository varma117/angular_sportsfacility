package com.mysport.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document("user")
public class Users {
	@Id
	private String id;
	
	@NotBlank
	@Size(max = 50)
	@Email
	private String email;
	
	@NotBlank
	@Size(max = 120)
	private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Users(@NotBlank @Size(max = 50) @Email String email, @NotBlank @Size(max = 120) String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public Users() {
		super();
	}
	

}
