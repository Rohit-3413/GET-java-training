package com.coforge.training.producthive.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.training.producthive.model.Dealer;
import com.coforge.training.producthive.model.DealerAndAddressProjection;
import com.coforge.training.producthive.repository.DealerRepository;

/**
* Author	:Rohit.10.Gupta
* Date 		:Oct 3, 2025
* Time		:3:17:21 PM
* Project	:pms-restapi
*/

@Service
public class DealerService {

	// DI using Field
	@Autowired
	private DealerRepository drepo;
	
	public Dealer registerDealer(Dealer d) {
		return drepo.save(d);	// Invokes pre-defined methods of JPA repo
	}
	
	/**
	 * *In Java, the Optional class, introduced in Java 8, is a container object used to 
	 * represent the presence or absence of a value. 
	 * It helps avoid the infamous NullPointerException by providing a safer way to 
	 * handle nullable values.
	 */
	
	public Optional<Dealer> loginDealer(String email) {
		return drepo.findByEmail(email);	// Invokes custom method of JPA repo
	}
	
	 public List<DealerAndAddressProjection> getDealerInfo() {
			return drepo.findSelectedFieldsFromDealerAndAddress(); //Invokes Custom Query method
		}
}

