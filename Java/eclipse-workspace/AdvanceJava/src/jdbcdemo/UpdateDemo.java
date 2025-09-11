package jdbcdemo;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 11, 2025
 * Time     :11:22:38 AM
 * project  :AdvanceJava
*/

public class UpdateDemo {

	public static void main(String[] args) {

		Candidates c1 = new Candidates();
		
		System.out.println("********** Update Candidate Details **********");
		try
		{
			c1.getConnection();
			c1.UpdateCandidate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
