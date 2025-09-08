package collectionsdemo;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 8, 2025
 * Time     :4:22:25 PM
 * project  :CoreJava
*/

public class GenericMethodsDemo {
	
	public static <E> void printArray(E[] inputArray) {
		for(E element:inputArray) {
			System.out.println(element);
		}
	}
	
	public static void main(String[] args) {
		// Create arrays of Integer, Double and Character
		Integer[] intArray = {1,2,3,4,5};
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
		Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
		
		System.out.println("Array integerArray contains:");
		printArray(intArray);   // pass an Integer array
		
		System.out.println("Array doubleArray contains:");
		printArray(doubleArray);   // pass a Double array
		
		System.out.println("Array characterArray contains:");
		printArray(charArray);   // pass an Character array
	}

}