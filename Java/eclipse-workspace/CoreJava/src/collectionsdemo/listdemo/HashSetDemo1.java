package collectionsdemo.listdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 9, 2025
 * Time     :12:29:09 PM
 * project  :CoreJava
*/

//Set is a Unordered group of elements which stores unique elements only

public class HashSetDemo1 {

	public static void main(String[] args) {

		 Set<String> programmingLanguages=new HashSet<>();

	        programmingLanguages.add("C");
	        programmingLanguages.add("C++");
	        programmingLanguages.add("Java");
	        programmingLanguages.add("Python");
	        programmingLanguages.add("PHP");
	        programmingLanguages.add("Ruby");

	        programmingLanguages.add("Java");
	        programmingLanguages.add(null);
	        programmingLanguages.add(null);

	        System.out.println("=== Iterate over a HashSet using iterator() ===");
	        Iterator<String> programmingLanguageIterator = programmingLanguages.iterator();
	        while (programmingLanguageIterator.hasNext()) {
	            String programmingLanguage = programmingLanguageIterator.next();
	            System.out.println(programmingLanguage);
	        }

	        System.out.println("=== Iterate over a HashSet using Enchanced For loop ===");
	        for(String programmingLanguage: programmingLanguages) {
	            System.out.println(programmingLanguage);
	        }

	        HashSet<String> pl = new HashSet<>(programmingLanguages);

	        System.out.println(pl);

	        Object clonepl = new HashSet<>();// empty hash set

	        // clone the Hashset
	        clonepl=pl.clone();

	        //display new set after cloning
	        System.out.println(clonepl);

	}

}
