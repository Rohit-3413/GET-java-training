package com.coforge.training.studentsoft.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* Author	:Rohit.10.Gupta
* Date 		:Sep 30, 2025
* Time		:12:15:12 PM
* Project	:student-management
* 
* 
* Lombok is an open-source library (basically a standalone jar) capable of 
 * doing magic
 *  in automating the boilerplate code generation for any java class. 
 *  So if Lombok is in the classpath, it can quickly get rid of all the getters & setters 
 *  methods, class constructors, hashcode and equals methods and many more by adding a 
 *  couple of annotations to the class.
 *  
 *  Integrate Lombok to STS . Help --> Install new Software and add following url
 *  
 *  https://projectlombok.org/p2
 */

/*@Data  bundles the features of @ToString , @EqualsAndHashCode , @Getter / @Setter and 
@RequiredArgsConstructor together*/


@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {

	private int rollNo;
    private String firstName;
    private String lastName;
    private String gender;
    private String course;
    
    
	public Student() {
		super();
	}
	
	public Student(int rollNo, String firstName, String lastName, String gender, String course) {
		super();
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.course = course;
	}
	

	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
}

