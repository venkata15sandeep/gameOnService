package com.gamesApp.gameOn.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gamesApp.gameOn.models.UserDetails;
import com.gamesApp.gameOn.repositories.UserDetailsRepo;
import com.gamesApp.gameOn.requests.LoginRequest;
import com.gamesApp.gameOn.requests.RegisterRequest;

@Service
public class UserDetailsService {
	
	@Autowired
	UserDetailsRepo userDetailsrepo;
	
	public String registrationService(RegisterRequest registerRequest) {
		Optional<UserDetails> r = this.userDetailsrepo.findById(registerRequest.getUserName());
		if(r != null && r.isPresent()) {
			return "user already exists";
		}
		UserDetails u = new UserDetails();
		u.setUser_name(registerRequest.getUserName());
		u.setFirst_name(registerRequest.getFirstName());
		u.setLast_name(registerRequest.getLastName());
		u.setDob(registerRequest.getDob());
		u.setPassword(registerRequest.getPassword());
		userDetailsrepo.save(u);
		return "saved successful";
	}
	
	public String loginService(LoginRequest loginRequest) {
		Optional<UserDetails> ud = this.userDetailsrepo.findById(loginRequest.getUserName());
		if(ud != null && ud.isPresent()) {
			if(ud.get().getPassword().equals(loginRequest.getPassword())) {
				return "login Success";
			}else {
				return "Invalid password";
			}
		}else {
			return "user dose't exist please register";
		}
	}
}
