package oopsdemo4;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 5, 2025
 * Time     :4:26:25 PM
 * project  :CoreJava
*/

public class AdminStaff extends HospitalStaff {
	
	private String role;

	public AdminStaff(String name, String id, String department, String role) {
		super(name, id, department);
		this.role = role;
	}

	@Override
	public void performDuties() {
		
		 System.out.println(getName() + " is performing " + role + 
                 " tasks in the " + getDepartment() + " department.");	        
		
	}
	
	public void processPaperwork() {
        System.out.println(getName() + " is processing hospital paperwork.");
    }
	
	
}
