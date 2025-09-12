package streamsdemo;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 12, 2025
 * Time     :10:18:09 AM
 * project  :AdvanceJava
*/

public class Book {
	
	int id;  
	String name,author,publisher;  
	int quantity;
	
	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}
