package oopsdemo3;

import oopsdemo1.Complex;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 5, 2025
 * Time     :10:31:15 AM
 * project  :CoreJava
*/

class Test{
	 int a; //default variable -- accessible in all classes of the package
	    private int b; //private variable - accessible in this class
	    protected int c; //protected variable - accessible in this class & subclass
	    public int d; //Accessible from anywhere
		
	    public Test(int a, int b, int c, int d) {
			this.a = a;
			this.b = b;
			this.c = c;
			this.d = d;
		}

	    void display(){ //default method
	        System.out.println("Private variable : "+b);
	    }
}

class Test2 extends Test {
	
	public Test2(int a, int b, int c, int d) {
		super(a, b, c, d);
	}
	
	public void display() {//public Method
        System.out.println("Protected Variable :"+c);
    }
    void print() {
        System.out.println("Hello from Default Method !!!");
    }
}



public class AccessSpecifiersDemo {

	public static void main(String[] args) {

		 Test t1=new Test(100,200,300,400);
	        t1.display();

	        //t1.b=50; //Compiler error - cannot access private variable outside the class
	        System.out.println("Default Variable : "+t1.a);

	        Test2 t2=new Test2(700,800,250,360);
	        t2.display();

	        //Access Public data/methods from oopsdemo1 package
	        Complex c1=new Complex(10.33,9.88);
	        Complex c2=new Complex(4.56,12.80);

	        c1.add(c2);
	        System.out.println("The Addition of 2 Complex nos is : ");
	        c1.display();
		}

}

