package java8features;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 11, 2025
 * Time     :4:12:57 PM
 * project  :AdvanceJava
 */

public interface Payment {

	void pay(double amount); // abstract method

	// Default method - common across all payments
	default void generateReceipt(double amount) {
		System.out.println("Receipt generated for payment of ₹" + amount);
	}
}



//UPI Payment Implementation
class UpiPayment implements Payment {
	@Override
	public void pay(double amount) {
		System.out.println("Paid ₹" + amount + " using UPI ✅");
	}
}

//Card Payment Implementation
class CardPayment implements Payment {
	@Override
	public void pay(double amount) {
		System.out.println("Paid ₹" + amount + " using Credit/Debit Card ✅");
	}

	// Optionally override default method
	@Override
	public void generateReceipt(double amount) {
		System.out.println("Card Payment Receipt: ₹" + amount + " [Transaction Secured]");
	}
}

//Cash Payment Implementation
class CashPayment implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("Paid ₹" + amount + " in Cash ✅");
	}
}