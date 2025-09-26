package com.coforge.training.springcore.model;

/**
* Author	:Rohit.10.Gupta
* Date 		:Sep 26, 2025
* Time		:4:31:25 PM
* Project	:spring-core
*/

//POJO class for DI using Constructors
public class Book {

	private int id;  
		private String name,author,publisher;  
		private int quantity;
	  
	  public Book(int id, String name, String author, String publisher, int quantity) {
			super();
			this.id = id;
			this.name = name;
			this.author = author;
			this.publisher = publisher;
			this.quantity = quantity;
		}

	  public void display()
		{
			System.out.println("***************** Book Details ******************");
			System.out.println(id +" "+name+" "+author+" "+publisher+" "+quantity);
		}
}

