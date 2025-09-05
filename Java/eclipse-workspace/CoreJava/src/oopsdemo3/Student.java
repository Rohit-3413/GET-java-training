package oopsdemo3;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 5, 2025
 * Time     :11:41:03 AM
 * project  :CoreJava
*/

public class Student {

	private int rollNo;
    private String name;
    private static  String college="UPES"; //static Variable
    
    public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
    
    
    public static void collegeChange(){ //static Method
        college="VTU";
    }
    public void display(){
        System.out.println(this.rollNo+" "+this.name+" "+college);
    }
}
