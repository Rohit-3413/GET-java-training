package com.coforge.training.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.coforge.training.springweb.model.Reservation;

/**
* Author	:Rohit.10.Gupta
* Date 		:Sep 29, 2025
* Time		:11:00:56 AM
* Project	:spring-web
*/

@Controller
public class ReservationController {
	
	@GetMapping("/reservation")
	public String bookingForm(Model theModel) {
		Reservation res= new Reservation();
		theModel.addAttribute("reserve", res); 
		return "reservation"; //it has reservation obj/attribute
	}
	
	@PostMapping("/submitForm")  
	public String submitForm(@ModelAttribute("reserve") Reservation res)  
	{  
	    return "confirmationForm";  //reserve object is in the view
	}  
}

