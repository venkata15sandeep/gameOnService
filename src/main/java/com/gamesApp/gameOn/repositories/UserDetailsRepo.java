package com.gamesApp.gameOn.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.gamesApp.gameOn.models.UserDetails;

public interface UserDetailsRepo extends CrudRepository<UserDetails,String>{
	public Optional<UserDetails> findById(String user_name);
}
