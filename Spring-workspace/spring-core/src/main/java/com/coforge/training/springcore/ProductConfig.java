package com.coforge.training.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.coforge.training.springcore.model.Product;

/**
 * Author	:Rohit.10.Gupta
 * Date 		:Sep 27, 2025
 * Time		:10:23:30 AM
 * Project	:spring-core
 */

//Spring Configuration Class for Annotations
@Configuration	// Configuration of Bean Objects
@ComponentScan(basePackages = "com.coforge.training.springcore.model")
public class ProductConfig {

	@Bean
	public Product product1() {
		Product product = new Product();
		product.setName("Laptop");
		product.setPrice(1500.00);
		return product;
	}

	@Bean
	public Product product2() {
		Product product = new Product();
		product.setName("Smartphone");
		product.setPrice(800.00);
		return product;
	}

	@Bean
	public Product product3() {
		Product product = new Product();
		product.setName("Headphone");
		product.setPrice(600.00);
		return product;
	}

}

