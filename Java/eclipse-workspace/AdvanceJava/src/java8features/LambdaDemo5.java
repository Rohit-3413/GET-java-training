package java8features;

import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 11, 2025
 * Time     :2:38:14 PM
 * project  :AdvanceJava
 * 
 * In Java 8, there are four main inbuilt functional interfaces in 
 * the java.util.function package:
 * 
 * Predicate<T> – takes an argument, returns boolean.
 * Function<T, R> – takes an argument, returns a result.
 * Consumer<T> – takes an argument, returns nothing.
 * Supplier<T> – takes no argument, returns a result.
 * BiFunction<T,U,V>Represents a function that accepts two arguments and produces a result.

		  Java 8 program demonstrating inbuilt Functional Interfaces
 */

public class LambdaDemo5 {

	public static void main(String[] args) {


		  // 1. Predicate Example - Check if a customer is eligible for discount
		        Predicate<Integer> isEligibleForDiscount = billAmount -> billAmount > 500;
		        int bill1 = 450;
		        int bill2 = 700;
		        System.out.println("Bill1 eligible for discount? " + isEligibleForDiscount.test(bill1));
		        System.out.println("Bill2 eligible for discount? " + isEligibleForDiscount.test(bill2));

		        // 2. Function Example - Convert product price in USD to INR
		        Function<Double, Double> usdToInr = usd -> usd * 83.0; // Assume 1 USD = 83 INR
		        System.out.println("Price in INR for $10: " + usdToInr.apply(10.0));

		        Function<Integer,Integer> square = x -> x*x;
		        System.out.println("Square of 5 is : "+square.apply(5));

		        Function<String,Integer> strLen = s -> s.length();
		        System.out.println("Length of 'Coforge' is : "+strLen.apply("Coforge"));
		        
		        // 3. Consumer Example - Print customer details
		        Consumer<String> greetCustomer = name -> System.out.println("Welcome, " + name + "! Thanks for shopping with us.");
		        greetCustomer.accept("Alice");
		        greetCustomer.accept("Bob");

		        // 4. Supplier Example - Generate random OTP
		        Supplier<Integer> otpGenerator = () -> new Random().nextInt(900000) + 100000; // 6-digit OTP
		        System.out.println("Generated OTP: " + otpGenerator.get());

		        // Bonus: BiFunction Example - Calculate total price with quantity
		        BiFunction<Integer, Double, Double> calculateBill = (qty, pricePerItem) -> qty * pricePerItem;
		        System.out.println("Bill for 5 items @ Rs.120 each: " + calculateBill.apply(5, 120.0));
		      
		        // Bonus: BiFunction Example - Calculate sum of two numbers
		        BiFunction<Integer, Integer, Integer> addTwoNumbers = (a , b) -> a+b;
		        System.out.println("Addition of Two Numbers is: " + addTwoNumbers.apply(5, 10));
		        
	}

}
