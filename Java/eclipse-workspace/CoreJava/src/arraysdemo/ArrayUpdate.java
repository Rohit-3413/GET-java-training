package arraysdemo;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 2, 2025
 * Time     :10:43:45 AM
 * project  :CoreJava
 * 
 *  Program to Update elements of Array using set() method
*/

public class ArrayUpdate {

	public static void main(String[] args) {
		String[] lanaguages ={"Java","Ruby","Python","C++","Scala","Oak","C"};

        System.out.println("Original Array:");
        for(String x:lanaguages){
            System.out.print(x+"\t");
        }

        //Update Array Contents - size of Array remains same
        Array.set(lanaguages,2,"SPRING");
        lanaguages[0]="Hibernate";

        System.out.println();
        System.out.println("Array after Update:");
        for(String x:lanaguages){
            System.out.print(x+"\t");
        }

        int [] marks={10,30,50,20,70};
        int [] scores={100,200,400,500};

        System.out.println();
        System.out.println("Array marks Original :"+Arrays.toString(marks));
        System.out.println("Array scores Original :"+Arrays.toString(scores));

        //copies the reference, not Array - marks refer to same array as scores
        marks=scores;

        // Update marks array position 2 , but also updates scores array
        // Instead use copyOf(), ArrayCopy() method
        marks[2] =999;
        System.out.println("Scores Array content at position 2: "+scores[2]);
        System.out.println("Length of Marks Array : "+marks.length);
        System.out.println("Array marks :"+Arrays.toString(marks));
        System.out.println("Array scores  :"+Arrays.toString(scores));

	}

}
