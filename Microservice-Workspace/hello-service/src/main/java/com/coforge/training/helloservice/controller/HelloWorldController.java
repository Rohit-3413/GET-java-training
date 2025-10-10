package com.coforge.training.helloservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.training.helloservice.model.Employee;

@RestController
public class HelloWorldController {

	 @GetMapping("/hello")
	    public String sayHello() {
	        return "Hello from Hello World MicroService! 😍😍";
	    }
		
		
		@GetMapping("/rohit")
	    public String sayHello1() {
	        return "Hello from Rohit! 😍😍";
	    }
		
	   @GetMapping("/employees")
	   public List<Employee>  getEmployees() {
		   
		   Employee emp1=new Employee(101, "James Gosling", 7777.00);
		   Employee emp2=new Employee(102, "Gavin King", 8888.00);
		   Employee emp3=new Employee(103, "Rod Johnson", 9999.00);
		   Employee emp4=new Employee(104, "Jeurgen Hauler", 9999.00);
		   Employee emp5=new Employee(105, "Martin Flower",11111.00);
		   
		   List<Employee> employees=new ArrayList<>();
		   
		   employees.add(emp1);employees.add(emp2);employees.add(emp3);
		   employees.add(emp4);employees.add(emp5);
		   
		   
	       return employees;
	   }
}
