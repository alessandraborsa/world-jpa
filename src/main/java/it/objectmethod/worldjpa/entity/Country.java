package it.objectmethod.worldjpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country")
public class Country {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private String code;

	@Column(name = "Name")
	private String name;

	@Column(name = "Continent")
	private String continent;

	@Column(name = "Population")
	private Integer population;

	@Column(name = "SurfaceArea")
	private Integer surfaceArea;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public Integer getPopulation() {
		return population;
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}

	public Integer getSurfaceArea() {
		return surfaceArea;
	}

	public void setSurfaceArea(Integer surfaceArea) {
		this.surfaceArea = surfaceArea;
	}
}
