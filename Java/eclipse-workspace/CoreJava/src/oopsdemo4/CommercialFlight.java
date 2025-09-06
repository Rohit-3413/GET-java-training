package oopsdemo4;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 6, 2025
 * Time     :10:09:12 AM
 * project  :CoreJava
*/

public class CommercialFlight implements Flight {
	
	private String flightNumber;
    private String airline;
    private String departure;
    private String arrival;
    private String departureTime;
    private String arrivalTime;
    private double price;
    
	public CommercialFlight(String flightNumber, String airline, String departure, String arrival, String departureTime,
			String arrivalTime, double price) {
		this.flightNumber = flightNumber;
		this.airline = airline;
		this.departure = departure;
		this.arrival = arrival;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.price = price;
	}

	@Override
	public String getFlightNumber() {
		
		return flightNumber;
	}

	@Override
	public String getAirline() {
		
		return airline;
	}

	@Override
	public String getDeparture() {
		
		return departure;
	}

	@Override
	public String getArrival() {
		
		return arrival;
	}

	@Override
	public double getPrice() {
		
		return price;
	}

	@Override
	public void displayFlightDetails() {

		 
	    System.out.println("\nFlight Details:");
	        System.out.println("Flight Number: " + flightNumber);
	        System.out.println("Airline: " + airline);
	        System.out.println("Route: " + departure + " to " + arrival);
	        System.out.println("Departure: " + departureTime);
	        System.out.println("Arrival: " + arrivalTime);
	        System.out.println("Price: $" + price);
		
	}
     

}
