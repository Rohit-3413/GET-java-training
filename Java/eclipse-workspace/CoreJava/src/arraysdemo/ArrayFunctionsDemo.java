package arraysdemo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 2, 2025
 * Time     :10:31:24 AM
 * project  :CoreJava
 * 
 * Program to demonstrate various in-built Array Functions
*/

public class ArrayFunctionsDemo {

	public static void main(String[] args) {
		
		   int[] n1={22,45,47,12,12,-2};
	        int[] n2=new int[5];
	        int[] n3=new int[n1.length];

	        System.out.println("Array Contents of n1 without loop :"+ Arrays.toString(n1));

	        System.out.println("Display Array n1 elements with Enhanced For Loop");
	        for(int i:n1){
	            System.out.print(i+"\t");
	        }
	        //Arraycopy() method - copy entire array n1 to n3
	        System.arraycopy(n1,0,n3,0,n1.length);
	        System.out.println();
	        System.out.println("n3 Array after Copying : "+Arrays.toString(n3));

	        // Copy Array contents partially
	        System.arraycopy(n1,2,n2,1,3);
	        System.out.println("n2 Array after Copying : "+Arrays.toString(n2));

	        //Sort Array -- Uses Quick Sort Algorithm
	        Arrays.sort(n3);
	        System.out.println("n3 Array after Sorting : "+Arrays.toString(n3));

	        // Copying Small Arrays - copyOf() Function
	        int[] copyOfn1=Arrays.copyOf(n1,n1.length);
	        System.out.println("New Array after copyOf() Function"+Arrays.toString(copyOfn1));

	        System.out.println("********** Binary Search **************");
	        Arrays.sort(copyOfn1);

	        Scanner scanner =new Scanner(System.in);
	        System.out.println("Enter a number to be searched in Array : ");
	        int num=scanner.nextInt();
	        // Binarysearch() - Returns the index of element in Array. If not found return negative value
	        // If array consists of duplicates , it will return the index of any one occurrences.
	        int index=Arrays.binarySearch(copyOfn1,num);
	        System.out.println("New Array Contents"+Arrays.toString(copyOfn1));
	        if(index >=0)
	         System.out.println("The Number "+num+" found at Position :"+index);
	        else
	            System.out.println("Element Not Found");
	        
	        scanner.close();

	}

}
