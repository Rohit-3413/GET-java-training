package oopsdemo1;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 2, 2025
 * Time     :4:42:19 PM
 * project  :CoreJava
*/

public class CoforgeEmployeeTest {

	public static void main(String[] args) {
		
		// create Objects e1, e2, e3 of Employee Class
		Employee developer = new Employee();   // Invoke default Constructor
		Employee tester = new Employee();
		Employee sales = new Employee();
		
		System.out.println("************* Coforge Technologies ************");
		
		// Invoke Methods (Method call)
		developer.inputEmployeeDetails(); // p1.eat();
		developer.calculateNetSalary();
		developer.displayEmployeeDetails();
		
		tester.inputEmployeeDetails(); 
		tester.calculateNetSalary();
		tester.displayEmployeeDetails();
		
		sales.inputEmployeeDetails(); 
		sales.calculateNetSalary();
		sales.displayEmployeeDetails();
	}

}
