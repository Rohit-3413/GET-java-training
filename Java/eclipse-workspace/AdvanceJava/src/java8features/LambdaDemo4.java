package java8features;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 11, 2025
 * Time     :2:32:04 PM
 * project  :AdvanceJava
 */

// block lambda expressions
public class LambdaDemo4 {

	public static void main(String[] args) {

		//lambda expression to reverse a string
		MyString reverseStr = (str) -> {
			String result="";
			for(int i=str.length()-1;i>=0;i--)
				result+=str.charAt(i);
			return result;
		};

		System.out.println(reverseStr.myStringFunction("Lambda EXpressions"));
		System.out.println(reverseStr.myStringFunction("madam"));
		System.out.println(reverseStr.myStringFunction("Hello World Java"));

		// lambda expression with single parameter
		MyString myName = (name) -> { return "Hello "+name;};

		System.out.println(myName.myStringFunction("Raj"));

		// lambda expression with single parameter with no parenthesis
		MyString myName1 = name -> { return "Hello "+name;};

		System.out.println(myName1.myStringFunction("James Gosling"));

		MyString lenString = (str) -> { return "The Length of "+str+" is :"+str.length();};
		System.out.println(lenString.myStringFunction("Lambda Expression"));
		System.out.println(lenString.myStringFunction("James Gosling"));
		System.out.println(lenString.myStringFunction("Raj"));

	}

}
