package businesscode;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Oct 4, 2025
 * Time     :2:25:12 PM
 * project  :JunitDemo
*/

public class Employee {

	private int empId;
    private String firstName;
    private String lastName;
    private String designation;
    private double basic;
    private double hra;
    private double da;
    private double grossSalary;
    private double netSalary;
    private static final double TAX = 1000.0;
    
    
	public Employee(int empId, String firstName, String lastName, String designation, double basic) {
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.designation = designation;
		this.basic = basic;
	}


	public int getEmpId() {
		return empId;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public String getDesignation() {
		return designation;
	}


	public double getBasic() {
		return basic;
	}


	public double getHra() {
		return hra;
	}


	public double getDa() {
		return da;
	}


	public double getGrossSalary() {
		return grossSalary;
	}


	public double getNetSalary() {
		return netSalary;
	}


	public static double getTax() {
		return TAX;
	}
	
	// Business logic
    public void calculateNetSalary() {
        hra = basic * 0.15;
        da = basic * 0.10;
        grossSalary = basic + hra + da;
        netSalary = grossSalary - TAX;
    }
  
  
  // Display details
    public void displayEmployeeDetails() {
        System.out.println("************* Employee Salary Details ***********");
        System.out.println("Employee Id   :  " + empId);
        System.out.println("Employee Name :  " + firstName + " " + lastName + " - " + designation);
        System.out.println("Basic Salary  :  " + basic);
        System.out.println("HRA           :  " + hra);
        System.out.println("DA            :  " + da);
        System.out.println("Gross Salary  :  " + grossSalary);
        System.out.println("Tax           :  " + TAX);
        System.out.println("-----------------------------------------------");
        System.out.println("Net Salary    :  " + netSalary);
        System.out.println("-----------------------------------------------");
    }
    
    
}
