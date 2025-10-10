package com.coforge.training.producthive.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.coforge.training.producthive.exception.ResourceNotFoundException;
import com.coforge.training.producthive.model.Customer;
import com.coforge.training.producthive.service.CustomerService;

/**
* Author	:Rohit.10.Gupta
* Date 		:Oct 4, 2025
* Time		:10:32:42 AM
* Project	:pms-restapi
*/
@CrossOrigin(origins = {"http://localhost:3000", "http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class CustomerController {

	private final CustomerService customerService;
	
	//DI using constructors
	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	/*
	 *   //Open Postman & make POST request - http://localhost:8088/producthive/api/customers
	 *   
	 *   Go to the Body tab. Select the form-data option.
	 *	Add the following fields:
	 *
	 * Key: firstName Type: Text Value: Enter the first name (e.g., Rod).
	 * Key: lastName Type: Text Value: Enter the last name (e.g., Johnson).
	 * Key: passport Type: File Value: Upload a PDF file of the passport.
     * Key: image Type: File Value: Upload a JPEG image for the profile.
	 */

	@PostMapping("/customers")
	public ResponseEntity<Customer> saveCustomer(
			@RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName,
			@RequestParam("passport") MultipartFile passport,
			@RequestParam("image") MultipartFile image) {
		try {
			Customer customer = new Customer();
			customer.setFirstName(firstName);
			customer.setLastName(lastName);
			customer.setPassport(passport.getBytes());
			customer.setImage(image.getBytes());

			return ResponseEntity.ok(customerService.saveCustomer(customer));
		} catch (IOException e) {
			return ResponseEntity.badRequest().build();
		}
	}

	//Open Postman & make GET request -http://localhost:8088/producthive/api/customers/2
	@GetMapping("/customers/{id}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable(value = "id") Long id)
	        throws ResourceNotFoundException {

	    Customer customer = customerService.getCustomerById(id).orElseThrow(() ->
	        new ResourceNotFoundException("Customer not found for this Id : " + id));

	    return ResponseEntity.ok(customer);
	}

	//Open Postman & make GET request - http://localhost:8088/producthive/api/customers
	@GetMapping("/customers")
	public ResponseEntity<List<Customer>> getAllCustomers() {
		List<Customer> customers = customerService.getAllCustomers();
		if (customers.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(customers);
	}

}

