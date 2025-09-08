package stringsdemo;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 8, 2025
 * Time     :12:34:23 PM
 * project  :CoreJava
*/

//Creating Strings using new Keyword

public class StringCreation2 {

	public static void main(String[] args) {

		 //A new String Object is always created even though "Java Strings" is
		        //already present in the String pool
		        String name=new String("Java Strings");

		        System.out.println("The String value is : "+name);
		        System.out.println("The Length of the String is : "+name.length());
		        System.out.println("Convert to Uppercase :"+name.toUpperCase());

		        String  greet="She Sells Sea Shells in the Sea";

		        System.out.println("The String is : "+greet);
		        System.out.println("The Length of the String is : "+greet.length());

		        String second="Programming in Java";
		        String joinedString=greet.concat(second);
		        System.out.println("Concatenation of Strings :"+joinedString);

		        // Strings are Immutable - String created once, cannot be changed
		        String example="Hello";
		        example=example.concat(" World"); // first string "Hello" remains unchanged
		        System.out.println(example); // new reference obj created with "Hello World"
	}
}
