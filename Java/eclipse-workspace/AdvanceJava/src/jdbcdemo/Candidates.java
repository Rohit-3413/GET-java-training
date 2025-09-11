package jdbcdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 11, 2025
 * Time     :11:23:07 AM
 * project  :AdvanceJava
 */

//Instance class to Update data in candidates table using PreparedStatement
public class Candidates {

	Connection con;
	PreparedStatement pstmt; // Accepts values at run time - pre compiled statements
	ResultSet rs;

	int cnt=0;
	String sqlUpdate;
	Scanner s;
	int eid;
	String newLastname;

	public void getConnection() throws Exception
	{
		con=ConnectionUtil.createConnection();
	}

	public void UpdateCandidate() throws Exception
	{
		sqlUpdate="UPDATE candidates SET last_name = ? WHERE id = ?";

		pstmt=con.prepareStatement(sqlUpdate);

		// prepare data for update
		s=new Scanner(System.in);
		System.out.println("enter Employee id:");
		eid=s.nextInt();
		System.out.println("enter employee's new last name :");
		newLastname=s.next();

		// passing values to prepared statement using setter methods
		pstmt.setString(1, newLastname);
		pstmt.setInt(2, eid);

		cnt=pstmt.executeUpdate();
		System.out.println(String.format("Row affected : %d", cnt));

		// reuse the prepared statement
		newLastname = "Clinton";
		eid = 101;
		pstmt.setString(1, newLastname);
		pstmt.setInt(2, eid);

		cnt = pstmt.executeUpdate();
		System.out.println(String.format("Row affected %d", cnt));
		con.close();
	}
}
