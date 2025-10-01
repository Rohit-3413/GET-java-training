package com.coforge.training.producthive.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.training.producthive.exception.ResourceNotFoundException;
import com.coforge.training.producthive.model.Product;
import com.coforge.training.producthive.service.ProductService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


/**
* Author	:Rohit.10.Gupta
* Date 		:Oct 1, 2025
* Time		:11:54:04 AM
* Project	:pms-restapi
*/

@RestController
@RequestMapping(value="/api")	// Base URL for this controllers endpoints.
public class ProductController {

	//Field Dependency Injection
	@Autowired
	private ProductService pservice;
	
	/*
	 * In Spring Boot, a Response Entity is a class that helps in returning a response to a HTTP request. 
	 * It's part of the Spring Framework and is used to simplify the process of returning HTTP responses. 
	 * 
	 * A ResponseEntity typically includes the HTTP status code, headers, and a body. 
	 * This can be a JSON or XML response, or even a simple string. 
	 * ResponseEntity is a powerful and flexible way to return responses from a Spring Boot application, 
	 * making it easy to manage HTTP communication and handle errors.
	 * 
	 * @RequestBody annotation automatically deserializes the JSON into a Java type
	 * 
	 * @Validated annotation is a tool that helps validate the data being passed to a controller method. 
	 */
	
	//Open PostMan, make a POST Request - http://localhost:8088/producthive/api/products
		//Select body -> raw -> JSON 
		//Insert JSON product object.
	@PostMapping("/products")
	public ResponseEntity<Product> saveProduct(@Validated @RequestBody Product product) {
		
		try {
			Product p = pservice.saveProduct(product);	// Invokes method in service layer
			return ResponseEntity.status(HttpStatus.CREATED).body(p);
		}
		catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
		
	}
	
	//Open PostMan/Browser, make a GET Request - http://localhost:8088/producthive/api/products
		@GetMapping("/products")
		public ResponseEntity<List<Product>> getAllProducts(){
			try {
				List<Product> products=pservice.listAll();//Invoke listAll() service method
				return ResponseEntity.ok(products);
			}
			catch(Exception e) {
				e.printStackTrace();
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
			}
		}
		
		//Open PostMan/Browser, make a GET Request - http://localhost:8088/producthive/api/products/1004
		//Exception handling is done with Custom Exceptions
		@GetMapping("/products/{pid}")
		public ResponseEntity<Product> getProductById(@PathVariable(value="pid") Long pId) 
				throws ResourceNotFoundException{

			Product p=pservice.getSingleProduct(pId).orElseThrow(() ->
			new  ResourceNotFoundException("Product Not Found for this Id : "+pId));

			return ResponseEntity.ok(p);
		}

	
}

