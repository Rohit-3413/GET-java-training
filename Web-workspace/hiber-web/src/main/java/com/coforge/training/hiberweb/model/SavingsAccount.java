package com.coforge.training.hiberweb.model;

import jakarta.persistence.Entity;
/** 
 * Author	:Rohit.10.Gupta
 * Date		:Sep 25, 2025
 * Time		:4:45:18 PM
 * Project	:hiber-web
*/

@Entity
public class SavingsAccount extends Account {

	private double interestRate;

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
}
