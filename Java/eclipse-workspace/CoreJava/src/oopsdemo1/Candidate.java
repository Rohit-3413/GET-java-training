package oopsdemo1;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 3, 2025
 * Time     :12:11:30 PM
 * project  :CoreJava
 * 
 * Program to demonstrate Constructors
 * Constructors are used to initialize an Object
*/

public class Candidate {
	
	private int id;
	private String name;
	private float stipend,da;
	
	  // Parameterized constructor - To initialize an Object Values
	public Candidate(int id, String name, float stipend) {
		this.id = id;
		this.name = name;
		this.stipend = stipend;
	}
	
	 public void calculateDA()
		{
			this.da=this.stipend*.10f;
		}
		
		void display()
		{
			System.out.println("************* Candidate Details ***************");
			System.out.println("Candidate Id              :"+id);
			System.out.println("Candidate Name            :"+name);
			System.out.println("Candidate Stipend         :"+stipend);
			System.out.println("Candidate Daily Allowance :"+da);
		}

}
