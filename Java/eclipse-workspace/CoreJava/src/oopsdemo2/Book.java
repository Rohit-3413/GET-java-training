package oopsdemo2;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 4, 2025
 * Time     :12:09:18 PM
 * project  :CoreJava
 * 
 * In Java, aggregation represents HAS-A relationship, 
 * which means when a class contains reference of another class known to have aggregation.
 * 
 * When you want to use some property or behaviour of any class without the requirement of modifying it 
 * or adding more functionality to it, in such case Aggregation 
 
*/

public class Book {
	

	 	private String name;
		private int price;
		
		//Aggregation
		private Author author;
		private Publisher publisher;
		
		public Book(String name, int price, Author author, Publisher publsiher) {
			this.name = name;
			this.price = price;
			this.author = author;
			this.publisher = publsiher;
		}
		
		 void display()
			{
				System.out.println("*************** Book Details ****************");
				System.out.println("Book Name    : "+name);
			    System.out.println("Book Price   : "+price);
			    
			    System.out.println("------------Author Details----------");
			    System.out.println("Author Name  : "+author.authorName);
			    System.out.println("Author Age   : "+author.age);
			    System.out.println("Author place : "+author.place);
			    
			    System.out.println("------------Publisher Details-------");
			    System.out.println("Publisher Name: "+publisher.name);
			    System.out.println("Publisher ID  : "+publisher.publisherID);
			    System.out.println("Publisher City: "+publisher.city);
			    
			}
		
}
