package oopsdemo1;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 3, 2025
 * Time     :10:44:13 AM
 * project  :CoreJava
*/

// define attributes, methods & Objects in a Single Main Class
public class Bicycle {
	
	int gear;
	
	void applyBrake()
	{
		System.out.println("Applying Brakes... ");
	}
	
	public void startCycling() {
		gear = gear + 1;
		System.out.println("Cycling in Gear No :"+gear);
	}
	

	public static void main(String[] args) {
		
		Bicycle sportsBicycle = new Bicycle();
		
		sportsBicycle.startCycling();
		sportsBicycle.startCycling();
		sportsBicycle.startCycling();
		
		sportsBicycle.applyBrake();
		
		
	}

}
