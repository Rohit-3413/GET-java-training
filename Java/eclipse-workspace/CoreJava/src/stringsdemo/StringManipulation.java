package stringsdemo;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 8, 2025
 * Time     :12:43:18 PM
 * project  :CoreJava
*/

public class StringManipulation {

	public static void main(String[] args) {
		
		 String ob1 = "Scholar-Hat"; //creates a string object

	        //string length
	        System.out.println("Length of the String: " +ob1+": " +ob1.length());

	        char arr[] = {'j','k','a','q','e' };
	        String ob2 = new String(arr); //String from an array

	        //string concatenation
	        System.out.println("Concatenate String and String Array: " +ob1.concat(ob2));

	        //to upper case
	        System.out.println("Contents of String in uppercase: " +ob1.toUpperCase());

	        //to lower case
	        System.out.println("Contents of String in lowercase: " +ob1.toLowerCase());

	        //split function
	        for(String res: ob1.split("-",2))
	            System.out.println("Splitting the String: " +res);

	        //contains function
	        System.out.println("Contains() function in String: " +(ob1.contains("Scholar")));

	        //Replace function
	        System.out.println("Replace function in String: " +(ob1.replace('o','a')));

	        //ReplaceAll function
	        System.out.println("ReplaceAll function in String: " +(ob1.replaceAll("lar","o")));

	        //substring function
	        System.out.println("Substring in String: " +(ob1.substring(3,6)));

	        //trim function - removes extra spaces in a String
	        String str = " Scholar-Hat! ";

	        System.out.println("Without Trim function in String: " +str.length());
	        System.out.println("Trim function in String: " +(str.trim()).length());

	}

}
