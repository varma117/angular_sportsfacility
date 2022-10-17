package com.mysport.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysport.exceptionhandling.ResourceNotFoundException;
import com.mysport.model.Player;
import com.mysport.model.SportsFacility;
import com.mysport.model.Users;
import com.mysport.repository.PlayerRepository;
import com.mysport.repository.SportsFacilityRepository;
import com.mysport.repository.UserRepository;

@Service
public class PlayerServices {

	@Autowired
	PlayerRepository playerRepo;

	@Autowired
	SportsFacilityRepository facilityRepo;
	
	@Autowired
	UserRepository userRepo;
	
	
	public String registerPlayer(Player player) {
		Player newplayer = playerRepo.save(player);
		Users user = new Users();
		user.setEmail(player.getEmail());
		user.setPassword(player.getPassword());
		userRepo.save(user);
     	return newplayer.getId();

	}

	public String registerSlote(SportsFacility slote) {

		SportsFacility newslote = facilityRepo.save(slote);
		return newslote.getId();

	}

	public List<Player> getPlayers() {
		return playerRepo.findAll();
	}

	public Player updateDetails(Player player, String id) {
		Player updatedDetails = playerRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Player", "id", id));
		updatedDetails.setFirstName(player.getFirstName());
		updatedDetails.setLastName(player.getLastName());
		updatedDetails.setDob(player.getDob());
		updatedDetails.setAddress(player.getAddress());
		updatedDetails.setState(player.getState());
		updatedDetails.setCountry(player.getCountry());
		updatedDetails.setPan(player.getPan());
		updatedDetails.setEmail(player.getEmail());
		updatedDetails.setPassword(player.getPassword());
		updatedDetails.setMobile(player.getMobile());

		playerRepo.save(updatedDetails);

		return updatedDetails;
	}

}
