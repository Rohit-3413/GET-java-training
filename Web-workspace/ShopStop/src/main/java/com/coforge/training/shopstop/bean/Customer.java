package com.coforge.training.shopstop.bean;

/** 
 * Author	:Rohit.10.Gupta
 * Date		:Sep 22, 2025
 * Time		:12:13:08 PM
 * Project	:ShopStop
*/

public class Customer {

	private int customerId;
	private String firstName;
    private String lastName;
    private boolean goldCustomer;
    
	public Customer() {
		
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean isGoldCustomer() {
		return goldCustomer;
	}

	public void setGoldCustomer(boolean goldCustomer) {
		this.goldCustomer = goldCustomer;
	}
}
