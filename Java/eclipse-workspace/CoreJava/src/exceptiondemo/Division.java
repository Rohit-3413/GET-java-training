package exceptiondemo;

import java.util.Scanner;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 6, 2025
 * Time     :2:23:00 PM
 * project  :CoreJava
*/

//Program to find Division of 2 nos without Exception Handling
public class Division {

	public static void main(String[] args) {
		
		int a, b, result;
        Scanner input = new Scanner(System.in);

        System.out.println("Input two integers :");
        a = input.nextInt();
        b = input.nextInt();

        result = a / b;
        System.out.println("Result = " + result);
        
        input.close();

	}

}
