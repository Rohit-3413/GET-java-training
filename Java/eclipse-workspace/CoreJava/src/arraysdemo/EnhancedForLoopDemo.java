package arraysdemo;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 2, 2025
 * Time     :9:39:52 AM
 * project  :CoreJava
*/

public class EnhancedForLoopDemo {

	public static void main(String[] args) {
		String array[] = {"Ron", "Harry", "Hermoine", "Rohit", "Nobita", "Raj"};
		
		//enhanced for loop
		for (String x:array) {
			System.out.println(x);
		}
		
		// for loop for same function
		for(int i=0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
