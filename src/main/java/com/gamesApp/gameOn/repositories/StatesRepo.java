package com.gamesApp.gameOn.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.gamesApp.gameOn.models.States;

public interface StatesRepo extends CrudRepository<States, String>{
	
	@Query("select s.state from States s where s.countryCode=:countryCode")
	public List<String> findByCountryCode(@Param("countryCode") String countryCode);
}
