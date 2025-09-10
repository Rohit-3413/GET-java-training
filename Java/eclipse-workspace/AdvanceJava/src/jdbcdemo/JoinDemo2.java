package jdbcdemo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 10, 2025
 * Time     :4:25:08 PM
 * project  :AdvanceJava
 */

public class JoinDemo2 {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/coforgedb";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "Rgsql123";

	public static void main(String[] args) {

		//main

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// 1. Register JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. Open a connection
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

			// 3. Create and execute statement
			stmt = conn.createStatement();
			String sql = "SELECT e.emp_id, e.first_name, e.last_name, " +
					"e.dob, e.status, d.dept_name, d.d_id " +
					"FROM employees e JOIN departments d ON e.dept_id = d.d_id " +
					"ORDER BY e.last_name, e.first_name";
			rs = stmt.executeQuery(sql);

			// 4. Display results
			System.out.println("Employee Records with Department Information");
			System.out.println("--------------------------------------------------------------------------------------------------");
			System.out.printf("%-5s %-20s %-50s %-10s %-12s %-2s %-20s%n ","Emp ID" , "First name", "Last name" , "DOB" , "Status", "DESC" , "Dept ID");
			System.out.println("--------------------------------------------------------------------------------------------------");

			while (rs.next()) {
				int empId = rs.getInt("emp_id");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				Date dob = rs.getDate("dob");
				int status = rs.getInt("STATUS");
				String dsc = rs.getString("dept_name");
				int dId = rs.getInt("d_id"); 
				System.out.printf("%-5s %-20s %-50s %-10s %-12s %-2s %-20s%n", empId, firstName, lastName, dob, status, dsc, dId);
				
				System.out.println(empId+"   "+firstName+"   "+lastName+"   "+dob+"   "+status+"   "+ dsc+"   "+dId);
			}
		} catch (ClassNotFoundException e) {
			System.err.println("JDBC Driver not found: " + e.getMessage());
		} catch (SQLException e) {
			System.err.println("Database error occurred:");
			e.printStackTrace();
		} finally {
			// 5. Close resources in reverse order
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					System.err.println("Error closing ResultSet: " + e.getMessage());
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					System.err.println("Error closing Statement: " + e.getMessage());
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					System.err.println("Error closing Connection: " + e.getMessage());
				}
			}
		}

	}

}
