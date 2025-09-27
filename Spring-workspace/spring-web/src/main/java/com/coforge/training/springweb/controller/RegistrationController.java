package com.coforge.training.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.coforge.training.springweb.model.User;

/**
* Author	:Rohit.10.Gupta
* Date 		:Sep 27, 2025
* Time		:3:48:01 PM
* Project	:spring-web
*/

@Controller
public class RegistrationController {

	// Load Registration form
	
	@GetMapping("/userRegistration")
	public String ShowRegisterForm(Model theModel) {
		
		theModel.addAttribute("user", new User());
		
		return "userRegistration";	// returns view+model
	}
	
	
	// Submit Registration form
	@PostMapping("/saveUser")
	public String submitForm(@ModelAttribute("user") User user, Model model) {
		model.addAttribute("user", user);	// Pass user to success page
		return "success";
	}
	
	
	// View Registration details
	
}

