package com.gamesApp.gameOn.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gamesApp.gameOn.models.Countries;
import com.gamesApp.gameOn.models.UserDetails;
import com.gamesApp.gameOn.repositories.CountriesRepo;
import com.gamesApp.gameOn.repositories.StatesRepo;
import com.gamesApp.gameOn.repositories.UserDetailsRepo;
import com.gamesApp.gameOn.requests.GroupRequest;
import com.gamesApp.gameOn.requests.LoginRequest;
import com.gamesApp.gameOn.requests.RegisterRequest;
import com.gamesApp.gameOn.responses.MasterResponse;
import com.gamesApp.gameOn.services.DashboardServices;
import com.gamesApp.gameOn.services.UserDetailsService;


@RestController
public class userController {
	
	
	@Autowired
	UserDetailsService userDetailsService;
	@Autowired
	DashboardServices dashboardService;
	@Autowired
	CountriesRepo countriesRepo;
	@Autowired
	StatesRepo statesRepo;
	@RequestMapping("login")
	public String login(@RequestBody LoginRequest loginRequest) {
		
		loginRequest.getUserName();
		loginRequest.getPassword();
		
		String response = this.userDetailsService.loginService(loginRequest);
		
		return response;
	}
	
	@RequestMapping("register") 
	public String register(@RequestBody RegisterRequest registerRequest) {
		String response=this.userDetailsService.registrationService(registerRequest);
		return response;
	}
	
	@RequestMapping(value="getCountries", method = RequestMethod.GET)
	public List<String> countries() {
		List<Countries> cl=(List<Countries>) countriesRepo.findAll();
		List<String> res = new ArrayList<String>();
		cl.forEach((Country)->{
			res.add(Country.getCountry());
		});
		return res;
	}
	
	@RequestMapping(value="geStates", method = RequestMethod.GET)
	public List<String> states(@RequestParam String country) {
		List<String> res= new ArrayList<String>();
		res=statesRepo.findByCountryCode(country);
		return res; 
	}
	
	@RequestMapping("saveGroupDetails")
	public String saveGroupDetails(@RequestBody GroupRequest groupRequest) {
		String res=this.dashboardService.saveDetails(groupRequest); 
		return res;
	}
	
}
