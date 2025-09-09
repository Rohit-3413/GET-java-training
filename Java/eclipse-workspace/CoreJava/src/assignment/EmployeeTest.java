package assignment;


public class EmployeeTest {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.getInfo(480, 7); // Example input
		
		emp.addSal();
		
		emp.addWork();
		
		emp.printFinalSalary();
	}
}
