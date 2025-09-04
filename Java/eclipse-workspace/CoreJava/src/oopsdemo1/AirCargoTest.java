package oopsdemo1;

import java.util.Scanner;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 3, 2025
 * Time     :2:45:43 PM
 * project  :CoreJava
*/

public class AirCargoTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        AirCargo[] cargos = new AirCargo[25];  // max 25 booking
        int bookingCount = 0;
        int choice;

        do {
            System.out.println("\n====== Sita Air Cargo Booking System ======");
            System.out.println("1. Book Cargo");
            System.out.println("2. Update Weight");
            System.out.println("3. Generate Bill");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Booking ID: ");
                    String bookingId = sc.nextLine();

                    System.out.print("Enter Sender Name: ");
                    String senderName = sc.nextLine();

                    System.out.print("Enter Destination: ");
                    String destination = sc.nextLine();

                    System.out.print("Enter Cargo Weight (kg): ");
                    double weight = sc.nextDouble();

                    System.out.print("Enter Cost per Kg: ");
                    double costPerKg = sc.nextDouble();

                    cargos[bookingCount] = new AirCargo(bookingId, senderName, destination, weight, costPerKg);
                    cargos[bookingCount].bookCargo();
                    bookingCount++;
                    break;

                case 2:
                    if (bookingCount > 0) {
                        System.out.print("Enter Booking Id to update weight (kg): ");
                        String updateId = sc.nextLine();
                        boolean found = false;
                        
                        for( int i=0; i<bookingCount; i++) {
                        	if(cargos[i].getBookingId().equals(updateId)) {
                        	System.out.println("Enter new weight (kg): ");
                        	double newWeight  = sc.nextDouble();
                        	cargos[i].setWeight(newWeight);
                        	System.out.println(" Weight updated successfully!");
                        	found = true;
                        	break;
                        }
                     
                        if(!found) {
                        	System.out.println("Booking ID not found..");
                        }
                        else
                        {
                        	System.out.println("Please book cargo first !");
                        }
                      }
                   }
                        break;
                        
                       
                   case 3:
                    if (bookingCount > 0) {
                    	System.out.println("\n==== All Cargo Bills ====");
                    	for(int i = 0; i < bookingCount; i++) {
                        cargos[i].generateBill();
                    	}
                    } else {
                        System.out.println("⚠️ No booking found! Please book cargo first.");
                    }
                    break;

                case 4:
                    System.out.println("🚪 Exiting... Thank you for using Air Cargo Booking System!");
                    break;

                default:
                    System.out.println("❌ Invalid choice! Try again.");
            }
        } while (choice != 4);

        sc.close();



	}

}
