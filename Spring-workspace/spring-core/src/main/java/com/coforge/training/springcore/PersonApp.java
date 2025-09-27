package com.coforge.training.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.training.springcore.model.Person;

/**
* Author	:Rohit.10.Gupta
* Date 		:Sep 27, 2025
* Time		:10:46:38 AM
* Project	:spring-core
*/

public class PersonApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("PersonConfig.xml");

		//Get the Book Bean/Object from xml file
		Person p1=(Person) context.getBean("person1");
		p1.display();	

		Person p2=(Person) context.getBean("person2");
		p2.display();	

		Person p3=(Person) context.getBean("person3");
		p3.display();	


		((ClassPathXmlApplicationContext) context).close();

	}


}

