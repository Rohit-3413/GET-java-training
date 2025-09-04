package arraysdemo;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 2, 2025
 * Time     :10:23:48 AM
 * project  :CoreJava
 * 
 *  Program to display whether each student in class, excluding Lucy,
 *  has passed their recent test
*/

public class StringArraysDemo {

	public static void main(String[] args) {
		String[] students={"Mark","Bill","Lucy","James","Chloe"};
        int grades[]={34,75,0,40,80};

        System.out.println("********** The Student List *************");
        for(String i:students){
            System.out.println(i);
        }

        // Traverse in Array
        for (int i = 0; i < students.length; i++) {
            if(students[i].equals("Lucy")){
                continue;
            }
            if(grades[i] >=35){
                System.out.println(students[i]+" has Passed Test with Grade :"+grades[i]);
            }else{
                System.out.println(students[i]+" has Failed Test with Grade :"+grades[i]);
            }
        }

	}

}
