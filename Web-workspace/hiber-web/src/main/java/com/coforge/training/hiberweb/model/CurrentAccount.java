package com.coforge.training.hiberweb.model;

import jakarta.persistence.Entity;

/** 
 * Author	:Rohit.10.Gupta
 * Date		:Sep 25, 2025
 * Time		:4:47:23 PM
 * Project	:hiber-web
*/

@Entity
public class CurrentAccount extends Account {

	private double overdraftLimit;

	
	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
}
