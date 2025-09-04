package oopsdemo3;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 4, 2025
 * Time     :3:15:16 PM
 * project  :CoreJava
 * 
 * Overriding is a feature that allows a subclass or
 * child class to provide a specific implementation of a method
 * that is already provided by one of its super-classes or parent classes.
*/

class Bank{
	private String name;

	public Bank(String name) {
		this.name = name;
	}


int getRateOfInterest(){
      return 0;
  }
  void display(){
      System.out.println("Welcome to "+name+" Bank");
  }
}

class SBI extends Bank{

	public SBI(String name) {
		super(name);
	}

	@Override
	int getRateOfInterest() {
		return 5;
	}	
}

class ICICI extends Bank{
	ICICI(String name) {
		super(name);
	}

	@Override
	int getRateOfInterest() {	//Method Overridden in child class
		return 7;
	}
		
}

class Axis extends Bank{

	public Axis(String name) {
		super(name);
	}

	@Override
	int getRateOfInterest() { 	//Method Overridden in child class
		
		return 6;
	}
		
}


public class OverrideDemo {

	public static void main(String[] args) {
		
		SBI sbiBank = new SBI("SBI");
		ICICI iciciBank = new ICICI("ICICI");
		Axis axisBank = new Axis("Axis");
		
		sbiBank.display();
		System.out.println("The Interest Rate of SBI is : "+sbiBank.getRateOfInterest()); 	// invoke overridden method
		
		iciciBank.display();
		System.out.println("The Interest Rate of ICICI is : "+iciciBank.getRateOfInterest());
		
		axisBank.display();
		System.out.println("The Interest Rate of Axis is : "+axisBank.getRateOfInterest());


	}

}
