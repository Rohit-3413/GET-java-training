package stringsdemo;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 8, 2025
 * Time     :12:37:24 PM
 * project  :CoreJava
*/

public class StringCreation3 {

	public static void main(String[] args) {
		
		// Creates a empty String. Creates an Object of class String
        String s1 =new String();

        System.out.println("Empty String :"+s1);

        String s2=new String("Hello World");
        System.out.println("String Object s2 :"+s2);

        char arr[]= {'j','a','c','k',' ','j','i','l'};
        String s3=new String(arr);
        System.out.println("String Object from char Array : "+s3);

        String s4=new String(arr,2,5); //Create String from subsequence of an Array
        System.out.println("String from subsequence of an Array :"+s4);

        String s5=new String(s3);
        System.out.println("String with Object of another String :"+s5);

        String s6="Java is Fun";
        System.out.println("String Literal : "+s6);

        //obj1 is stored in String pool. Obj2 refers to Obj1, bcoz contents are same - memory management
        String obj1="Apple";
        String obj2="Apple";

        //2 New Objects is created , even though contents are same
        String obj3 =new String("Apple");
        String obj4 =new String("Apple");

        System.out.println("**********************");
//		String a=null;
//		System.out.println(a.length()); // Edge case : Null Pointer exception

        String b ="Hello",c="World";
        String d=b.concat(c);
        System.out.println(d +" "+d.length());
        System.out.println(d.substring(1,15)); // Edge Case - Range Out of Bounds
	}
}
