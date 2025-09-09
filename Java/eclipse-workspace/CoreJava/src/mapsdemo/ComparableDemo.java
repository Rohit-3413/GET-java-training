package mapsdemo;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 9, 2025
 * Time     :4:19:33 PM
 * project  :CoreJava
 */

public class ComparableDemo {

	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(111, "John", 29));
		al.add(new Student(222, "Mike", 21));
		al.add(new Student(555, "Mary", 26));
		al.add(new Student(666, "Jim", 30));
		al.add(new Student(777, "Vim", 55));
		
	
		System.out.println("******* Students List *********");
		
		for(Student st: al)
		{
			System.out.println(st.getRollno()+" "+st.getName()+" "+st.getAge());
		}

		Collections.sort(al);
		
		// After Sorting
		System.out.println("******* Students List After Sorting *********");
		
		for(Student st: al) {
			System.out.println(st.getRollno()+" "+st.getName()+" "+st.getAge());
		}
	}

}
