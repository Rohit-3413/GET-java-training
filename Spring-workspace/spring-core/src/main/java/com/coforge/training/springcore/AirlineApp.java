package com.coforge.training.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.coforge.training.springcore.model.Airline;

/**
* Author	:Rohit.10.Gupta
* Date 		:Sep 27, 2025
* Time		:10:09:53 AM
* Project	:spring-core
* 
* Spring App for DI using Annotation Configuration and Component Scan
* to get Airline bean from AirlineService class using Constructor DI
*/

public class AirlineApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AirlineConfig.class);
		
		AirlineService service = context.getBean(AirlineService.class);
		Airline airline = service.getSampleAirline();
		
		AirlineService service1 = context.getBean(AirlineService.class);
		Airline airline1 = service1.getSampleAirline1();
		
		airline.display();
		airline1.display();
		
		context.close();
	}
}

