package com.coforge.training.springcore.model;

/**
* Author	:Rohit.10.Gupta
* Date 		:Sep 27, 2025
* Time		:10:36:52 AM
* Project	:spring-core
* 
* Setter Injection with dependent Object - XML Configuration
*/

public class Address {
	
	private String addressLine1,city,state,country;
	

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	// toString() method
	@Override
	public String toString() {
		return "Address [addressLine1=" + addressLine1 + ", city=" + city + ", state=" + state + ", country=" + country
				+ "]";
	}
}

