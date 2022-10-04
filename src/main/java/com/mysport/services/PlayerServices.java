package com.mysport.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysport.model.Player;
import com.mysport.repository.PlayerRepository;

@Service
public class PlayerServices {

	@Autowired
	PlayerRepository playerRepo;

	public String registerPlayer(Player player) {
		Player newplayer = playerRepo.save(player);
		return newplayer.getId();

	}

	public List<Player> getPlayers() {
		return playerRepo.findAll();
	}
}
