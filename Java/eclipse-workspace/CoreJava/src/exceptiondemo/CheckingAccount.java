package exceptiondemo;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 8, 2025
 * Time     :9:51:39 AM
 * project  :CoreJava
*/

public class CheckingAccount {

	private double balance;
    private int number;
    
	public CheckingAccount( int number ) {
		this.number = number;
	}

	// generate getters
	public double getBalance() {
		return balance;
	}

	public int getNumber() {
		return number;
	}
	
	 public void deposit(double amount) {
	        balance += amount;
	    }
	 
	  // method may throw user defined exception - InSufficientFundsException
    public void withdraw(double amount) throws InSufficientFundsException {
        if(amount <= balance) {
            balance -= amount;
        }else {
            double needs = amount - balance;
            throw new InSufficientFundsException(needs);
        }
    }
    
}
