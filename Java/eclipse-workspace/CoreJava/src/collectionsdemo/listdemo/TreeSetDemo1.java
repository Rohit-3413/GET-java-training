package collectionsdemo.listdemo;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 9, 2025
 * Time     :12:36:23 PM
 * project  :CoreJava
*/

//A set which stores elements in sorted order.
		//No duplicates, No null Values

public class TreeSetDemo1 {

	public static void main(String[] args) {

		 // Creating a TreeSet
		        TreeSet<String> fruits = new TreeSet<>();

		        // Adding new elements to a TreeSet
		        fruits.add("Banana");
		        fruits.add("Apple");
		        fruits.add("Pineapple");
		        fruits.add("Orange");

		        System.out.println("Fruits Set : " + fruits);

		        // Duplicate elements are ignored
		        fruits.add("Apple");
		        System.out.println("After adding duplicate element \"Apple\" : " + fruits);

		        // This will be allowed because it's in lowercase.
		        fruits.add("banana");
                // fruits.add(null);
		        System.out.println("After adding \"banana\" : " + fruits);

		        // TreeSet of Integer Type
		        TreeSet<Integer> tset2 = new TreeSet<Integer>();

		        // Adding elements to TreeSet<Integer>
		        tset2.add(88);
		        tset2.add(7);
		        tset2.add(101);
		        tset2.add(0);
		        tset2.add(3);
		        tset2.add(222);

		        System.out.println("Tree set in Ascending Order :"+tset2);

		        // tree set with custom comparator
		        TreeSet<Integer> tset3 = new TreeSet<>(Comparator.reverseOrder());

		        tset3.add(88);
		        tset3.add(7);
		        tset3.add(101);
		        tset3.add(0);
		        tset3.add(3);
		        tset3.add(222);

		        System.out.println("Tree set in Reverse Order:"+tset3);

	}

}
