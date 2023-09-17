package com.gamesApp.gameOn.responses;

import java.util.List;

import com.gamesApp.gameOn.models.Countries;
import com.gamesApp.gameOn.models.States;

public class MasterResponse {
	private List<Countries> countries;
	private List<States> states;
	public List<Countries> getCountries() {
		return countries;
	}
	public void setCountries(List<Countries> countries) {
		this.countries = countries;
	}
	public List<States> getStates() {
		return states;
	}
	public void setStates(List<States> states) {
		this.states = states;
	}
	
}
