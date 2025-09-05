package oopsdemo3;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 5, 2025
 * Time     :11:54:47 AM
 * project  :CoreJava
 * 
 *
	Final Variable - Variable’s content cannot be modified
	Final Method - A final method cannot be overridden. 
	Final Class - Cannot extend a Final class

*/


final class Hello {
	
	final void display()
	{
		System.out.println("This is a final Method");
	}
}

//class World extends Hello { // final classes cannot be extended
//	
//	// final methods cannot be overridden
//	final void display()
//	{
//		System.out.println("This is a final Method");
//	}
//	
//}

public class FinalDemo {

	public static void main(String[] args) {

		final int AGE = 20;
		final float PI = 3.142f;
		
    //	 AGE=30; // compilation error - final variables values cannot be changed
	}

}
