package jdbcdemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 11, 2025
 * Time     :9:45:27 AM
 * project  :AdvanceJava
 */

public class ScrollableDemo {

	public static void main(String[] args) {

		Connection con=null;
		Statement stmt;
		ResultSet rs;

		try {
			con = ConnectionUtil.createConnection();

			// Create Scrollable ResultSet
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

			rs=stmt.executeQuery("select * from skills");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"  "+rs.getString(2));
			}

			System.out.println("********** Display Records from Bottom to Top ********* ");
			rs.afterLast(); // read from bottom to top
			while(rs.previous())
			{
				System.out.println(rs.getInt(1)+"  "+rs.getString(2));
			}

			System.out.println("*****************Display 3rd Record***********************");
			rs.absolute(3); // move the cursor to 3rd record
			System.out.println(rs.getInt(1)+"  "+rs.getString(2));
			System.out.println("**********************************************************");

			System.out.println("************Display 2nd record using relative()***********");
			rs.relative(-2); // move the cursor to 2nd record using relative
			System.out.println(rs.getInt(1)+"  "+rs.getString(2));
			System.out.println("**********************************************************");

			System.out.println("************Display First record using first()***********");
			rs.first(); // move the cursor to first record
			System.out.println(rs.getInt(1)+"  "+rs.getString(2));
			System.out.println("**********************************************************");

			rs.absolute(4);
			System.out.println("Current Cursor Position : "+rs.getRow());

			rs.last();
			System.out.println("Total no. of Records:"+rs.getRow());

			con.close();
		}
		catch(Exception e){ 

			System.out.println(e);
		}  

	}


}

