package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 11, 2025
 * Time     :9:40:57 AM
 * project  :AdvanceJava
 */

// Utility class to create connection with MYSQL database

public class ConnectionUtil {

	public static Connection createConnection() throws Exception {

		// Load the MySQL JDBC driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Establish the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc","root","Rgsql123");
		return con;
	}

}
