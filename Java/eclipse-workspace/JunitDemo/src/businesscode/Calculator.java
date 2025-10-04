package businesscode;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Oct 4, 2025
 * Time     :12:19:21 PM
 * project  :JunitDemo
*/

public class Calculator {

	public double add(double a, double b) {
		return a + b;
	}

	public double subtract(double a, double b) {
		return a - b;
	}

	public double multiply(double a, double b) {
		return a * b;
	}

	public double divide(double a, double b) { 
		if(b == 0) {
			throw new ArithmeticException();
		}
		return a / b;
	}
}
