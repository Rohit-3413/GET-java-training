package oopsdemo2;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 4, 2025
 * Time     :11:53:32 AM
 * project  :CoreJava
*/

public class AggregationDemo1 {

	public static void main(String[] args) {

		Address ad1 = new Address("Bengaluru", "Karnataka", "India",566016);
		Address ad2 = new Address("Prague", "Austin", "Czech Republic",77777);
		
		Student s1 = new Student(101, "Ravi", ad1);
		Student s2 = new Student(102, "Mike", ad2);
		
		s1.display();
		s2.display();
	}

}
