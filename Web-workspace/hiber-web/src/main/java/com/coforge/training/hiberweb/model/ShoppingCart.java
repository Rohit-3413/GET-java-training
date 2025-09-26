package com.coforge.training.hiberweb.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/** 
 * Author	:Rohit.10.Gupta
 * Date		:Sep 25, 2025
 * Time		:4:15:30 PM
 * Project	:hiber-web
*/

@Entity
@Table(name = "shopping_cart")
public class ShoppingCart {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String product;
    private int quantity;
    private double price;
    
    // Component mapping - has a Relationship
    /*
     * The @Embedded annotation is then used on a field in the 
     * entity class to specify that this field is an embedded type. 
     */
    @Embedded
    private Customer customer;
    

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
