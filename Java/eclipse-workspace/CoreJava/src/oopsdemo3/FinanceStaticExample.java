package oopsdemo3;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 5, 2025
 * Time     :11:50:03 AM
 * project  :CoreJava
*/

public class FinanceStaticExample {

	public static void main(String[] args) {

		 // Create Accounts
        BankAccount acc1 = new BankAccount("Alice", 5000);
        BankAccount acc2 = new BankAccount("Bob", 10000);

        // Show details (interestRate is common for both)
        acc1.showAccountDetails();
        System.out.println("-------------------");
        acc2.showAccountDetails();

        System.out.println("\n📌 Changing interest rate...");
        BankAccount.setInterestRate(7.5); // Static method call (class-level)

        // After updating interest rate
        acc1.showAccountDetails();
        System.out.println("-------------------");
        acc2.showAccountDetails();

        // Static method to calculate interest
        double si = BankAccount.calculateSimpleInterest(20000, 3);
        System.out.println("\n💰 Simple Interest on 20000 for 3 years = " + si);
        
        double si1 = BankAccount.calculateSimpleInterest(500000, 5);
        System.out.println("\n💰 Simple Interest on 500000 for 5 years = " + si1);


	}

}
