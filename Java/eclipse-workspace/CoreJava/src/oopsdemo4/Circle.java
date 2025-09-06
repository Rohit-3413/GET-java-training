package oopsdemo4;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 6, 2025
 * Time     :9:52:01 AM
 * project  :CoreJava
*/

public class Circle implements Shape {

	private double radius;

	// generate constructors using fields
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		
	}

	@Override
	public double getArea() {
		
		return Math.PI*this.radius*this.radius;
	}

	// generate getter() for radius
	public double getRadius() {
		return radius;
	}
}
