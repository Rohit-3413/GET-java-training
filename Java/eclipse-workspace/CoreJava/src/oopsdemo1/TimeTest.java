package oopsdemo1;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 3, 2025
 * Time     :1:08:28 PM
 * project  :CoreJava
*/


		public class TimeTest {

			public static void main(String[] args) {
				Time t1=new Time(18, 10, 40);
				Time t2=new Time(3, 50, 40);
				
				t1.add(t2);
				System.out.println("The addition of 2 times is");
				t1.display();

			}

		


	}

