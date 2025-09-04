package oopsdemo2;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 4, 2025
 * Time     :11:49:31 AM
 * project  :CoreJava
*/

public class Student {

	int rollNo;
	String name;
	
	Address ad; // Entity Reference - Aggregation - has a relationship
	
	// Student has an Address - Unidirectional Relationship
	public Student(int rollNo, String name, Address ad) 
	{
		this.rollNo = rollNo;
		this.name = name;
		this.ad = ad;
	}
	
	 void display()
		{
			System.out.println("---------- Student Details ------------");
			System.out.println("Student Id   :"+rollNo );
			System.out.println("Student Name :"+name);
			
			System.out.println("Address: "+ad.city+" "+ad.state+" "+ad.country+" "+
			ad.pincode);
		}
	
	
}
