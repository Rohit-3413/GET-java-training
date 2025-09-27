package com.coforge.training.springcore;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
* Author	:Rohit.10.Gupta
* Date 		:Sep 26, 2025
* Time		:4:49:09 PM
* Project	:spring-core
* 
* Configuration class for Annotation Config and Component Scan
* to scan the components in the specified package
*/

@Configuration
@ComponentScan(basePackages = "com.coforge.training.springcore")
public class AirlineConfig {

}

