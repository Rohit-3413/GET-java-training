package com.coforge.training.studentsoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.training.studentsoft.dao.StudentDAO;
import com.coforge.training.studentsoft.model.Student;

/**
* Author	:Rohit.10.Gupta
* Date 		:Sep 30, 2025
* Time		:12:36:53 PM
* Project	:student-management
* 
* 
* The Service Layer in Spring Boot is a crucial concept in Java-based applications. 
 * It acts as an interface between the Controller and Repository layers, 
 * handling business logic and encapsulating complex functionalities. 
 * A Service layer typically contains classes that interact with the Repository 
 * to retrieve or update data, and with the Controller to handle HTTP requests 
 * and responses. 
 * It's responsible for coordinating the flow of data and ensuring data consistency 
 * across the application. 
 * 
 * In Spring Boot, you can create services by annotating classes with @Service and 
 * using autowiring to inject dependencies.
 * The @Service annotation in Spring Boot is a stereotype annotation that 
 * marks a class as a service provider. 
 * It is used to indicate that a class contains business logic.
 * It organize and manage business logic in your Spring Boot application.
*/

//Inject Object of repository class to perform DB Operations
@Service
public class StudentService {

	@Autowired
	private StudentDAO studentDAO;
	
	public int save(Student stud) {
		return studentDAO.save(stud); // call save method of DAO class
	}
	
	public List<Student> getAllStudents() {
		return studentDAO.listAll();	// call listAll method of DAO class
	}
	
	public int update(Student student) {	
		return studentDAO.update(student); //call update method of DAO class
	}
	
	public int delete(int rollNo) {	
		return studentDAO.delete(rollNo); //call delete method of DAO class
	}
	
	public Student getSingleStudent(int rollNo) {	
		return studentDAO.get(rollNo); //call get method of DAO class
	}
}

