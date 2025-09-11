package java8features;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 11, 2025
 * Time     :3:39:10 PM
 * project  :AdvanceJava
 */

public class DefaultMethodDemo {

	public static void main(String[] args) {

		Vehicle car=new Car("BMW");

		//invoke overriden methods
		System.out.println(car.getBrand());
		System.out.println(car.speedUp());
		System.out.println(car.slowDown());

		//invoke default methods
		System.out.println(car.turnAlarmOn());
		System.out.println(car.turnAlarmOff());

		//invoke static method of Interface
		System.out.println(Vehicle.getHorsePower(2500, 400));


	}

}
