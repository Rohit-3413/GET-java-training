package oopsdemo4;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 5, 2025
 * Time     :2:53:32 PM
 * project  :CoreJava
*/

public class CargoShipment {
	
	private String shipmentId;
    private String sender;
    private String receiver;
    private double weight;   // in kg
    private String destination;
    private String cargoType;
    
    
    // Constructor 2: Shipment with sender, receiver, and weight
	public CargoShipment(String shipmentId, String destination)
	{
		this.shipmentId = shipmentId;
		this.destination = destination;
		this.weight =0.0;
		this.cargoType ="General";
	}

	// Constructor 2: Shipment with sender, receiver, and weight
	public CargoShipment(String shipmentId, String sender, String receiver, double weight)
	{
		this.shipmentId = shipmentId;
		this.sender = sender;
		this.receiver = receiver;
		this.weight = weight;
		this.cargoType ="General";
	}

	// Constructor 3: Shipment with all details
	public CargoShipment(String shipmentId, String sender, String receiver, double weight, String destination,
			String cargoType) {
		this.shipmentId = shipmentId;
		this.sender = sender;
		this.receiver = receiver;
		this.weight = weight;
		this.destination = destination;
		this.cargoType = cargoType;
	}
	
}
