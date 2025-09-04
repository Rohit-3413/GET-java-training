package controlflow;

import java.util.Scanner;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 1, 2025
 * Time     :10:21:58 AM
 * project  :CoreJava
 * 
 * Program to find Greatest of 3 Numbers
*/

public class Greatest3 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
        int num1, num2 , num3;

        System.out.println("Enter 3 Numbers :");
        num1=scanner.nextInt();
        num2=scanner.nextInt();
        num3=scanner.nextInt();
        
        if( num1 > num2 && num1 > num3) {
        	System.out.println(num1+" is Greatest");
        } else if (num2 > num3) {
        	System.out.println(num2+" is Greatest");
        } else if (num1==num2 && num2==num3) {
        	System.out.println(" All Numbers are Equal");
        } else {
        	System.out.println(num3+ " is Greatest");
        }
        scanner.close();

	}

}
