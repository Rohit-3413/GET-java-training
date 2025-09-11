package java8features;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 11, 2025
 * Time     :2:17:04 PM
 * project  :AdvanceJava
*/

public class LambdaDemo2 {

	public static void main(String[] args) {

		NumericTest isEven=(n) -> (n%2==0);
		NumericTest isNegative=(n) -> (n<0);
		
		System.out.println("7 is Even Number :" +isEven.computeTest(7));
		System.out.println("-55 is Negative Number :"+ isNegative.computeTest(-55));
		
		// boolean a=(n) -> (n%2==0);  // error - lambda expressions should be stored in instance of FI
		
	}

}
