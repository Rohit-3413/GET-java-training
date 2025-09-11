package java8features;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 11, 2025
 * Time     :12:55:00 PM
 * project  :AdvanceJava
*/

@FunctionalInterface
interface MyFI
{
	public String sayHello();  // by default abstract
	// public String sayHello1();
}

public class LambdaDemo1 {

	public static void main(String[] args) {


		MyFI msg = () -> { return "Hello World";}; // lambda expression
		
		MyFI msg1 = () -> { return "Java 8 Features";};
		
		MyFI msg2 = () -> { return "Coforge";};
		
		MyFI msg3 = () -> { return "Coforge"+" "+"Technologies";};
		
		System.out.println(msg.sayHello());
		System.out.println(msg1.sayHello());
		System.out.println(msg2.sayHello());
		System.out.println(msg3.sayHello());
		
	}

}
