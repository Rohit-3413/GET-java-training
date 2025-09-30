package com.coforge.training.studentsoft.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.coforge.training.studentsoft.model.Student;

//RowMapper is a crucial component in Spring's JdbcTemplate for efficient data retrieval. 
//* It is an interface that requires you to implement a method 'mapRow(ResultSet, int)'. 
//* This method takes a ResultSet and an int, representing the current row's index, and 
//* returns an object that represents your domain object. 
//* The JdbcTemplate calls this method for each row in the result set, 
//* allowing you to map the database rows to your Java objects. 
//* This approach simplifies the data retrieval process, avoiding manual ResultSet navigation 
//* and object creation.
//* 
//* ResultSet is a virtual table in JDBC
public	 class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student=new Student();
		student.setRollNo(rs.getInt("rollNo")); //get values from table & set it to the Model properties
		student.setFirstName(rs.getString("firstName"));
		student.setLastName(rs.getString("lastName"));
		student.setGender(rs.getString("gender"));
		student.setCourse(rs.getString("course"));
		return student;
	}
}
