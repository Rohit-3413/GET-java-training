package oopsdemo3;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 4, 2025
 * Time     :2:36:09 PM
 * project  :CoreJava
 * 
 * Program to demonstrate Method Overloading. - Static Polymorphism
 *
 * Overload add() method with different type/no. of Arguments 
*/


class Addition
{
	
	public void add() {
		System.out.println("Method OverLoading Demo");
	}
	public void add(int a, int b) {
		System.out.println("The Addition of 2 Nos is : "+(a+b));
	}
	public void add(double a, double b) {
		System.out.println("The Addition of 2 float is : "+(a+b));
	}
	public void add(int a, int b, int c) {
		System.out.println("The Addition of 3 Nos is : "+(a+b+c));
	}
	public void add(String s1, String s2) {
		System.out.println("The Addition of 2 Strings is : "+(s1+s2));
	}
	
	
}

public class OverLoadDemo {

	public static void main(String[] args) {
		
		Addition a1 = new Addition();
		
		// Invoke Overloaded add() Method
		a1.add();
		a1.add(20,30.5f);
		a1.add(34.55,530.50f);  //Type Promotion - float -->double
		a1.add(100,300,600);
		a1.add("Java ", "Programming");

	}

}
