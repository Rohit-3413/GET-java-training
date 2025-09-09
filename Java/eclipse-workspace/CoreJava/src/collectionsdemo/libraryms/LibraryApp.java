package collectionsdemo.libraryms;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 9, 2025
 * Time     :2:21:58 PM
 * project  :CoreJava
 * 
 * A Library Management System using various Java Collections:
	 * 
	 * - ArrayList for storing all books.
	 * - LinkedList for tracking recently issued books.
	 * - HashSet for managing unique members.
	 * - TreeSet for maintaining a sorted list of book titles.
*/


	 
public class LibraryApp {

	public static void main(String[] args) {

		Library library = new Library();

        // Adding books
        library.addBook(new Book(101, "Java Programming", "James Gosling", 1995, "Programming"));
        library.addBook(new Book(102, "Spring Boot", "Craig Walls", 2016, "Framework"));
        library.addBook(new Book(103, "Data Structures", "Robert Lafore", 2002, "Computer Science"));
        library.addBook(new Book(104, "Microservices", "Sam Newman", 2015, "Architecture"));

        // Adding members
        library.addMember(new Member(1, "Alice", "alice@example.com", "9876543210"));
        library.addMember(new Member(2, "Bob", "bob@example.com", "9876501234"));
        library.addMember(new Member(1, "Alice", "alice@example.com", "9876543210")); // Duplicate

        // Issue books
        library.issueBook(new Book(101, "Java Programming", "James Gosling", 1995, "Programming"));
        library.issueBook(new Book(102, "Spring Boot", "Craig Walls", 2016, "Framework"));
        library.issueBook(new Book(105, "Python Basics", "Guido van Rossum", 1991, "Programming")); // Not available

        // Display collections
        library.showAllBooks();
        library.showIssuedBooks();
        library.showMembers();
        library.showSortedBooks();

	}

}
