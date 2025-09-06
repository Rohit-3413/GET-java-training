package oopsdemo4;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 6, 2025
 * Time     :11:51:31 AM
 * project  :CoreJava
*/

/*
 * * Multiple Inheritance using Interfaces 
 * 1. Create an interface Exam with
 * method percent_cal() 
 * 2. Create a class Candidate with fields name, roll_no,
 * mark1, mark2 and constructor to initialize them. 
 * 3. Create a class Result
 * that extends Candidate and implements Exam interface. 
 * 4. Implement the
 * percent_cal() method in Result class to calculate and display the percentage
 * of marks. 
 * 5. In the main method, create an instance of Result and call the
 * percent_cal() method to display the result.
 */

public class MultipleDemo {

	public static void main(String[] args) {

		Result r1 = new Result("John", 101, 92, 85);
		r1.display();
		r1.percent_cal();
	}

}
