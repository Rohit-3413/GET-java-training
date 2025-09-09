package assignment;

import java.util.Scanner;

public class TriangleType {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter side1: ");
		int side1 = sc.nextInt();
		
		System.out.print("Enter side2: ");
		int side2 = sc.nextInt();
		
		System.out.print("Enter side3: ");
		int side3 = sc.nextInt();
		
		if (side1 == side2 && side2 == side3)
			System.out.println("The triangle is Equilateral.");
		else if (side1 == side2 || side2 == side3 || side1 == side3)
			System.out.println("The triangle is Isosceles.");
		else
			System.out.println("The triangle is Scalene.");
		
		sc.close();
	}
}
