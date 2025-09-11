package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 11, 2025
 * Time     :11:10:20 AM
 * project  :AdvanceJava
 * 
 * JDBC program that inserts candidate records into a candidates table using PreparedStatement 
 * and Scanner for user input.
*/

public class CandidatesInsertDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// Database connection details
        String url = "jdbc:mysql://localhost:3306/mysqljdbc";
        String user = "root";
        String password = "Rgsql123";

        // SQL Insert query (id is auto-increment, so no need to insert manually)
        String insertQuery = "INSERT INTO candidates (first_name, last_name, dob, phone, email) "
        		+ "VALUES (?, ?, ?, ?, ?)";

        //Used try-with-resources to auto-close Connection and PreparedStatement.
        try (Connection conn = DriverManager.getConnection(url, user, password);
        		
        	//PreparedStatement prevents SQL injection and is safer than Statement.
             PreparedStatement pstmt = conn.prepareStatement(insertQuery)) {
        	
        	System.out.println("Enter Candidate Details:");
        	
            System.out.print("Enter First Name: ");
            String firstName = sc.nextLine();

            System.out.print("Enter Last Name: ");
            String lastName = sc.nextLine();

            System.out.print("Enter Date of Birth (yyyy-mm-dd): ");
            String dob = sc.nextLine();

            System.out.print("Enter Phone Number: ");
            String phone = sc.nextLine();

            System.out.print("Enter Email: ");
            String email = sc.nextLine();

            // Set values in PreparedStatement
            pstmt.setString(1, firstName);
            pstmt.setString(2, lastName);
            pstmt.setString(3, dob);
            pstmt.setString(4, phone);
            pstmt.setString(5, email);

            // Execute update
            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("✅ Candidate inserted successfully!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }

	}

}
