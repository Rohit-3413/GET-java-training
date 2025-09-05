package oopsdemo4;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 5, 2025
 * Time     :12:53:32 PM
 * project  :CoreJava
*/

public class Marks extends Trainee {
	
	private double marks;

	public Marks(String name, String address, int number, double marks) {
		super(name, address, number);
		this.marks = marks;
	}

	@Override
	public double calculateMarks() {
		System.out.println("Calculate Marks :");
		return (marks*2);
	}

}
