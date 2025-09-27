package com.coforge.training.springcore.model;

/**
* Author	:Rohit.10.Gupta
* Date 		:Sep 27, 2025
* Time		:10:38:33 AM
* Project	:spring-core
* 
* Bean class with dependent Object of type Address - Loosely coupled class using XML Configuration
*/

public class Person {

	private int id;
	private String name;
	private Address address; // has-a relationship - Address Object
	
	// Generate only setters
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	 public void display() {
			System.out.println("********** Person Information **************");
			System.out.println(this.id+" "+this.name);
			System.out.println(address);//toString() method of Address class
		}
}

