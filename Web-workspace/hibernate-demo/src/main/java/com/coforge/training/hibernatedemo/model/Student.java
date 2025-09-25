package com.coforge.training.hibernatedemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/** 
 * Author	:Rohit.10.Gupta
 * Date		:Sep 24, 2025
 * Time		:12:19:48 PM
 * Project	:hibernate-demo
 * 
 * Entity class for Student using Annotation Configuration
*/

@Entity
@Table(name="students")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int rollNumber;
	
	private String name, branch;
	
	@Column(name="score")
	private double marks;
	
	// Getters and Setters
	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
}
