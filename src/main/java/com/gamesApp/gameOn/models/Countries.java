package com.gamesApp.gameOn.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Countries {
	@Id
	private String countryCode;
	private String country;
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}
