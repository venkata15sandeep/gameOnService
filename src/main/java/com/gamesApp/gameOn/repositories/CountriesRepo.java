package com.gamesApp.gameOn.repositories;

import org.springframework.data.repository.CrudRepository;

import com.gamesApp.gameOn.models.Countries;

public interface CountriesRepo extends CrudRepository<Countries, String>{
	
}
