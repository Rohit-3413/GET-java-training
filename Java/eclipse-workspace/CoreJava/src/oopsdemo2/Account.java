package oopsdemo2;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 4, 2025
 * Time     :9:48:22 AM
 * project  :CoreJava
*/

//Multilevel Inheritance
// base class for SavingsBank

public class Account {
	

    int accNo;
	String name;
	
	public Account(int accNo, String name) {
		this.accNo = accNo;
		this.name = name;
	}
  
	 
	  void display()
		{
			System.out.println("************ Account Details ************");
			System.out.println("Account Number :"+accNo);
			System.out.println("Customer Name :"+name);
		}
}
