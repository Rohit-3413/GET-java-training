package com.coforge.training.hibernatedemo.model;

/** 
 * Author	:Rohit.10.Gupta
 * Date		:Sep 23, 2025
 * Time		:4:36:15 PM
 * Project	:hibernate-demo
 * 
 * Model class for Employee entity to save employee details using Hibernate ORM Tool
*/

public class Employee {

	private int empId;
	private String firstName, lastName;
	private double basic;
	private String dept;
	private String email;
	
	public Employee() {
		super();
	}
	
	public Employee(int empId, String firstName, String lastName, double basic, String dept, String email) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.basic = basic;
		this.dept = dept;
		this.email = email;
	}


	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}
