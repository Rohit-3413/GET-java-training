package oopsdemo2;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 4, 2025
 * Time     :10:46:57 AM
 * project  :CoreJava
 * 
 * Hierarchical Inheritance Demo
*/

public class Customer {
	
	private String name;
    private String email;
    
	public Customer(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	 public void display(){
	        System.out.println("********** Customer Details ************");
	        System.out.println("Customer Name    : "+name);
	        System.out.println("Email            : "+email);
	    }
    
}
