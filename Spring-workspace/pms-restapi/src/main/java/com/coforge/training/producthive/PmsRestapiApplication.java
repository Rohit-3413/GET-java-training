package com.coforge.training.producthive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
Spring Boot RESTful Web Services for Product Management System using 
* Spring Data JPA and Hibernate with MySQL Database


*
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
*/

@SpringBootApplication
public class PmsRestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PmsRestapiApplication.class, args);
	}

}
