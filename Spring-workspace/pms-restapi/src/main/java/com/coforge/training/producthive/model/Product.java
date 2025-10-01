package com.coforge.training.producthive.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

/**
* Author	:Rohit.10.Gupta
* Date 		:Oct 1, 2025
* Time		:10:36:25 AM
* Project	:pms-restapi
*/

@Entity
public class Product {

	/*
	 * The @Id annotation specifies the primary key of an entity.
	 * @GeneratedValue provides for the specification of generation strategies for the values of primary keys.
	 * @SequenceGenerator, you can specify the sequence name, initial value, and allocation size for the 
	 * sequence. 
	 * This allows you to control the sequence generation process and ensure database consistency. 
	 */
		 @Id
		 @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "prod_seq")
		 @SequenceGenerator(name="prod_seq",initialValue = 1000,allocationSize = 1)
	   	 private Long pid;
		 
		 public Product() {
			super();
		}

		 public Product(Long pid, String name, String brand, String madein, float price) {
			super();
			this.pid = pid;
			this.name = name;
			this.brand = brand;
			this.madein = madein;
			this.price = price;
		}

		 public Long getPid() {
			return pid;
		}

		 public void setPid(Long pid) {
			 this.pid = pid;
		 }

		 public String getName() {
			 return name;
		 }

		 public void setName(String name) {
			 this.name = name;
		 }

		 public String getBrand() {
			 return brand;
		 }

		 public void setBrand(String brand) {
			 this.brand = brand;
		 }

		 public String getMadein() {
			 return madein;
		 }

		 public void setMadein(String madein) {
			 this.madein = madein;
		 }

		 public float getPrice() {
			 return price;
		 }

		 public void setPrice(float price) {
			 this.price = price;
		 }

		 @Column(nullable = false)
	     private String name;
		 
		 @Column(nullable = false)
	     private String brand;
		 
		 @Column(nullable = false)
	     private String madein;
		 
		 @Column(nullable = false)
	     private float price;
}

