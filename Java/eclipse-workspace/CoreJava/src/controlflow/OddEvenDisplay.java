package controlflow;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 1, 2025
 * Time     :12:51:21 PM
 * project  :CoreJava
 * 
 *  Program to display Odd & Even Numbers between 1-10
 *
 * ODD  EVEN
 * ---  ----
 * 1    2
 * 3    4
 * 5    6
 * 7    8
 * 9    10
*/


public class OddEvenDisplay {

	public static void main(String[] args) {
		System.out.println("Odd\tEven");
		System.out.println("---\t---");
		int i=1;
		while(i<=10) {
			if(i%2==0) {
				System.out.print(i+"\n");
			}
			else {
				System.out.print(i+"\t");
			}
			i++;
		}
	}

}
