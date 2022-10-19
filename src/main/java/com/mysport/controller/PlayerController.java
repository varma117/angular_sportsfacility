package com.mysport.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mysport.model.Player;
import com.mysport.model.SportsFacility;
import com.mysport.model.Users;
import com.mysport.repository.SportsFacilityRepository;
import com.mysport.repository.UserRepository;
import com.mysport.services.PlayerServices;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class PlayerController {

	@Autowired
	private PlayerServices playerService;

	@Autowired
	UserRepository userRepo;
	
	

	@PostMapping("/login")
	public ResponseEntity<?> playerLoging(@RequestBody Users user) {

		Users login = userRepo.findByEmail(user.getEmail());
		if (login.getPassword().equals(user.getPassword()))
			return ResponseEntity.ok(login);

		return (ResponseEntity<?>) ResponseEntity.internalServerError();

	}



	@PostMapping("/registerplayer")
	public String savePlayer(@RequestBody Player player) {
		playerService.registerPlayer(player);
		return "Player registered";
	}

	@PostMapping("/registorfacility")
	public String saveFacility(@RequestBody SportsFacility facility) {
		playerService.registerSlote(facility);
		return "facility confirmed ";
	}
	
	@PostMapping("/slotebooking")
	public String slotBooking(@RequestBody SportsFacility facility) {
		String slote = playerService.bookSlot(facility);
		return "slote booked";
	}

	@GetMapping("/getplayers")
	public List<Player> getPlayers() {
		return playerService.getPlayers();
	}
	
	

	@PutMapping("/updatedetails/{id}")
	public ResponseEntity<Player> updatedetails(@PathVariable("id") String id, @RequestBody Player player) {
		return new ResponseEntity<Player>(playerService.updateDetails(player, id), HttpStatus.OK);
	}

}
