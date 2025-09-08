package stringsdemo;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 8, 2025
 * Time     :12:48:18 PM
 * project  :CoreJava
*/

public class StringComparison {

	public static void main(String[] args) {
		
		 String ob1 = "Scholar-Hat"; //creates a string object
	        String ob2 = "scholar-hat";

	        //equals function
	        System.out.println("Using equals function: " +(ob1.equals(ob2)));

	        System.out.println("Using equalsIgnoreCase function: " +(ob1.equalsIgnoreCase(ob2)));

	        //compareTo function
	        System.out.println("Using compareTo function: " +(ob1.compareTo(ob2)));
	        System.out.println("Using compareToIgnoreCase function: " +(ob1.compareToIgnoreCase(ob2)));

		    /*
		  		 * The compareTo() method compares two strings lexicographically
		  		 * (in the dictionary order).
		  		 * The comparison is based on the Unicode value of each character in the strings.
		  		 *	 returns 0 if the strings are equal
		  			returns a negative integer if the string comes before the str argument in the dictionary order
		  			returns a positive integer if the string comes after the str argument in the dictionary order
		  		 */

	        String str1 = "Learn Java";
	        String str2 = "Learn Java";
	        String str3 = "Learn Kotlin";

	        System.out.println(str1.compareTo(str2)); //0
	        System.out.println(str1.compareTo(str3)); // negative value
	        System.out.println(str3.compareTo(str1)); // positive value

	        int status=str1.compareTo(str2);
	        if(status==0)
	        {
	            System.out.println("Str1 & STr2 Are Equal");
	        }
	        else
	        {
	            System.out.println("Str1 & STr2 Are Not  Equal");
	        }


	        //startsWith function
	        System.out.println("Using startsWith function: " +(ob1.startsWith("Sc")));

	        //endsWith function
	        System.out.println("Using endsWith function: " +(ob1.endsWith("at")));

	}

}
