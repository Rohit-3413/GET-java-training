package com.coforge.training.clientservice.controller;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.coforge.training.helloservice.model.Employee;



@FeignClient(name="hello-service")
public interface HelloClient {
	
	@GetMapping("/hello")
	String getHello();
	
	@GetMapping("/rohit")
	String myMethod();
	
	@GetMapping("/employees")
	List<Employee> getEmployees();
	
}
