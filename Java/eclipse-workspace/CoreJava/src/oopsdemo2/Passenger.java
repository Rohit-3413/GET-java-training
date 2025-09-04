package oopsdemo2;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 3, 2025
 * Time     :4:43:14 PM
 * project  :CoreJava
*/

	//  Single Inheritance example in Java for an Airline Booking System
	 

	public class Passenger {
		
		 private String name;
		    private int age;
		    private String passportNumber;
		    
		  
		    //Parameterized constructor
			public Passenger(String name, int age, String passportNumber) {
				this.name = name;
				this.age = age;
				this.passportNumber = passportNumber;
			}
		    
		    
		      
		       public void displayPassengerDetails() {
		        System.out.println("----- Passenger Details -----");
		        System.out.println("Name: " + name);
		        System.out.println("Age: " + age);
		        System.out.println("Passport Number: " + passportNumber);
		    }


		
	}

