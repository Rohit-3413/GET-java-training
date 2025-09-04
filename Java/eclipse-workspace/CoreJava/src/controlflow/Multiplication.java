package controlflow;

import java.util.Scanner;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 1, 2025
 * Time     :3:09:22 PM
 * project  :CoreJava
 * 
 * Program to Display Multiplication Table of a Number
*/

public class Multiplication {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num =scanner.nextInt();
        
        
        System.out.println("Multiplication Table of :"+num);
        System.out.println();
        
        for(int i=1; i<=10; i++) {
        	System.out.println(num+ " * " +i+ " = " +num*i);
        	scanner.close();
        }

	}

}
