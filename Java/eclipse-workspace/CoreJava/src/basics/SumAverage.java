package basics;

import java.util.Scanner;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Aug 30, 2025
 * Time     :9:34:26 AM
 * project  :CoreJava
 * 
 * This program calculates the sum and average of a set of numbers using Scanner Input.
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
		
		scanner.nextLine(); //Pause for nextLine()
		System.out.println("Enter Your Name : ");
		
		String name = scanner.nextLine();
		
		//Process
		sum=number1+number2+number3;
		avg=(float)sum/3;
		
		System.out.println("**********************************************");
		System.out.println("The Sum of 3 numbers is : "+sum);
		System.out.println("The Average of 3 numbers is "+avg);
		System.out.println("Coded by "+name+" at "+org+" Training");
		System.out.println("**********************************************");
		
		scanner.close();
	}

}
