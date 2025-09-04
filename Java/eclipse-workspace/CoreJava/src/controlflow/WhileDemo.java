package controlflow;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 1, 2025
 * Time     :12:26:55 PM
 * project  :CoreJava
 * 
 * Program to display ur name 10 times & nos from 1-10
*/

public class WhileDemo {

	public static void main(String[] args) {
		int i = 1; // Loop Initialization
		
		while (i<10) { // Set a Condition for Loop
			System.out.println(i+".Rg");
			
			i+=1; // Increment the Loop
		}
		System.out.println("Exit Loop");
		
		System.out.println("************** Reverse Loop *****************");
		int j=10;
		while (j>=1) {
			System.out.print(j+"\t");
			j=j-1; // Decrement Loop
		}
	}

}
