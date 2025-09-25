package com.coforge.training.hiberweb.model;

import jakarta.persistence.*;
/** 
 * Author	:Rohit.10.Gupta
 * Date		:Sep 25, 2025
 * Time		:12:11:23 PM
 * Project	:hiber-web
 * 
 *  Model class created using Annotation Configuration
*/
@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    private String name;
    private String department;
    private Double salary;
    
	public Employee() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
}
