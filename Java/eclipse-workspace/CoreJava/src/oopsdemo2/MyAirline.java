package oopsdemo2;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 4, 2025
 * Time     :12:49:33 PM
 * project  :CoreJava
*/

// Airline class (Manages multiple bookings)
public class MyAirline {

	private String airlineName;
    private TicketBooking[] bookings;
    private int bookingCount;
    
	public MyAirline(String airlineName, int capacity) {
		super();
		this.airlineName = airlineName;
		this.bookings = new TicketBooking[capacity];
		this.bookingCount = 0;
	}
	
	 public void addBooking(TicketBooking booking) {
	        if (bookingCount < bookings.length) {
	            bookings[bookingCount] = booking;
	            bookingCount++;
	        } else {
	            System.out.println("⚠️ Booking limit reached!");
	        }
	    }

	    public void displayAllBookings() {
	        System.out.println("\n===== " + airlineName + " Bookings =====");
	        if (bookingCount == 0) {
	            System.out.println("No bookings available.");
	        } else {
	            for (int i = 0; i < bookingCount; i++) {
	                bookings[i].displayBooking();
	                System.out.println("---------------------------");
	            }
	        }
	    }
	    
	    public void searchBooking(String bookingId) {
	        boolean found = false;
	        for (int i = 0; i < bookingCount; i++) {
	            if (bookings[i].getBookingId().equalsIgnoreCase(bookingId)) {
	                System.out.println("\n✅ Booking Found:");
	                bookings[i].displayBooking();
	                found = true;
	                break;
	            }
	        }
	        if (!found) {
	            System.out.println("⚠️ No booking found with ID: " + bookingId);
	        }
	    }
}
