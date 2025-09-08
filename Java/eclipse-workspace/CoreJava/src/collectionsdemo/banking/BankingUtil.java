package collectionsdemo.banking;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 8, 2025
 * Time     :4:37:41 PM
 * project  :CoreJava
*/

// Utility class with Generic Method

public class BankingUtil {
	
	// Generic method to print any type of transaction
	
    public static <T> void printTransaction(T transaction) {
        System.out.println("Transaction: " + transaction);
    }

}
