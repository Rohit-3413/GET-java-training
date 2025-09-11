package jdbcdemo;

import java.util.Scanner;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 11, 2025
 * Time     :12:06:37 PM
 * project  :AdvanceJava
*/

public class CallableStatementDemo {

	public static void main(String[] args) {

		try {
			Skills s=new Skills();
			Scanner scan=new Scanner(System.in);
			
			System.out.println("Enter Candidate Details to get Skills: ");
			
			System.out.println("Enter Candidate Id : ");
			int id=scan.nextInt();
			
			s.getSkills(id);
			scan.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
