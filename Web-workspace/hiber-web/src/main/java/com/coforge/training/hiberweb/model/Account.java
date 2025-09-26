package com.coforge.training.hiberweb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

/** 
 * Author	:Rohit.10.Gupta
 * Date		:Sep 25, 2025
 * Time		:4:41:49 PM
 * Project	:hiber-web
 * 
 *  Inheritance Mapping Example using Banking Domain
 *  Base class Account and specialized subclasses like 
 *  SavingsAccount and CurrentAccount. 
 *  Hibernate lets you map this hierarchy to relational tables 
 *  using strategies such as SINGLE_TABLE, JOINED, or TABLE_PER_CLASS
 *  
 *  * Each entity class in the hierarchy gets its own table.
 * The base class table holds the common fields.
 * Each subclass table holds only its specific fields, but shares the 
 * same primary key as the base table.
 * When querying a subclass, Hibernate performs a JOIN between the base table and 
 * the subclass table.
 */

@Entity
@Inheritance(strategy = InheritanceType.JOINED) 
// You can also try SINGLE_TABLE or TABLE_PER_CLASS
public abstract class Account {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String accountNumber;
    private String holderName;
    private double balance;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
