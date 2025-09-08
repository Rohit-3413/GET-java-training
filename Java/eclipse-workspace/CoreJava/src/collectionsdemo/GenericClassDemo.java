package collectionsdemo;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 8, 2025
 * Time     :4:02:52 PM
 * project  :CoreJava
*/

public class GenericClassDemo {

	public static void main(String[] args) {

		Sample<String> s1 = new Sample<String>("Java Generics");	// Object of Generic class for Type String
		
		System.out.println("Display from Generic class by passing String Object : "+s1.getdata());
		
		Sample<Integer> s2 = new Sample<Integer>(200); // Object of Generic class for Type Integer
		
		System.out.println("Display from Generic class by passing Integer Object : "+s2.getdata());
		
		Sample<Double> s3 = new Sample<Double>(555.50); // Object of Generic class for Type Double
		
		System.out.println("Display from Generic class by passing Double Object : "+s3.getdata());
		

	}

}
