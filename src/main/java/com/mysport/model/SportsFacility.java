package com.mysport.model;

import java.util.Date;

import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("allocations")
public class SportsFacility {
	
	@Id
	private String id;

	@NotBlank
	private String firstName;

	@NotBlank
	private String lastName;

	@NotBlank
	private Date dob;
	
	@NotBlank
	private Date dateOfGame;
	
	@NotBlank
	private String gameName;
	
//	@NotBlank
//	@DateTimeFormat(style = "hh:mm")
//	@JsonDeserialize(using = TimeDeserializer.class)
//	private Time timeOfGame;

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getDateOfGame() {
		return dateOfGame;
	}

	public void setDateOfGame(Date dateOfGame) {
		this.dateOfGame = dateOfGame;
	}

//	public Time getTimeOfGame() {
//		return timeOfGame;
//	}
//
//	public void setTimeOfGame(Time timeOfGame) {
//		this.timeOfGame = timeOfGame;
//	}

	

	public SportsFacility() {
		super();
	}

	public SportsFacility(String id, @NotBlank String firstName, @NotBlank String lastName, @NotBlank Date dob,
			@NotBlank Date dateOfGame, @NotBlank String gameName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.dateOfGame = dateOfGame;
		this.gameName = gameName;
	}
	
	
}
