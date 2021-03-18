package it.objectmethod.worldjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.worldjpa.entity.City;
import it.objectmethod.worldjpa.repository.CityRepository;

@RestController
@RequestMapping("/api/city")

public class CityController {

	@Autowired
	private CityRepository cityRepo;

	@GetMapping("/cityname")
	public City findCityByName(@RequestParam("name") String name) {

		City city = null;
		city = cityRepo.findByName(name);

		return city;
	}

	@RequestMapping("/{countryCode}/list")
	public List<City> findCitiesByCC(@PathVariable("countryCode") String countryCode) {

		List<City> cityList = cityRepo.findByCountryCode(countryCode);
		return cityList;
	}
}
