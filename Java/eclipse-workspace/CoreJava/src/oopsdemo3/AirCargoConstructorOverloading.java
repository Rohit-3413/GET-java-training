package oopsdemo3;

import oopsdemo4.CargoShipment;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 5, 2025
 * Time     :4:14:10 PM
 * project  :CoreJava
*/

public class AirCargoConstructorOverloading {

	public static void main(String[] args) {
		
		// Using constructor 1
        CargoShipment shipment1 = new CargoShipment("CARGO101", "New York");

        // Using constructor 2
        CargoShipment shipment2 = new CargoShipment("CARGO102", "Alice", "Bob", 120.5);

        // Using constructor 3
        CargoShipment shipment3 = new CargoShipment("CARGO103", "Delta Logistics", "Tech Corp", 500.0, "London", "Electronics");

        // Display all shipments
        shipment1.showShipmentDetails();
        shipment2.showShipmentDetails();
        shipment3.showShipmentDetails();

	}

}
