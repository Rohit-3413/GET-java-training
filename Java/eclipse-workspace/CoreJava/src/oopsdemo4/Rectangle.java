package oopsdemo4;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 6, 2025
 * Time     :9:57:42 AM
 * project  :CoreJava
*/

public class Rectangle implements Shape{

	private double width;
	private double height;
	
	// generate constructor using fields
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Rectangle");
		
	}

	@Override
	public double getArea() {
		
		return this.height*this.width;
	}
	
	
}
