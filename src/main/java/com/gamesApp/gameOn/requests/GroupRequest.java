package com.gamesApp.gameOn.requests;

public class GroupRequest {
	private String emailId;
	private String groupID;
	private String groupName;
	private String groupType;
	private int groupSize;
	private String gendersAllowed;
	private String country;
	private String state;
	private String city;
	private String pin;
	private String gLocation;
	
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getGroupID() {
		return groupID;
	}
	public void setGroupID(String groupID) {
		this.groupID = groupID;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getGroupType() {
		return groupType;
	}
	public void setGroupType(String groupType) {
		this.groupType = groupType;
	}
	public int getGroupSize() {
		return groupSize;
	}
	public void setGroupSize(int groupSize) {
		this.groupSize = groupSize;
	}
	public String getGendersAllowed() {
		return gendersAllowed;
	}
	public void setGendersAllowed(String gendersAllowed) {
		this.gendersAllowed = gendersAllowed;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getgLocation() {
		return gLocation;
	}
	public void setgLocation(String gLocation) {
		this.gLocation = gLocation;
	}	
	
}
