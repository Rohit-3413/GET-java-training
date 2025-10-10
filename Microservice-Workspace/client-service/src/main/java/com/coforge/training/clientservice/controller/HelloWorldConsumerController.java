package com.coforge.training.clientservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.training.helloservice.model.Employee;

@RestController
public class HelloWorldConsumerController {
	private final HelloClient helloClient;

	public HelloWorldConsumerController(HelloClient helloClient) {
		this.helloClient = helloClient;
	}
	
	// open browser or postman, http://localhost:8091/get-hello
	@GetMapping("/get-hello")
	private String getMethodName() {
		return helloClient.getHello();
	}
	

@GetMapping("/test")
	public String getMethodName1() {
		return helloClient.myMethod();
		
}
@GetMapping("/employees")
public List<Employee> getEmployees(){
	return helloClient.getEmployees();
}
}
		