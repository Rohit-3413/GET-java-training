package controlflow;

import java.util.Scanner;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Aug 30, 2025
 * Time     :9:34:26 AM
 * project  :CoreJava
 * 
 * This program calculates the sum and average of 3 numbers which are greater than 100.
*/

public class SumAverage {

	public static void main(String[] args) {

		//variable declaration
		int number1, number2, number3 , sum;
		float avg;
		Scanner scanner= new Scanner(System.in); //Declare Scanner Object
		
		
		System.out.println("Enter Your Organization : "); //if it is first input, it will work fine else take pause
		String org =scanner.nextLine();
		//Taking Input
		System.out.println("Enter three numbers : ");

		number1 = scanner.nextInt();
		number2 = scanner.nextInt();
		number3 = scanner.nextInt();
		
		if((number1 > 100) && (number2 > 100)  && (number3 > 100)) {
			
			//Perform Calculations
			sum=number1+number2+number3;
			avg=(float)sum/3;  //  Typecasting
			
			System.out.println("Your Organization is : "+org);
			System.out.println("The Sum of 3 numbers is : "+sum);
			System.out.println("The Average of 3 numbers is "+avg);
			System.out.println("The Average of 3 numbers is "+ String.format("%.2f", avg));
			
		} else {
			
			System.out.println("Please Enter Numbers Greater Than 100");
		}
		
		scanner.close();
		
		
	}

}
