package controlflow;

import java.util.Scanner;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 1, 2025
 * Time     :3:22:37 PM
 * project  :CoreJava
 * 
 * Shopping Bill Generator

👉 A customer buys multiple items.
👉 The program uses a for loop to calculate the total bill.
*/

public class ShoppingBill {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = scanner.nextInt();

        double totalBill = 0;

        // loop for each item
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter price of item " + i + ": ");
            double price = scanner.nextDouble();

            System.out.print("Enter quantity of item " + i + ": ");
            int qty = scanner.nextInt();

            double itemTotal = price * qty;
            totalBill += itemTotal;

            System.out.println("Item " + i + " cost = " + itemTotal + "\n");
        }

        System.out.println("=================================");
        System.out.println("Total Bill Amount = ₹" + totalBill);
        System.out.println("Thank you for shopping with us!");
        
        scanner.close();

	}

}
