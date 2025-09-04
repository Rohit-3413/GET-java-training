package basics;

/**
 *  This program calculates the area of a Circle.
 *  It demonstrates the use of variables, arithmetic operations,
 *  and console output in Java.
 *  
 *  @version 1.0
 */
public class Area {

	public static void main(String[] args) {
		
		double radius = 7.5; // Radius of the Circle
		double area; // Variable to store the area
		final double PI = 3.14159; // Constant value of PI
		
		// Calculate the area of the Circle
		area = PI * radius * radius;
		
		//Print the area to the console
		System.out.println("The area of the Circle with radius "+ radius + " is: "+ area);

	}

}
