package controlflow;

import java.util.Scanner;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 1, 2025
 * Time     :10:37:15 AM
 * project  :CoreJava
 * 
 * Program to enter RollNumber, Name, Marks of 5 Subjects of a Student & calculate
 * the Aggregate Marks & Display the Result.
 */

public class StudentResult {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int rollNumber;
		String name;
		float marks1,marks2,marks3,marks4,marks5,total,agg;

		System.out.println("********** Enter Student Details ***************");
		System.out.println("Enter Student Roll Number   : ");
		rollNumber=scanner.nextInt();
		System.out.println("Enter Student Name          :");
		name=scanner.next();
		System.out.println("Enter Marks of 5 Subjects   :");
		marks1=scanner.nextInt();
		marks2=scanner.nextInt();
		marks3=scanner.nextInt();
		marks4=scanner.nextInt();
		marks5=scanner.nextInt();
		scanner.close();

		if((marks1<0 || marks1>100) || (marks2<0 || marks2>100) || (marks3<0 || marks3>100) || (marks4<0 || marks4>100) || (marks5<0 || marks5>100)) {
			System.out.println("Please Enter the valid marks");

		}
		else {

			total=marks1+marks2+marks3+marks4+marks5;
			agg=(100*total)/500;


			System.out.println("************* Student Result *******************");
			System.out.println("Roll Number                 :"+rollNumber);
			System.out.println("Student Name                :"+name);
			System.out.println("Total Marks                 :"+total);
			System.out.println("Aggregate                 :"+agg);

			if(agg>=85) {
				System.out.println("Result                            :Distinction");
			} else if(agg>=60) {
				System.out.println("Result                            :First Class");
			} else if(agg>=50) {
				System.out.println("Result                            :Second Class");
			} else if(agg>=35) {
				System.out.println("Result                            :Pass Class");
			} else {
				System.out.println("Result                            :Fail");
			}
			System.out.println("**************************************************");
		}
	}

}
