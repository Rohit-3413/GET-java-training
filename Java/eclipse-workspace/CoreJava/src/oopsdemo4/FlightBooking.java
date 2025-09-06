package oopsdemo4;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 6, 2025
 * Time     :10:14:44 AM
 * project  :CoreJava
*/

public class FlightBooking implements Booking {
	
	private String bookingId;
    private Flight flight;  //has-a Relationship
    private Passenger passenger; //has-a Relationship
    private boolean isConfirmed;
    
	public FlightBooking() {
		
		this.bookingId = "BK" + (int)(Math.random() * 10000);
		this.isConfirmed = false;
	}

	public String getBookingId() {
		return bookingId;
	}

	@Override
	public void bookFlight(Flight flight, Passenger passenger) {
		  this.flight = flight;
	        this.passenger = passenger;
	        this.isConfirmed = true;
	        System.out.println("\nBooking confirmed!");
	        System.out.println("Booking ID: " + bookingId);
		
	}

	@Override
	public void cancelBooking(String bookingId) {
		  
        if (this.bookingId.equals(bookingId) && isConfirmed) {
            isConfirmed = false;
            System.out.println("\nBooking " + bookingId + " has been cancelled.");
        } else {
            System.out.println("\nInvalid booking ID or booking already cancelled.");
        }
		
	}

	@Override
	public void displayBookingDetails() {
		
		 System.out.println("\n--- Booking Details ---");
	        System.out.println("Booking ID: " + bookingId);
	        System.out.println("Status: " + (isConfirmed ? "Confirmed" : "Cancelled"));
	        if (isConfirmed) {
	            flight.displayFlightDetails();
	            System.out.println("\nPassenger Details:");
	            System.out.println("Name: " + passenger.getName());
	            System.out.println("Passport: " + passenger.getPassportNumber());
	            System.out.println("Contact: " + passenger.getContactInfo());
	        }
	    }
		
}
	
   
