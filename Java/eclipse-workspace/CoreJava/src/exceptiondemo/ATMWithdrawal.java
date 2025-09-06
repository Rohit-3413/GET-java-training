package exceptiondemo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 6, 2025
 * Time     :3:39:37 PM
 * project  :CoreJava
*/

// ATM Withdrawal with try-catch-finally (Multiple Catch Blocks) & throw keyword

public class ATMWithdrawal {

	public static void main(String[] args) {


		  Scanner sc = new Scanner(System.in);

			        double accountBalance = 10000; // initial balance

			        try {
			            System.out.println("Enter amount to withdraw: ");
			            double withdrawAmount = sc.nextDouble();

			            // Risky operations
			            if (withdrawAmount > accountBalance) {
			                // Insufficient balance
			                throw new ArithmeticException("Insufficient Balance!");
			            }

			            if (withdrawAmount <= 0) {
			                // Invalid input
			                throw new IllegalArgumentException("Amount must be greater than 0.");
			            }

			            accountBalance -= withdrawAmount;
			            System.out.println("✅ Withdrawal Successful! Amount: ₹" + withdrawAmount);
			            System.out.println("💰 Remaining Balance: ₹" + accountBalance);
			        } 
			        catch (InputMismatchException e) {
			            // Handles invalid input type (e.g., entering text instead of number)
			            System.err.println("❌ Error: Please enter only numeric values.");
			        } 
			        catch (ArithmeticException e) {
			            // Handles insufficient balance case
			            System.err.println("❌ Error: " + e.getMessage());
			        } 
			        catch (IllegalArgumentException e) {
			            // Handles negative or zero withdrawal case
			            System.err.println("❌ Error: " + e.getMessage());
			        } 
			        catch (Exception e) {
			            // Handles any other unknown exception
			            System.err.println("❌ Unexpected Error: " + e.getMessage());
			        } 
			        finally {
			            // Always executed
			            System.out.println("🔒 Transaction session closed. Thank you for using our ATM!");
			            sc.close();
			        }

	}

}
