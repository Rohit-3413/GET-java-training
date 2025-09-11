package java8features;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 11, 2025
 * Time     :3:16:00 PM
 * project  :AdvanceJava
 */

// Program to demonstrate Method reference to an instance method of a class

@FunctionalInterface
interface IDemo
{
	void sum(int  x,int y);
}

class Calculation
{
	void addition(int  a,int b)
	{
		System.out.println("The Addition is : "+(a+b));
	}
}

public class MethodReferenceDemo2 {

	public static void main(String[] args) {

		Calculation c1=new Calculation();

		//using Lambda expressions
		IDemo d1=(a,b)->System.out.println("The Addition is : "+(a+b));
		d1.sum(10, 45);

		//Using Method reference to call instance method
		IDemo d2=c1::addition;
		d2.sum(200,150);


	}

}
