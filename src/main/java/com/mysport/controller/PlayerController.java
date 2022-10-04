package com.mysport.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mysport.model.Player;
import com.mysport.services.PlayerServices;

@RestController
public class PlayerController {

	@Autowired
	private PlayerServices playerService;

	@PostMapping("/registerplayer")
	public String savePlayer(@RequestBody Player player) {
		playerService.registerPlayer(player);
		return "Player registered";
	}

	@GetMapping("/getplayers")
	public List<Player> getPlayers() {
		return playerService.getPlayers();
	}

}
