package java8features;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 11, 2025
 * Time     :3:40:13 PM
 * project  :AdvanceJava
*/

public class Car implements Vehicle {

		private String brand;
		
		Car(String brand)
		{
			this.brand = brand;
		}
		
	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return brand;
	}

	@Override
	public String speedUp() {
		// TODO Auto-generated method stub
		return "Car is Speeding Up  !!!";
	}

	@Override
	public String slowDown() {
		// TODO Auto-generated method stub
		return "Car is Slowing Down  !!!";
	}

}
