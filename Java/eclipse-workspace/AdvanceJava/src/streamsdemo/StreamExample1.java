package streamsdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 12, 2025
 * Time     :9:56:27 AM
 * project  :AdvanceJava
*/

public class StreamExample1 {

	public static void main(String[] args) {

		Integer[] marks = {45, 88, 99, 45, 75, 23};
		
		// Build stream from Arrays
		Stream<Integer> strm = Stream.of(marks);
		
		// Terminal operation - forEach()
		// Lambda expressions are used to pass as parameters to another function
		strm.forEach(i->System.out.println(i));
		
		Stream<Integer> strm1 = Stream.of(marks);
		// Intermediate operation - filter() & terminal operation - forEach()
		System.out.println("********* Filtered Values **********");
		strm1.filter(i->i>50).forEach(i->System.out.println(i));
		
		
		 System.out.println("************* Array Contents **************");
			List<Integer> grades=new ArrayList<Integer>();
			grades.add(10);
			grades.add(6);
			grades.add(5);
			grades.add(7);
			grades.add(8);
			grades.add(9);
			
			//Build stream from Collections
			Stream<Integer> strm2=grades.stream();
			
			//strm1.forEach(i->System.out.println(i));
			System.out.println("************* ArrayList Contents **************");
			strm2.forEach(System.out::println);
			
			// Intermediate operations - map() & terminal operations - collect()
			List<Integer> squares=grades.stream().map(m->m*m)
					.collect(Collectors.toList());
			
			System.out.println("************** Double of Grades ************");
			System.out.println(squares);


	}

}
