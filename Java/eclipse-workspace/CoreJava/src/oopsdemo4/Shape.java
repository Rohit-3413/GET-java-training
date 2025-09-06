package oopsdemo4;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 6, 2025
 * Time     :9:48:32 AM
 * project  :CoreJava
*/

public interface Shape {
	
	 //implicitly public, static and final - constant
    public String LABEL="Shape";
    
    //interface methods are implicitly abstract and public
    void draw();
     
   public abstract double getArea();
}
