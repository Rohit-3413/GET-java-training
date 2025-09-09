package assignment;

import java.util.Scanner;

public class ITCityCheck {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a city name: ");
		String city = sc.nextLine();
		
		switch (city.toLowerCase()) {
		case "delhi":
		case "mumbai":
		case "kolkatta":
		case "bangalore":
		case "chennai":
		case "hyderabad":
			System.out.println(city + " is an IT City.");
			break;
		default:
			System.out.println(city + " is not an IT City.");
			
			sc.close();
		}
	}
}
