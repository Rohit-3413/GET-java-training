package collectionsdemo;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 8, 2025
 * Time     :3:59:33 PM
 * project  :CoreJava
*/

public class Sample <T> 	// Parameterized class/ Generic class/ generics T- type
{
	private T data;
	
	public Sample(T data) {		// Generic Constructor
		this.data = data;
	}
	
	public T getdata() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
}
