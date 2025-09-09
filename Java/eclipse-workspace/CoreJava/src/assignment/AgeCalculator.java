package assignment;

import java.util.Scanner;


public class AgeCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your birth year: ");
		
		int birthYear = sc.nextInt();
		
		int currentYear = 2024;
		int age = currentYear - birthYear;
		
		System.out.println("You are " + age + " years old.");
		sc.close();
	}
}