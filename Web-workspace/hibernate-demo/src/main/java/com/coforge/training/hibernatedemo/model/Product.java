package com.coforge.training.hibernatedemo.model;

/** 
 * Author	:Rohit.10.Gupta
 * Date		:Sep 24, 2025
 * Time		:11:51:44 AM
 * Project	:hibernate-demo
 * 
 * Entity class for Product using XML configuration
*/

public class Product {

	private long pid;
    private String name;
    private String description;
    private float price;
    
    
	public long getPid() {
		return pid;
	}
	public void setPid(long pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
}
