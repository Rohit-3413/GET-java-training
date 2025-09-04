package controlflow;

import java.util.Scanner;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 1, 2025
 * Time     :10:04:47 AM
 * project  :CoreJava
 * 
 * Program to Check whether entered number is Odd or Even
*/

public class OddEven {

	public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		num = scanner.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num+" is a Even Number");
		}
		else {
			System.out.println(num+" is a Odd Number");

	}
	scanner.close();

}
}

