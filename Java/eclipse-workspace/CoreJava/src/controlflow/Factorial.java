package controlflow;

import java.util.Scanner;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 1, 2025
 * Time     :3:00:48 PM
 * project  :CoreJava
 * 
 *  Program to find Factorial of a Number 1*1*2*3*.....n
*/

public class Factorial {

	public static void main(String[] args) {

		
		 int num, fact=1;
		        Scanner scanner=new Scanner(System.in);

		        System.out.println("Enter a Number : ");
		        num=scanner.nextInt();
		        scanner.close();

		        for (int i = 1; i <=num; i++) {
		           fact*=i;
		        }
		        System.out.println("The Factorial of "+num+" is: "+fact);

	}

}
