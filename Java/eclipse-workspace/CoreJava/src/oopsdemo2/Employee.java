package oopsdemo2;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 3, 2025
 * Time     :4:18:49 PM
 * project  :CoreJava
 * 
 * Single Inheritance Example
 * parent class/base class/super class
*/

public class Employee {

	private int empId;
	private String name;

public Employee(int empId, String name) {
	this.empId = empId;
	this.name = name;
}

void display()
	{
		System.out.println("********** Employee Details ***************");
		System.out.println("Employee Id :"+empId);
		System.out.println("Employee Name: "+name);
	}
	

}

