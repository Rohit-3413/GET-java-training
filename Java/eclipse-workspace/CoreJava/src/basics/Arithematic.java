package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Aug 30, 2025
 * Time     :11:27:39 AM
 * project  :CoreJava
 */

public class Arithematic {
	public static void main(String[] args) throws IOException{

		// Declaration of Variables
		int a, b, sum, sub, mul;
		float div;
		String name;

		// BufferedReader for input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Input Statement - Take input using BufferedReader
		System.out.println("Enter 2 Numbers: ");
		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());

		System.out.println("Enter your name: ");
		name = br.readLine();  // Accepts multiple words directly

		// Process
		sum = a + b;
		sub = a - b;
		mul = a * b;
		div = (float)a / b;

		// Display Output
		System.out.println("***************Arithmetic Operations******************");

		System.out.println("Your name is "+name+" \nThe sum of given 2 numbers is "+sum +", \nsubtraction is "+sub+", \nmultiplication is "+mul+", \ndivision is " +div);

	}
}
