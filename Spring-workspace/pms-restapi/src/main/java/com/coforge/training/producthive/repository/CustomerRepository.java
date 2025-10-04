package com.coforge.training.producthive.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coforge.training.producthive.model.Customer;

/**
* Author	:Rohit.10.Gupta
* Date 		:Oct 4, 2025
* Time		:10:18:10 AM
* Project	:pms-restapi
*/

public interface CustomerRepository extends JpaRepository<Customer,  Long> {

	/*
	 * No need to write any code. 
	 * All CRUD operations are available from JpaRepository .
	 * 
	 * If required, we can write custom finder methods here.
	 * Custom finder methods can be created by following Spring Data JPA naming
	 * conventions. 
	 * 
	 * For example, to find customers by last name: 
	 * 
	 * List<Customer> findByLastName(String lastName); 
	 * List<Customer> findByFirstNameAndLastName(String firstName, String lastName);
	 * List<Customer> findByFirstNameOrLastName(String firstName, String lastName); 
	 * List<Customer> findByLastNameOrderByFirstNameAsc(String lastName); 
	 * List<Customer> findByLastNameOrderByFirstNameDesc(String lastName); 
	 * List<Customer> findByFirstNameContaining(String substring);
	 * List<Customer> findByLastNameStartingWith(String prefix); 
	 * List<Customer> findByLastNameEndingWith(String suffix); 
	 * List<Customer> findByFirstNameIgnoreCase(String firstName); 
	 * List<Customer> findByLastNameIn(List<String> lastNames); 
	 * List<Customer> findByFirstNameNot(String firstName); 
	 * List<Customer> findByLastNameIsNull(); 
	 * List<Customer> findByLastNameIsNotNull();
	 * List<Customer> findByFirstNameLike(String pattern); 
	 * List<Customer> findByLastNameNotLike(String pattern); 
	 * List<Customer> findByFirstNameBetween(String start, String end); 
	 * List<Customer> findByLastNameBefore(String date);
	 * 
	 * ******* Custom Queries using @Query annotation ********
	 * 
	 * Custom finder methods can also be created using @Query annotation.
	 * @Query("SELECT c FROM Customer c WHERE c.lastName = :lastName")
	 * List<Customer> findCustomersByLastName(@Param("lastName") String lastName);
	 * 
	 * Join queries can also be written using @Query annotation.
	 * @Query("SELECT c FROM Customer c WHERE c.firstName = ?1 AND c.lastName = ?2")
	 * List<Customer> findCustomersByFirstAndLastName(String firstName, String lastName);
	 * 
	 * @Query("SELECT c FROM Customer c WHERE c.lastName LIKE %:pattern%")
	 * List<Customer> findCustomersByLastNamePattern(@Param("pattern") String pattern);
	 * 
	 * @Query("SELECT c FROM Customer c WHERE c.firstName IS NOT NULL")
	 * List<Customer> findCustomersWithFirstName();
	 * 
	 */	
}

