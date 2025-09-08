package stringsdemo;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 8, 2025
 * Time     :1:06:29 PM
 * project  :CoreJava
 * 
 * 
		 String → Used for immutable data like names, IDs, and constants.
		 * StringBuffer → Used when multiple threads may modify the same data (transaction logs, audit trails).
		 * StringBuilder → Used for faster operations where only one thread modifies data (report generation, building large strings).
		 
*/

public class BankingApp {

	public static void main(String[] args) {

		 
		 //Banking Application Example with String, StringBuffer, and StringBuilder


		 // 1. Using String (Immutable - Good for storing constant data)
		        String accountNumber = "ACC123456";
		        String customerName = "John Doe";
		        String bankName = "National Bank";
		        
		        System.out.println("Customer: " + customerName);
		        System.out.println("Account Number: " + accountNumber);
		        System.out.println("Bank: " + bankName);
		        
		        // ----------------------------

		        // 2. Using StringBuffer (Thread-safe, mutable, slower)
		        // Use case: Transaction logs updated by multiple threads
		        StringBuffer transactionLog = new StringBuffer("Transaction Log:\n");
		        transactionLog.append("Deposit: $1000\n");
		        transactionLog.append("Withdraw: $500\n");
		        transactionLog.append("Transfer: $200\n");
		        
		        System.out.println("\n--- Transaction Log (StringBuffer) ---");
		        System.out.println(transactionLog);

		        // ----------------------------

		        // 3. Using StringBuilder (Not thread-safe, faster, mutable)
		        // Use case: Generating account statement (single-threaded, high performance)
		        StringBuilder accountStatement = new StringBuilder();
		        accountStatement.append("----- Account Statement -----\n");
		        accountStatement.append("Account Holder: ").append(customerName).append("\n");
		        accountStatement.append("Account Number: ").append(accountNumber).append("\n");
		        accountStatement.append("Bank: ").append(bankName).append("\n");
		        accountStatement.append("Balance: $300\n");
		        
		        System.out.println("\n--- Account Statement (StringBuilder) ---");
		        System.out.println(accountStatement);

	}

}
