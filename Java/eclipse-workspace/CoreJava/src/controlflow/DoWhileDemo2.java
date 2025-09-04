package controlflow;

import java.util.Scanner;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 1, 2025
 * Time     :2:22:31 PM
 * project  :CoreJava
*/

public class DoWhileDemo2 {

	public static void main(String[] args) {
		int i=20;
		
		do {
			System.out.print(i+"\t");
			i+=1;
		}while (i<=50);
		
		System.out.println("\n\n******************* Guess Names *********************");
		String guess;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println();
		
		do {
			System.out.println("Guess My Name : ");
			guess = scanner.next();
		} while (!"James".equals(guess));
		System.out.println("Congratulations You Guessed Name Correctly!!! "+guess);
		scanner.close();
	}

}
