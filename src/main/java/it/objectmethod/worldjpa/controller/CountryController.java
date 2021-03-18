package it.objectmethod.worldjpa.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import it.objectmethod.worldjpa.entity.Country;
import it.objectmethod.worldjpa.repository.CountryRepository;

@RestController
@RequestMapping("/api/country")

public class CountryController {

	@Autowired
	private CountryRepository countryRepo;

	@GetMapping("/countryc")
	public List<Country> findCountry(@RequestParam("nameCountry") String nameCountry,
			@RequestParam("continent") String continent) {

		List<Country> countryList = new ArrayList<>();

		countryList = countryRepo.findByCountry(nameCountry, continent);
		return countryList;
	}

	@GetMapping("/continents")
	public List<String> setContinent() {

		List<String> continents = new ArrayList<>();

		continents = countryRepo.findDistinctByContinent();
		return continents;
	}

}
