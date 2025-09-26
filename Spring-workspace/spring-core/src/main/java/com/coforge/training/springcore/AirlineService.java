package com.coforge.training.springcore;

import org.springframework.stereotype.Component;

import com.coforge.training.springcore.model.Airline;

/**
* Author	:Rohit.10.Gupta
* Date 		:Sep 26, 2025
* Time		:4:51:28 PM
* Project	:spring-core
*/

@Component
public class AirlineService {

	public Airline getSimpleAirline() {
		return new Airline("AirIndia", 101, "India");
	}
	
}

