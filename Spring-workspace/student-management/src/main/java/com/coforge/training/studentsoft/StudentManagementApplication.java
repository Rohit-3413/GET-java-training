package com.coforge.training.studentsoft;

import org.springframework.boot.SpringApplication;
/*
* Spring Boot Application to perform CRUD Operations to manage Student Object. -Spring Boot
* Use MySQL Database
* JSP as Views (presentation Logic)
* JDBCTemplate as DataAccess Logic
* The @SpringBootApplication annotation is a central component in Spring Boot applications.
* 
* The @SpringBootApplication annotation is a convenience annotation that enables 
* auto-configuration, enabling features such as component scanning and the creation 
* of a bean factory post processor. 
* It's a popular annotation used in Spring Boot applications to simplify the 
* configuration process. This annotation is equivalent to using 
* @Configuration, @EnableAutoConfiguration, and @ComponentScan annotations together. 
* By using @SpringBootApplication, developers can quickly start building a 
* Spring Boot application without needing to configure each feature individually. 
* It's a great way to get started with Spring Boot development.
* */

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

}
