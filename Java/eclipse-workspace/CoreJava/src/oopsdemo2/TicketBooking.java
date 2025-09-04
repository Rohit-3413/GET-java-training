package oopsdemo2;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 4, 2025
 * Time     :12:37:30 PM
 * project  :CoreJava
 * 
 * TicketBooking class (Has-A Payment using Composition)
*/

public class TicketBooking {

		private String bookingId;
	    private String passengerName;
	    private String flightNumber;
	    private String destination;
	    private Payment payment;   // Composition → Strong Has-A
	    
	    
		public TicketBooking(String bookingId, String passengerName, String flightNumber, String destination,
				String paymentId, double amount, String mode) 
		{
			super();
			this.bookingId = bookingId;
			this.passengerName = passengerName;
			this.flightNumber = flightNumber;
			this.destination = destination;
			
			// Composition -> Payment is created with Booking
			this.payment = new Payment(paymentId, amount, mode);
		}
	    

	     public void displayBooking() {
		        System.out.println("\n===== Booking Details =====");
		        System.out.println("Booking ID: " + bookingId);
		        System.out.println("Passenger: " + passengerName);
		        System.out.println("Flight Number: " + flightNumber);
		        System.out.println("Destination: " + destination);
		        payment.displayPayment(); // Delegation
		    }

		    public String getBookingId() {
		        return bookingId;
		    }
	
}
