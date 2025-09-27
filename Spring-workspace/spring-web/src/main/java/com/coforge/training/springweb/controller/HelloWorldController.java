package com.coforge.training.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
* Author	:Rohit.10.Gupta
* Date 		:Sep 27, 2025
* Time		:2:30:46 PM
* Project	:spring-web
*/

@Controller
public class HelloWorldController {

	@GetMapping("/rohit")	// Mapping URL of the request to the method
	public String sayHello() {
		return "hello";		// returns hello.jsp
	}
	
	/* Work Flow of Spring MVC Application
	 * 
	 * Client --> Request(index.jsp) --> FrontController(Web.xml)
	 * 		-->Controller(HelloWorldController) ---> response(hello.jsp)
	 */
	
	@GetMapping("/noida")	// Mapping URL of the request to the method
	public String sayHello1() {
		return "noida";		// returns noida.jsp
	}
}

