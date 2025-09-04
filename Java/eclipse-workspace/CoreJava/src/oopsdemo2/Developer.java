package oopsdemo2;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 3, 2025
 * Time     :4:21:35 PM
 * project  :CoreJava
*/

// child class - Inheritance - is a relationship
public class Developer extends Employee
{

	private String skillSet;
	private String projectName;
	
	// generate constructor using fields
	public Developer(int empId, String name, String skillSet, String projectName) {
		super(empId, name);  // Invokes parent class constructor by passing empID & name
		this.skillSet = skillSet;
		this.projectName = projectName;
	}
	
	  // method to display developer details
		public void displayDeveloperDetails() {
			
			System.out.println("Skill Set: " + skillSet);
			System.out.println("Project Name: " + projectName);
	}

}
