package com.coforge.training.producthive.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.training.producthive.exception.ResourceNotFoundException;
import com.coforge.training.producthive.model.Product;
import com.coforge.training.producthive.service.ProductService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


/**
* Author	:Rohit.10.Gupta
* Date 		:Oct 1, 2025
* Time		:11:54:04 AM
* Project	:pms-restapi
*/
@CrossOrigin(origins = "http://localhost:4200")
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
		
		//Open PostMan, make a PUT Request - http://localhost:8088/producthive/api/products/1004
		//Select body -> raw -> JSON 
		//Update JSON product object with new Values.
		/*
		 * Example JSON for PUT (all fields):
		 * {
	  			"name": "Laptop",
	  			"brand": "Dell",
	  			"price": 55000,
	  			"madein": "USA"
			}
		 */
		
		//@PutMapping -> used for full updates (instead of partial updates with @PatchMapping).
		@PutMapping("/products/{pid}")
		public ResponseEntity<Product> updateProduct(@PathVariable(value="pid") Long pId,
				@Validated @RequestBody Product p) throws ResourceNotFoundException {

			Product product=pservice.getSingleProduct(pId).
					orElseThrow(() -> new ResourceNotFoundException("Product Not Found for this Id :"+pId));
			//Update product with new values
			product.setBrand(p.getBrand());
			product.setMadein(p.getMadein());
			product.setName(p.getName());
			product.setPrice(p.getPrice());

			final Product updatedProduct=pservice.saveProduct(product); // invokes service layer method
			return ResponseEntity.ok().body(updatedProduct);
		}
		
		//Open PostMan, make a PATCH Request - http://localhost:8088/producthive/api/products/1004
		//Select body -> raw -> JSON
		//Update JSON product object with new Values.
		/*
		 * Example JSON for PATCH (only price and madein):
		 * {
	  			"price": 45000,
	  			"madein": "Germany"
			}
		 */
		//@PatchMapping → used for partial updates (instead of full updates with @PutMapping).
		@PatchMapping("/products/{pid}")
		public ResponseEntity<Product> updateProductPriceAndMadein(
		        @PathVariable(value = "pid") Long pId,
		        @Validated @RequestBody Product p) throws ResourceNotFoundException {

		    // Fetch existing product from DB
		    Product product = pservice.getSingleProduct(pId)
		            .orElseThrow(() -> new ResourceNotFoundException("Product Not Found for this Id: " + pId));

		    // Update only price and madein if provided in request
		    if (p.getPrice() != 0.0f) {
		        product.setPrice(p.getPrice());
		    }
		    if (p.getMadein() != null) {
		        product.setMadein(p.getMadein());
		    }

		    // Save updated product
		    final Product updatedProduct = pservice.saveProduct(product);
		    return ResponseEntity.ok().body(updatedProduct);
		}
		
		//Open PostMan, make a DELETE Request - http://localhost:8088/producthive/api/products/1004
		@DeleteMapping("/products/{pid}")
		public ResponseEntity<Map<String,Boolean>> deleteProduct(@PathVariable(value="pid") Long pId) 
				throws ResourceNotFoundException {

			pservice.getSingleProduct(pId).  // invokes service layer method
			orElseThrow(() -> new ResourceNotFoundException("Product Not Found for this Id :"+pId));

			pservice.deleteProduct(pId); // invokes service layer method

			Map<String,Boolean> response=new HashMap<>(); //Map Stores Data in key-value pairs
			response.put("Deleted", Boolean.TRUE);
			
			return ResponseEntity.ok(response);
		}
		
		  /*
		 * In Spring Boot, RequestParam is a standard annotation used to inject request parameters 
		 * from a web request into a controller method. 
		 * It is often used to extract data from HTTP requests, such as form parameters or query parameters. 
		 * When a controller method is annotated with @RequestParam, the method parameter is 
		 * bound to the value of the corresponding request parameter. 
		 * For example, @RequestParam("name") String name would bind the name method parameter to 
		 * the value of the "name" request parameter.
		 * 	
		 * ResponseEntity<?> indicates that the body of the response can be any type, 
		 * making it a generic reusable class.
		 */
		// GET Request - http://localhost:8088/producthive/api/search?name=Lap top
		@GetMapping("/search")
	    public ResponseEntity<?> searchProductsByName(@RequestParam("name") String name) {
	        try {
	            List<Product> products = pservice.searchProductsByName(name);
	            
	            if (products.isEmpty()) {
	                return new ResponseEntity<>("No products found with the given name.", HttpStatus.NOT_FOUND);
	            }
	            
	            return new ResponseEntity<>(products, HttpStatus.OK);
	        } catch (Exception ex) {
	        	//database error
	            return new ResponseEntity<>("An error occurred while searching for products.", HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
		
		// Client (POSTMAN/Browser) --> request --->FC --> Controller ---> Service --> Repository --> JPA --> DB(MySQL)
		
		// DB - Response --> JPA --> Repository --> Service ---> Controller ---> FC ---> PostMan/Browser
}

