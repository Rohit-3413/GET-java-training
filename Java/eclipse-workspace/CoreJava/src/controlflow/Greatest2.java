package controlflow;

import java.util.Scanner;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 1, 2025
 * Time     :9:37:08 AM
 * project  :CoreJava
 * 
 * Program to find Greatest of 2 Numbers
*/

public class Greatest2 {

	public static void main(String[] args) {
		
		int a, b;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter 2 Numbers: ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		if (a > b) {
			System.out.println(a+" is Greatest");
		} else {
			System.out.println(b+" is Greatest");
		}
		scanner.close();
	}

}
