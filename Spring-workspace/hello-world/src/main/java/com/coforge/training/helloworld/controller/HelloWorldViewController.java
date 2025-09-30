package com.coforge.training.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



/**
* Author	:Rohit.10.Gupta
* Date 		:Sep 29, 2025
* Time		:3:09:25 PM
* Project	:hello-world
*/

@Controller
public class HelloWorldViewController {

	// Open Browser -- http://localhost:8082/myweb/rohit
	@GetMapping("/rohit")
	public String getMethodName(Model m) {
		
		m.addAttribute("name", "Rohit Gupta");
		m.addAttribute("city", "Mumbai");
		m.addAttribute("country", "India");
		m.addAttribute("hello", "Hello from Spring Boot using JSP views");
		
		return "welcome";	// welcome.jsp
	}
}

