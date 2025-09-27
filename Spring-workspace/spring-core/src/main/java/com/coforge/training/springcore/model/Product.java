package com.coforge.training.springcore.model;

/**
* Author	:Rohit.10.Gupta
* Date 		:Sep 27, 2025
* Time		:10:20:35 AM
* Project	:spring-core
* 
* Bean class for setter Injection using Annotation Configuration
*/

public class Product {

	private String name;
		private double price;
		
		
		public void setName(String name) {
			this.name = name;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		
		
		@Override
		public String toString() {
			return "Product [name=" + name + ", price=" + price + "]";
		}

}

