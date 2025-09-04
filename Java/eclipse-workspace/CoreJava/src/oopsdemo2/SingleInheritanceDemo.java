package oopsdemo2;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 3, 2025
 * Time     :4:30:21 PM
 * project  :CoreJava
*/

public class SingleInheritanceDemo {

	public static void main(String[] args) {

		// Create Objects of Child Class
		Developer d1 = new Developer(101, "James Gosling", "JDBC", "Santender Bank"); // Invoke derived class constructor
		Developer d2 = new Developer(105, "Rod Jhonson", "Spring Framework", "Virgin Atlantic");
		
		d1.display();  // child class object invokes parent class method - inheritance
		d1.displayDeveloperDetails(); // child class object invoke child class method
		
		d2.display();
		d2.displayDeveloperDetails();
		
		Employee e1 = new Employee(106, "Mike");
		e1.display();

	}

}
