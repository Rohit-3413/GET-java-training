package com.coforge.training.producthive.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coforge.training.producthive.model.Product;

/**
* Author	:Rohit.10.Gupta
* Date 		:Oct 1, 2025
* Time		:10:42:52 AM
* Project	:pms-restapi
* 
* 
* JPA Repository is mainly used for managing the data in a Spring Boot Application. 
 * JpaRepository is particularly a JPA specific extension for Repository.
 * Jpa Repository contains the APIs for basic CRUD operations, the APIS for 
 * pagination, and the APIs for sorting.
 * This Layer interacts with Database
*/

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	 /* Long is data type of @Id field of Product Class
		 * 
		 * This interface has save(),findAll(),findById(),deleteById(),count()
	       etc.. inbuilt methods of jpa repository for various database operations.
	       
	       This interface will be implemented by class automatically
		 */

}

