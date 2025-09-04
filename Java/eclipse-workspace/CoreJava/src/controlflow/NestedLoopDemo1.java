package controlflow;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 1, 2025
 * Time     :4:08:17 PM
 * project  :CoreJava
*/

public class NestedLoopDemo1 {

	public static void main(String[] args) {
		
		for (int i=1; i<=5; i++) {  // 1	2	3	4	5
			
			for(int j=1; j<=i; j++) { // 1	 1 2 	1 2 3	 1 2 3 4	  1 2 3 4 5
				
				System.out.print("*"+"\t");
			}
			System.out.println();
		}

	}

}
