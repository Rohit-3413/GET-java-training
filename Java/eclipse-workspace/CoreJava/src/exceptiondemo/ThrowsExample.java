package exceptiondemo;

import java.io.IOException;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 6, 2025
 * Time     :3:49:51 PM
 * project  :CoreJava
*/

public class ThrowsExample {
	
	void myMethod(int a) throws IOException, ArithmeticException
	{
		if(a==1)
			throw new IOException("IO Exception Occured");
		else
			throw new ArithmeticException("Arithmetic Exception");
	}

	public static void main(String[] args) {

		ThrowsExample t = new ThrowsExample();
		
		try {
			t.myMethod(1);
		}
		catch(Exception ex)
		{
			System.err.println(ex);
		}

	}

}
