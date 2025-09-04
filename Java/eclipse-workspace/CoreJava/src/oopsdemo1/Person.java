package oopsdemo1;

import java.util.Scanner;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 3, 2025
 * Time     :2:15:35 PM
 * project  :CoreJava
 * 
 * Program to demonstrate working of constructors
*/

 class Person {

	private String name,constituency;
		private int age;
		private Scanner s;
 
 public Person()
 {
	 
	  System.out.println("Voter Eligibility App");
			age=0;
			name="";
			constituency="Bengaluru";
			s=new Scanner(System.in);
 }
 
 public Person(String name, int age) { // parameterized constructor 2 args
	 this.name = name;
	 this.age = age;
	 this.constituency="Mumbai";
 }

		 // parameterized constructor 3 args
		public Person(String name, String constituency, int age) 
		{
			this.name = name;
			this.constituency = constituency;
			this.age = age;
		}
		
		 
	    void input()
		{
			System.out.println("Enter ur Name:");
			name=s.nextLine();
			System.out.println("Enter ur Age:");
			age=s.nextInt();
		}
		
		void print()
		{
			System.out.println("Name is :"+name);
			System.out.println("Age is :"+age);
			System.out.println("Constituency is :"+constituency);
		}
			
}
 
 
