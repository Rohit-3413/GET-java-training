package streamsdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 12, 2025
 * Time     :10:08:49 AM
 * project  :AdvanceJava
 */

//Filter operations on stream

public class StreamExample2 {

	public static void main(String[] args) {
		
		// Create a List of Names
		List<String> names=Arrays.asList("Jhon","Dan","Mike","Thomson");

		//Create a Stream
		Stream<String> n=names.stream();

		//Intermediate Operations
		Stream<String> ln=n.filter(str->str.length() > 3);

		ln.forEach(System.out::println);

		System.out.println("***********************************");

		//PipeLining
		// Create a Stream ---> Operations --> Convert Stream back to Collections
		List<String> names1=names.stream().filter(str->str.length() > 4).
				collect(Collectors.toList());

		System.out.println(names1);
		System.out.println("*******************************");

		List<Integer> grades=new ArrayList<Integer>();
		grades.add(10);
		grades.add(6);
		grades.add(5);
		grades.add(7);
		grades.add(8);
		grades.add(9);

		//Build stream from Collections
		Stream<Integer> strm1=grades.stream();

		//filter only even Grades
		List<Integer> gradesEven=strm1.filter(i-> i%2==0).collect(Collectors.toList());
		System.out.println(gradesEven);

	}

}
