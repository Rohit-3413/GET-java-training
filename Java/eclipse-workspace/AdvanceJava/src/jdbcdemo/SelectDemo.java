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
	System.out.println("MySQL Driver Loaded Successfully.");
	
	// Step 2: Establish Connection
		conn = DriverManager.getConnection(URL, USER, PASSWORD);
		System.out.println("Connected to Database Successfully");
		
	// Step 3: Create Statement
		stmt = conn.createStatement();
		
	// Step 4: Execute Query
		String sql = "SELECT id, name, department, salary FROM employees";
		rs = stmt.executeQuery(sql);
		
		System.out.println("------- Employee Records ------");
		
	// Step 5: Process ResultSet
		while(rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String department = rs.getString("department");
			double salary = rs.getDouble("salary");
			
			System.out.printf("ID:%d | Name:%s | Department:%s | Salary: %.2f%n", id, name, department, salary);
		}
		
}
			
		catch (Exception e) {
			System.out.println("Database operation failed.");
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
			System.out.println(" Resources Closed.");
				
			}
	}
	
}

	


