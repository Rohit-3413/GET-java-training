package arraysdemo;

import java.util.Scanner;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 2, 2025
 * Time     :12:07:34 PM
 * project  :CoreJava
 * 
 *  Cinema Hall Booking with Variable Ticket Prices

👉 Rules (for example):
	Front Rows (1–2): ₹150 per seat
	Middle Rows (3–4): ₹200 per seat
	Back Row (5): ₹300 per seat
 * 
 * 
 */

public class CinemaHallBookingWithPrice {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int rows = 5;   // number of rows
		int cols = 10;  // number of seats per row
		boolean[][] seats = new boolean[rows][cols]; // false = available, true = booked
		int totalEarnings = 0; // keeps track of total earnings from bookings

		int choice;

		do {
			System.out.println("\n===== CINEMA HALL MENU =====");
			System.out.println("1. View Seating Arrangement");
			System.out.println("2. Book a Seat");
			System.out.println("3. View Total Earnings");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				// Show seating arrangement
				System.out.println("\nCinema Hall Seating (O = Available, X = Booked):\n");
				for (int i = 0; i < rows; i++) {
					for (int j = 0; j < cols; j++) {
						if (seats[i][j]) {
							System.out.print("[X] "); // booked
						} else {
							System.out.print("[O] "); // available
						}
					}
					System.out.println();
				}
				break;

			case 2:
				// Book a seat

				System.out.println("Enter how many tickets you want to buy: ");
				int ticketCount = scanner.nextInt();

				for( int t=1; t<= ticketCount; t++) {

					System.out.print("Enter row number (1-" + rows + "): ");
					int r = scanner.nextInt();
					System.out.print("Enter seat number (1-" + cols + "): ");
					int s = scanner.nextInt();

					if (r < 1 || r > rows || s < 1 || s > cols) {
						System.out.println("Invalid seat number!");
						t--; // retry this ticket
					} else if (seats[r - 1][s - 1]) {
						System.out.println("Sorry, this seat is already booked.");
						t--; // retry this ticket
					} else {
						// determine price based on row
						int ticketPrice;
						if (r <= 2) {
							ticketPrice = 150; // front rows
						} else if (r <= 4) {
							ticketPrice = 200; // middle rows
						} else {
							ticketPrice = 300; // back row
						}

						seats[r - 1][s - 1] = true;
						totalEarnings += ticketPrice;
						System.out.println("Seat [" + r + "-" + s + "] booked successfully!");
						System.out.println("Ticket Price: ₹" + ticketPrice);
					}
				}
				break;

			case 3:
				// Show total earnings
				System.out.println("Total Earnings from Tickets = ₹" + totalEarnings);
				break;

			case 4:
				System.out.println("Thank you for using Cinema Hall Booking System!");
				break;

			default:
				System.out.println("Invalid choice. Please try again.");
			}

		} while (choice != 4);

		scanner.close();
	}

}
