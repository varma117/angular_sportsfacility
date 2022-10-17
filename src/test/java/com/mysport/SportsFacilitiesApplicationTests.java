package com.mysport;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Date;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.mysport.model.Player;
import com.mysport.model.SportsFacility;
import com.mysport.repository.PlayerRepository;
import com.mysport.repository.SportsFacilityRepository;
import com.mysport.services.PlayerServices;

@SpringBootTest
class SportsFacilitiesApplicationTests {

	@Autowired
	PlayerServices playerService;

	@MockBean
	private PlayerRepository playerRepo;

	@MockBean
	private SportsFacilityRepository facilityRepo;

	@Test
	public void getPlayersTest() {

		when(playerRepo.findAll()).thenReturn(Stream.of(new Player("id", "fname", "lname", new Date(), "addre", "state",
				"country", "pan", "email", "passw", "mobile")).collect(Collectors.toList()));
		assertEquals(1, playerService.getPlayers().size());
	}

	@Test
	public void savePlayerTest() {
		Player player = new Player("id", "fname", "lname", new Date(), "address", "satate", "country", "email",
				"password", "mobile", "pan");
		when(playerRepo.save(player)).thenReturn(player);
		assertEquals(player.getId(), playerService.registerPlayer(player));

	}

	@Test
	public void saveFacilityTest() {
		SportsFacility facility = new SportsFacility("id", "ftname", "ltname", new Date(), new Date(), "gamename");
		when(facilityRepo.save(facility)).thenReturn(facility);
		assertEquals(facility.getId(), playerService.registerSlote(facility));
	}

	@Test
	void contextLoads() {
	}

}
