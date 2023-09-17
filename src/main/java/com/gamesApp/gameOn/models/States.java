package com.gamesApp.gameOn.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class States {
	
	@Id
	private String stateCode;
	private String state;
	private String countryCode;
	
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	

}
