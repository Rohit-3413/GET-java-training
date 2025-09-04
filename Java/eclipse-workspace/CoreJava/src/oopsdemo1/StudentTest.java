package oopsdemo1;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 2, 2025
 * Time     :4:25:24 PM
 * project  :CoreJava
 * 
 * Java Program to implement Object Oriented Programming
*/

public class StudentTest {

	public static void main(String[] args) {
		
		
		// Create a Object of Student Class
		Student s1= new Student();
		Student s2= new Student();
		
		// Invoke methods of student class using dot operator
		s1.input();
		float tot= s1.calculate();
		s1.display();
		System.out.println("Total Displayed from main: "+tot);
		
		// Invoke methods of student class using dot operator
		s2.input();
		float tot1= s2.calculate();
		s2.display();
		System.out.println("Total Displayed from main: "+tot1);
		

	}

}
