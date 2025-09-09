package assignment;

import java.util.Scanner;

class Student {
	
	private String name;
	private int yearOfJoining;
	private String address;
	
	public void setInfo(String name, int yearOfJoining, String address) {
		this.name = name;
		this.yearOfJoining = yearOfJoining;
		this.address = address;
	}
	
	public void printInfo() {
		System.out.printf("%-10s %-15d %-20s\n", name, yearOfJoining, address);
	}
}

public class StudentTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student(); 
		
		System.out.println("Enter details of 3 students: (name, yearOfJoining, address)");
		System.out.print("Student 1: ");
		
		s1.setInfo(sc.next(), sc.nextInt(), sc.next());
		System.out.print("Student 2: ");
		
		s2.setInfo(sc.next(), sc.nextInt(), sc.next());
		System.out.print("Student 3: ");
		
		s3.setInfo(sc.next(), sc.nextInt(), sc.next());
		System.out.printf("%-10s %-15s %-20s\n", "Name", "Year of Joining", "Address");
		
		s1.printInfo();
		s2.printInfo();
		s3.printInfo();
		
		sc.close();
	}
}
