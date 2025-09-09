package assignment;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int a = sc.nextInt();

		System.out.print("Enter second number: ");
		int b = sc.nextInt();

		System.out.print("Enter third number: ");
		int c = sc.nextInt();

		int largest = (a > b && a > c) ? a : (b > c ? b : c);
		System.out.println("The largest number is " + largest);
		
		sc.close();

	}
}