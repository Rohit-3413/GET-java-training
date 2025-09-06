package exceptiondemo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 6, 2025
 * Time     :3:08:48 PM
 * project  :CoreJava
*/

/*	*Online Shopping Billing Example where user enters amounts and we try to divide bill among installments.
	If the user enters 0 installments, it will cause an ArithmeticException.
	InputMismatchException → customer entered wrong input like text instead of number.
*/

public class ShoppingInstallments {

	public static void main(String[] args) {
		
	
			Scanner sc = new Scanner(System.in);

			        try {
			            System.out.println("Enter Total Bill Amount: ");
			            long billAmount = (long) sc.nextDouble();

			            System.out.println("Enter Number of Installments: ");
			            int installments = sc.nextInt();

			            // Risky operation: division
			            long perInstallment = billAmount / installments;

			            System.out.println("✅ Each Installment Amount: ₹" + perInstallment);
			        } 
			        catch (ArithmeticException e) {
			            // Handles divide by zero case
			            System.out.println("❌ Error: Installments cannot be 0.");
			        } 
			        catch (InputMismatchException e) {
			            // Handles wrong input type case
			            System.out.println("❌ Error: Please enter only numeric values.");
			        } 
			        catch (Exception e) {
			            // Handles any other unknown exception
			            System.out.println("❌ Unexpected Error: " + e.getMessage());
			        } 
			        finally {
			            System.out.println("🔒 Transaction process completed. Thank you for shopping!");
			            sc.close();
			        }

	}

}
