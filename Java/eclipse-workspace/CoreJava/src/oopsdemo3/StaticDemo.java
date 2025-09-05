package oopsdemo3;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 5, 2025
 * Time     :11:31:58 AM
 * project  :CoreJava
 */

class Count{

	private static int cnt; //static variable
	private int a;

	Count(){
		cnt++;
		a=100;
	}

	// static method - It can use only Static variables
	public static void display() {
		System.out.println("The number of Objects created : "+cnt);
	//	 a = a+10
	}
	public void print(){
		System.out.println("Instance Method Variable : "+a);
	}
}


public class StaticDemo {
	public static void main(String[] args) {
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();
		Count c4 = new Count();
		
		c1.print(); //Invokes Instance Methods
		
		Count.display(); //Invokes Static Methods
	}
}
