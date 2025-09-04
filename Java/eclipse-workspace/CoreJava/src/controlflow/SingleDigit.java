package controlflow;

import java.util.Scanner;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 1, 2025
 * Time     :10:10:12 AM
 * project  :CoreJava
 * 
 * Program to check whether entered number is single digit or not
*/

public class SingleDigit {

	public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		num = scanner.nextInt();
		
		if( num > -10 && num < 10) {
			System.out.println(num+ " is a Single Digit");
		}
		else {
			System.out.println(num+ " is Not a Single Digit");
		}
		scanner.close();

	}

}
