package exceptiondemo;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 8, 2025
 * Time     :9:46:12 AM
 * project  :CoreJava
*/

// User defined Exception class
public class InSufficientFundsException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double amount;
	
	public InSufficientFundsException(double amount) {
		this.amount = amount;
	}
	
	public double getAmount() {
		return amount;
	}
	
}
