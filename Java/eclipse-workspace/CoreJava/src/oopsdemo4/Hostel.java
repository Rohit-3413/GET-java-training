package oopsdemo4;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 6, 2025
 * Time     :11:34:51 AM
 * project  :CoreJava
*/

public class Hostel {
	
	String name, location;

	//generate constructors using fields
	public Hostel(String name, String location) {
		this.name = name;
		this.location = location;
	}
	
	//generate getters
	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}
	
}
