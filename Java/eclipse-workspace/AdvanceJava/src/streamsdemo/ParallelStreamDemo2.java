package streamsdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 12, 2025
 * Time     :10:59:00 AM
 * project  :AdvanceJava
*/

// Java Program to count Employees Who's salary is greater then 15000 in 
//Quick Fashion

public class ParallelStreamDemo2 {

	public static void main(String[] args) {


		List < Employee > empList = new ArrayList < Employee > ();
			
			  for (int i = 0; i < 20000; i++) {
			   empList.add(new Employee(20000, "Allen"));
			   empList.add(new Employee(3000, "Boon"));
			   empList.add(new Employee(15002, "Cavin"));
			   empList.add(new Employee(7856, "Duke"));
			   empList.add(new Employee(200, "Eon"));
			   empList.add(new Employee(50000, "Fred"));
			  }
			  
			  empList.stream().forEach(i-> System.out.println(i.getName()+" "+i.getSalary()));
			  
			  long t1=System.currentTimeMillis();
			  System.out.println("Count of Employees Using Sequential Stream : +"
			  		+ empList.stream().filter(e -> e.getSalary() >15000).count());
			  
			  long t2=System.currentTimeMillis();
			  System.out.println("Time Taken by Sequential Stream to Count Employees :"+(t2-t1));
			  
			  System.out.println("***********************************************");
			  
			long  t3=System.currentTimeMillis();
			  System.out.println("Count of Employees Using Parallel Stream : +"
				  		+ empList.stream().parallel().filter(e -> e.getSalary() >15000).count());
			  
			long  t4=System.currentTimeMillis();
			  System.out.println("Time Taken by Parallel Stream to Count Employees :"+(t4-t3));

	}

}
