package testcode;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import businesscode.Employee;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Oct 4, 2025
 * Time     :2:30:54 PM
 * project  :JunitDemo
*/

class EmployeeTest {

	Employee emp;
	
	@BeforeEach
	void setUp() throws Exception {
		emp= new Employee(101, "John", "Gosling", "Software Engineer",20000);
	}

	@AfterEach
	void tearDown() throws Exception {
		emp = null;
	}

	@Test
	void testCalculateNetSalary() {
		
		emp.calculateNetSalary();

		assertEquals(3000.0, emp.getHra(), 0.01, "HRA should be 15% of basic");
		assertEquals(2000.0, emp.getDa(), 0.01, "DA should be 10% of basic");
		assertEquals(25000.0, emp.getGrossSalary(), 0.01, "Gross salary should be basic + HRA + DA");
		assertEquals(24000.0, emp.getNetSalary(), 0.01, "Net salary should be gross - TAX");
	}

	@Test
	void testDisplayEmployeeDetails() {
		emp.calculateNetSalary();

		// Capture console output
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outputStream));

		emp.displayEmployeeDetails();

		String output = outputStream.toString();

		// Assertions
		assertTrue(output.contains("Employee Id   :  101"));
		assertTrue(output.contains("Employee Name :  John Gosling - Software Engineer"));
		assertTrue(output.contains("Basic Salary  :  20000.0"));
		assertTrue(output.contains("Net Salary    :  24000.0"));
	}

}
