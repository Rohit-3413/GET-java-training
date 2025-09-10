package jdbcdemo;

import java.sql.*;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 10, 2025
 * Time     :2:12:21 PM
 * project  :AdvanceJava
 */

public class SelectDemo {

	// Database credentials
	private static final String URL = "jdbc:mysql://localhost:3306/classicmodels";
	private static final String USER = "root";
	private static final String PASSWORD = "Rgsql123";

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {

			// Step 1: Load MySQL JDBC Driver ( optional for JDBC 4.0+, but safer)
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("✅ MySQL Driver Loaded Successfully.");

			// Step 2: Establish Connection
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("✅ Connected to Database Successfully");

			// Step 3: Create Statement
			stmt = conn.createStatement();

			// Step 4: Execute Query
			String sql = "SELECT customerNumber, customerName, city, creditLimit FROM customers";
			rs = stmt.executeQuery(sql);

			System.out.println("------- Customers Records ------");

			// Step 5: Process ResultSet
			while(rs.next()) {
				int id = rs.getInt("customerNumber");
				String name = rs.getString("customerName");
				String city = rs.getString(3);
				double credit = rs.getDouble(4);

				System.out.printf("CustomerID: %d | Customer Name: %s | City: %s | "+ "CreditLimit: %.2f%n", id, name, city, credit);
			}

		}

		catch (Exception e) {
			System.out.println("❌ Database operation failed.");
			e.printStackTrace();
		}
		finally {
			// Step 6: Close resources manually
			try {
				if( rs!=null) rs.close(); if(stmt != null) stmt.close();  if(conn != null) conn.close();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("✅ Resources Closed.");

		}
	}

}




