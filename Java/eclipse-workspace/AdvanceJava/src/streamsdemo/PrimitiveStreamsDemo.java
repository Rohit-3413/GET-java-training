package streamsdemo;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 12, 2025
 * Time     :10:44:18 AM
 * project  :AdvanceJava
*/

/*display numbers from  1-100 
 * 1. Loops
 * 2. Streams
 * 
*/

public class PrimitiveStreamsDemo {

	public static void main(String[] args) {

	
		for(int i=1;i<=100;i++)
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		System.out.println(" ********** Display Nos from 1-100 using Intstreams ***********");
		
		IntStream.range(1, 101).forEach(i->System.out.print(i+" "));

		System.out.println("***************************************");
		
		 // === IntStream: Student Marks ===
        int[] marks = {85, 92, 76, 60, 95, 88};

        System.out.println("=== Student Marks ===");
        IntStream.of(marks).forEach(mark -> System.out.print(mark + " "));

        // Calculate average using IntStream
        double avgMarks = IntStream.of(marks).average().orElse(0);
        System.out.println("\nAverage Marks: " + avgMarks);

        // Filter students who scored above 80
        System.out.println("Marks above 80:");
        IntStream.of(marks)
                 .filter(m -> m > 80)
                 .forEach(System.out::println);

        // === LongStream: Employee Salaries ===
        long[] salaries = {40000L, 55000L, 70000L, 80000L};

        long totalSalary = LongStream.of(salaries).sum();
        System.out.println("\nTotal Salary Expense: " + totalSalary);

        // === DoubleStream: Product Prices ===
        double[] prices = {199.99, 499.50, 1299.00, 89.99};

        double maxPrice = DoubleStream.of(prices).max().orElse(0);
        System.out.println("\nMaximum Product Price: " + maxPrice);

        // Print all discounted prices (10% off)
        System.out.println("Discounted Prices (10% off):");
        DoubleStream.of(prices)
                    .map(p -> p * 0.90) // apply 10% discount
                    .forEach(System.out::println);
	}

}
