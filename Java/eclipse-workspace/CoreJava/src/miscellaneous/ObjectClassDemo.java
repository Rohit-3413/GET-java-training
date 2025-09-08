package miscellaneous;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 8, 2025
 * Time     :2:57:02 PM
 * project  :CoreJava
*/

public class ObjectClassDemo {

	public static void main(String[] args) {
		
		   // Creating Employee objects
        Employee emp1 = new Employee(101, "Alice", 50000);
        Employee emp2 = new Employee(101, "Alice", 50000);
        Employee emp3 = new Employee(102, "Bob", 60000);

        // toString()
        System.out.println("emp1 details: " + emp1);

        // invokes equals()
        System.out.println("emp1 equals emp2? " + emp1.equals(emp2));
        System.out.println("emp1 equals emp3? " + emp1.equals(emp3));

        // hashCode()
        System.out.println("emp1 hashCode: " + emp1.hashCode());
        System.out.println("emp2 hashCode: " + emp2.hashCode());
        System.out.println("emp3 hashCode: " + emp3.hashCode());

        // getClass()
        System.out.println("Class of emp1: " + emp1.getClass().getName());
        try {
        // clone()
        Employee empClone = (Employee) emp1.clone();
        System.out.println("Cloned Employee: " + empClone);

    } catch (CloneNotSupportedException e) {
        e.printStackTrace();
    }

  }
}
