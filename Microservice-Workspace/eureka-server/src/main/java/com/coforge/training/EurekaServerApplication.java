package com.coforge.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/***
 * Main class to start the Eureka Server.
 * Eureka Server provides service registration and discovery.
 * Microservices will register themselves to this server.
 
 * Functionality: Eureka is a service discovery tool from Netflix that allows microservices to register themselves and 
 * discover other services without hardcoding the hostnames or ports.
 
 * Access the Eureka dashboard by visiting http://localhost:8761. 
 * You should see a UI showing the registered microservices.
 */

@EnableEurekaServer  // Default Port No - 8761
@SpringBootApplication
public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
