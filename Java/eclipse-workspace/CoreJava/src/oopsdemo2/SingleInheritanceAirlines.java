package oopsdemo2;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 3, 2025
 * Time     :4:55:09 PM
 * project  :CoreJava
*/

public class SingleInheritanceAirlines {

	public static void main(String[] args) {

		//Create booking (child class object)
		AirlineBooking booking1 = new AirlineBooking("James", 32, "FG567766");
		
		booking1.bookTicket();
		booking1.displayPassengerDetails();
		booking1.displayBookingDetails();
		
		// Create booking 
		AirlineBooking booking2 = new AirlineBooking("James", 32, "FG567766");
		
		booking2.bookTicket();
		booking2.displayPassengerDetails();
		booking2.displayBookingDetails();
		

	}

}
