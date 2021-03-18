package it.objectmethod.worldjpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import it.objectmethod.worldjpa.entity.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

	@Query(value = "select c from Country c where ( '' like ?1 OR c.name like ?1 ) and ( '' = ?2 or c.continent = ?2)")
	public List<Country> findByCountry(String nameCountry, String continent);

	@Query(value = "select distinct c.continent from Country c")
	public List<String> findDistinctByContinent();

}
