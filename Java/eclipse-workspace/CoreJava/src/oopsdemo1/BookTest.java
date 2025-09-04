package oopsdemo1;

import java.util.Scanner;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 3, 2025
 * Time     :10:00:56 AM
 * project  :CoreJava
 */

public class BookTest {

	public static void main(String[] args) {

		Book b1 = new Book();

		// Invoke setter methods - input
		b1.setBookId(101);
		b1.setBookName("Programming in C");
		b1.setPrice(500);
		b1.setPublisher("Prime Books");

		// Invoke getter methods --output
		System.out.println("************** Book Details *************");
		b1.display();
		System.out.println(b1.getBookId()+ " " + b1.getBookName()+ " " + b1.getPrice()+ " " + b1.getPublisher());

		System.out.println("Discounted Price of Book : "+b1.discountPrice());

		System.out.println(b1); // Invokes toString() method of the instance class


		Book b2 = new Book();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Book Id, Name, Price & Publisher : ");
		b2.setBookId(s.nextInt());
		s.nextLine();
		b2.setBookName(s.nextLine());
		b2.setPrice(s.nextFloat());
		s.nextLine();
		b2.setPublisher(s.nextLine());
		s.close();

		b2.display();
		System.out.println("**************** Book Details ******************");
		System.out.println("Book Id                       :"+b2.getBookId());
		System.out.println("Book Name                     :"+b2.getBookName());
		System.out.println("Book Price                    :"+b2.getPrice());
		System.out.println("Book Publisher                :"+b2.getPublisher());
		System.out.println("Discounted Price for Book     :"+b2.discountPrice());
		System.out.println("------------------------------------------------");

		System.out.println(b2); // Invokes toString() method of the instance class


	}

}
