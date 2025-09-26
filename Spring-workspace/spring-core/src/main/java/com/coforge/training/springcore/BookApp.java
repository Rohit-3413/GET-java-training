package com.coforge.training.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.training.springcore.model.Book;

/**
 * Author	:Rohit.10.Gupta
 * Date 		:Sep 26, 2025
 * Time		:4:37:12 PM
 * Project	:spring-core
 * 
 * Spring Program to demonstrate Dependency Injection using Constructor with XML Config
 */

public class BookApp {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("BookConfig.xml");

		// Get the Book Bean/Object from xml file
		Book b1=(Book) context.getBean("book1");
		Book b2=(Book) context.getBean("book2");
		Book b3=(Book) context.getBean("book3");

		b1.display();
		b2.display();
		b3.display();

		((ClassPathXmlApplicationContext) context).close();
	}

}

