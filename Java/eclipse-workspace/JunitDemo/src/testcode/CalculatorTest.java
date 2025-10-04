package testcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import businesscode.Calculator;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Oct 4, 2025
 * Time     :12:29:10 PM
 * project  :JunitDemo
*/

class CalculatorTest {

	Calculator calc;	// Create a Object of a class to be Tested
	
	@BeforeEach
	void setUp() throws Exception {
		calc = new Calculator();	// Initialize the Object of a class to be Tested
	}

	@AfterEach
	void tearDown() throws Exception {
		calc = null; 	// Destroy the Object of a class to be Tested
	}

	@Test
	void testAdd() {
		double result = calc.add(10.50, 10.32);	// Call the method to be tested
		assertEquals(20.82, result, 0);	// Assertion with Expected value, Actual value, delta value
	}

	@Test
	void testSubtract() {
		double result = calc.subtract(100.5, 95);
		assertEquals(5.5, result, 0);
	}

	@Test
	void testMultiply() {
		double result = calc.multiply(200, 2.5);
		assertEquals(500, result, 0);
	}

	@Test
	void testDivide() {
		double result = calc.divide(100, 10);
		assertEquals(10, result, 0);
	}
	
	// Testing Exception
	// Here we are testing divide by zero exception in divide method of Calculator class
	@Test
	void testDevideByZero() {
		assertThrows(ArithmeticException.class, () -> calc.divide(100, 0));
	}

}
