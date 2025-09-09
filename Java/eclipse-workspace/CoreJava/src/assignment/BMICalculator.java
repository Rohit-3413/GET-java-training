package assignment;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your weight (kg): ");
		double weight = sc.nextDouble();
		
		System.out.print("Enter your height (m): ");
		double height = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		System.out.printf("Your BMI is %.2f\n", bmi);
		sc.close();
	}
}

