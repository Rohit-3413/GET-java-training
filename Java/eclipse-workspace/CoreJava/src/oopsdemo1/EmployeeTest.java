package oopsdemo1;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 2, 2025
 * Time     :4:42:19 PM
 * project  :CoreJava
*/

public class EmployeeTest {

	public static void main(String[] args) {
		
		// create Objects e1, e2, e3 of Employee Class
		Employee e1 = new Employee();   // Invoke default Constructor
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		// Invoke Methods (Method call)
		e1.inputEmployeeDetails(); // p1.eat();
		e1.calculateNetSalary();
		e1.displayEmployeeDetails();
		
		e2.inputEmployeeDetails(); 
		e2.calculateNetSalary();
		e2.displayEmployeeDetails();
		
		e3.inputEmployeeDetails(); 
		e3.calculateNetSalary();
		e3.displayEmployeeDetails();
	}

}
