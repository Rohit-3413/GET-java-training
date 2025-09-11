package jdbcdemo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 11, 2025
 * Time     :12:07:03 PM
 * project  :AdvanceJava
*/

public class Skills {
	
	Connection con;
	CallableStatement cstmt;
	ResultSet rs;
	
	int id;
	
	public Skills() throws Exception {
		con=ConnectionUtil.createConnection();
		
	}
	
	public void getSkills(int candidateId) throws Exception
	{
		//call SP with single param
		cstmt=con.prepareCall("{ call get_candidate_skill(?) }");
		cstmt.setInt(1, candidateId);
		rs=cstmt.executeQuery();
		
		// Check if the ResultSet is empty
	    if (!rs.next()) {
	        System.out.println("No Skills");
	    } else {
	        // If there is data, process it
	        do {
	            System.out.println(String.format("%s - %s",
	                    rs.getString("first_name") + " "
	                    + rs.getString("last_name"),
	                    rs.getString("skill")));
	        } while (rs.next());
	    }
		
		/*
		 * while (rs.next()) { System.out.println(String.format("%s - %s",
		 * rs.getString("first_name") + " " + rs.getString("last_name"),
		 * rs.getString("skill"))); }
		 */
		
		con.close();
}
}
