package oopsdemo2;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 4, 2025
 * Time     :12:32:21 PM
 * project  :CoreJava
 * 
 * /*
 * Airline Booking System to demonstrate Composition (Has-A relationship).
👉 In this case:

A Booking has-a Payment.

When the Booking object is destroyed, the Payment object is also destroyed 
(strong lifecycle dependency → Composition).
 */


public class Payment {
	 
	private String paymentId;
    private double amount;
    private String mode;  // e.g., Credit Card, UPI, NetBanking
    
	public Payment(String paymentId, double amount, String mode) {
		this.paymentId = paymentId;
		this.amount = amount;
		this.mode = mode;
	}
	
	public void displayPayment() {
        System.out.println("Payment ID: " + paymentId);
        System.out.println("Amount: " + amount);
        System.out.println("Mode: " + mode);
    }
    
}
