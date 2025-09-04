package arraysdemo;

import java.util.Scanner;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 2, 2025
 * Time     :11:42:34 AM
 * project  :CoreJava
 * 
 * Program: Employee Names and Salaries using Parallel 1-D Arrays
*/

public class EmployeeDetailsArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Input number of employees
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Arrays to store employee names and salaries
        String[] names = new String[n];
        double[] salaries = new double[n];
        double total = 0;
        double highest = 0;
        int highestEmployee = 0;

        // Input employee details
        System.out.println("\nEnter employee details:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of Employee " + (i + 1) + ": ");
            names[i] = sc.nextLine();

            System.out.print("Enter salary of " + names[i] + ": ");
            salaries[i] = sc.nextDouble();
            sc.nextLine(); // consume newline

            total += salaries[i];

            if (salaries[i] > highest) {
                highest = salaries[i];
                highestEmployee = i;
            }
        }

        // Calculate average salary
        double average = total / n;

        // Display salary report
        System.out.println("\n--- Employee Salary Report ---");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + names[i] + " - " + salaries[i]);
        }
        System.out.println("Total Salary Expense: " + total);
        System.out.println("Average Salary: " + average);
        System.out.println("Highest Salary: " + names[highestEmployee] + " with " + highest);

        // Search feature by name
        System.out.print("\nEnter employee name to search salary: ");
        String searchName = sc.nextLine();
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (names[i].equalsIgnoreCase(searchName)) {
                System.out.println("Salary of " + names[i] + " is: " + salaries[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found!");
        }

        sc.close();

	}

}
