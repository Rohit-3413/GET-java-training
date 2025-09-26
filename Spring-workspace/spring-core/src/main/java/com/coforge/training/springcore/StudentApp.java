package com.coforge.training.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.training.springcore.model.Student;

/**
* Author	:Rohit.10.Gupta
* Date 		:Sep 26, 2025
* Time		:4:23:14 PM
* Project	:spring-core
* 
* Spring App to demonstrate DI using Setter Method with XMl Config
*/

public class StudentApp {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("StudentConfig.xml");
		
		//Get the Student 
		Student s1=(Student) context.getBean("student1");
		Student s2=(Student) context.getBean("student2");
		
		System.out.println("************ Student Details **************");
		System.out.println(s1.getRollNo()+" "+s1.getName()+" "+s1.getCollege()+" "+s1.getMarks());
		System.out.println(s2.getRollNo()+" "+s2.getName()+" "+s2.getCollege()+" "+s2.getMarks());
		
		((ClassPathXmlApplicationContext) context).close();
		
		
	}

}
