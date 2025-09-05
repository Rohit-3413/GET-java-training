package oopsdemo3;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 5, 2025
 * Time     :9:59:46 AM
 * project  :CoreJava
*/

public class Ticket {
	
	private String movieName;
    private double price;
	
    public Ticket(String movieName, double price) {
		this.movieName = movieName;
		this.price = price;
	}
    
    
    public void showTicketDetails() {
        System.out.println("Movie: " + movieName);
        System.out.println("Price: " + price);
    }
    
}
