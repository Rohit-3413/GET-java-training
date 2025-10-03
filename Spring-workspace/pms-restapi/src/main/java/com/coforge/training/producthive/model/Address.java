package com.coforge.training.producthive.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

/**
* Author	:Rohit.10.Gupta
* Date 		:Oct 3, 2025
* Time		:2:34:55 PM
* Project	:pms-restapi
* 
* Model class for Registration of Users Address fields
*/

@Entity
public class Address {

	@Id  //primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Auto Numbering from 1
    private Long addressId;
	
	private String street;
	private String city;
	private  int pincode;
	
	/* Foreign Key Relationship */
	@OneToOne
	@JoinColumn(name="dealer_id") 	// Foreign Key field
	private Dealer dealer;	// Reference Class Object
	

	
	public Address() {
		super();
	}


	public Address(String street, String city, int pincode) {
		super();
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}


	public Long getAddressId() {
		return addressId;
	}


	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public int getPincode() {
		return pincode;
	}


	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


	public Dealer getDealer() {
		return dealer;
	}


	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}
}

