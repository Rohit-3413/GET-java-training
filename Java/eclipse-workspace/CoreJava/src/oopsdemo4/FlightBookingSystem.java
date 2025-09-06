package oopsdemo4;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 6, 2025
 * Time     :10:35:14 AM
 * project  :CoreJava
*/

//Main Class to demonstrate the flight booking system using interfaces
public class FlightBookingSystem {

	public static void main(String[] args) {
		
		// Create flights
        Flight flight1 = new CommercialFlight("AA123", "American Airlines", 
                                            "New York (JFK)", "London (LHR)", 
                                            "10:00 AM", "10:00 PM", 899.99);
        Flight flight2 = new CommercialFlight("DL456", "Delta Airlines", 
                                            "Los Angeles (LAX)", "Tokyo (HND)", 
                                            "01:00 PM", "04:00 PM (next day)", 1299.99);

        // Display flight details
        flight1.displayFlightDetails();
        flight2.displayFlightDetails();

        // Create a passenger
        Passenger passenger = new AirlinePassenger("John Smith", "P12345678", 
                                                 "john.smith@email.com", "+1-555-123-4567");

        // Create a booking
        Booking booking = new FlightBooking();
        booking.bookFlight(flight1, passenger);
        
        // Process payment
        Payment payment = new CreditCardPayment();
        payment.processPayment(flight1.getPrice());
        
        if (payment.isPaymentSuccessful()) {
            System.out.println("\nFlight booking completed successfully!");
            booking.displayBookingDetails();
        } else {
            System.out.println("\nPayment failed. Booking not confirmed.");
            booking.cancelBooking(((FlightBooking)booking).getBookingId());
        }


	}

}
