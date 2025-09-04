package arraysdemo;

import java.util.Scanner;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 2, 2025
 * Time     :10:48:55 AM
 * project  :CoreJava
 * 
 * Program to delete an element from Array
*/

public class DeleteArrayDemo {

	public static void main(String[] args) {
		int[] marks={78,56,23,44,90,98,67,55,35,84};//declare & initialize Array
        Scanner scanner=new Scanner(System.in);

        System.out.println("************** Array of Marks *****************");
        for (int i = 0; i <marks.length ; i++) {
            System.out.print(marks[i]+"\t");
        }
        System.out.println();

        System.out.println("Enter element to be Deleted :");
        int element=scanner.nextInt();
        
        boolean isFound=false;
        //Delete Logic
        for (int i = 0; i <marks.length ; i++) {
            if(marks[i]==element){
            	isFound = true;
                //Shift the elements in array
                for (int j = i; j <marks.length-1 ; j++) {
                    marks[j]=marks[j+1];
                }
                break;
            }
           
        }
        if(isFound) {
        System.out.println("Array After Deletion:");
        for (int i = 0; i < marks.length-1; i++) {
            System.out.print(marks[i]+"\t");
            
            scanner.close();
        }}
        else
        	System.out.println("Element Not Found");

	}

}
