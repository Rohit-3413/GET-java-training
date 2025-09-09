package collectionsdemo.listdemo;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 9, 2025
 * Time     :10:20:43 AM
 * project  :CoreJava
*/

public class ArrayListDemo1 {

	public static void main(String[] args) {

		// Create a Generic ArrayList of type String
		ArrayList<String> pl = new ArrayList<>();
		
		// Add elements to ArrayList - It maintains Order of Insertion. Data stored in form of Objects
		pl.add("Java");
		pl.add("Perl");
		pl.add("C++");
		pl.add("C# 5.0");
		pl.add("Java");		// Stores Duplicate Elements
		pl.add("Python");
		
		// Display ArrayList contents as List
		System.out.println("Programming Languages ArrayList : "+pl);
		
		// Access elements using get() method
		System.out.println("Element at Index 1 is : "+pl.get(1));
		System.out.println("Does Arraylist Contains element Java ? :"+pl.contains("java"));
		
		// Add elements at Specific index
		pl.add(2,"Oracle");
		System.out.println("Programming Languages ArrayList : "+pl);
		
		// Manipulations
		System.out.println("Is ArrayList Empty ? : "+pl.isEmpty());
		System.out.println("The Position of Python  : "+pl.indexOf("Python"));
		System.out.println("The Size of ArrayList is : "+pl.size());
	
		// Create a ArrayList to store Marks
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(89);		// AutoBoxing - Convert primitive type to Object
		marks.add(45);
		marks.add(68);
		marks.add(94);
		marks.add(75);
		
		 //  marks.add("Hello"); //Compiler Error - Type Safety

        System.out.println("The Marks ArrayList is :"+marks);
        System.out.println("The Size of Marks ArrayList is : "+marks.size());
        System.out.println("The Marks at 3rd index is : "+marks.get(3)); // AutoUnboxing - Convert Object to primitive type

        Collections.sort(marks);
        System.out.println("Marks ArrayList after Sorting :"+marks);

	}

}
