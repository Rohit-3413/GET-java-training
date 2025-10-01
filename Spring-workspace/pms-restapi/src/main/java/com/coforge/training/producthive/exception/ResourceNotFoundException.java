package com.coforge.training.producthive.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
* Author	:Rohit.10.Gupta
* Date 		:Oct 1, 2025
* Time		:11:43:46 AM
* Project	:pms-restapi
*/

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;
	

	public ResourceNotFoundException(String message) {
		super(message);

	}

	
}

