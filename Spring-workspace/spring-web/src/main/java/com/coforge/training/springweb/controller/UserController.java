package com.coforge.training.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
* Author	:Rohit.10.Gupta
* Date 		:Sep 29, 2025
* Time		:10:28:27 AM
* Project	:spring-web
*/

@Controller
public class UserController {

	// ModelMap is a container to hold data with key/values representation
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String userInfo(ModelMap model) {
		model.addAttribute("user", "Rohit");
		model.addAttribute("d" , new java.util.Date());
		return "user";	// returns Model+view
	}
	
	@RequestMapping("/spring")
	public String showSecond()
	{
		return "second";	// returns view
	}
}

