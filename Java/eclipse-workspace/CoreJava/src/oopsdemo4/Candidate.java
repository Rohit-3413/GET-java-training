package oopsdemo4;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 6, 2025
 * Time     :11:43:28 AM
 * project  :CoreJava
*/

//class for multiple inheritance
public class Candidate {

	String name;
	int roll_no,mark1,mark2;
	
	public Candidate(String name, int roll_no, int mark1, int mark2) {
		this.name = name;
		this.roll_no = roll_no;
		this.mark1 = mark1;
		this.mark2 = mark2;
	}
	
	void display()
	{
		System.out.println ("Name of Student: "+name);
		System.out.println ("Roll No. of Student: "+roll_no);
		System.out.println ("Marks of Subject 1: "+mark1);
		System.out.println ("Marks of Subject 2: "+mark2);
	}
	
}
