package assignment;

class BankAccount {
	
	private String accountHolder;
	private double balance;
	
	public BankAccount(String accountHolder, double initialBalance) {
		this.accountHolder = accountHolder;
		this.balance = initialBalance;
	}
	
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited: $" + amount);
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}
	
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawn: $" + amount);
		} else {
			System.out.println("Insufficient balance or invalid amount.");
		}
	}
	
	public void displayBalance() {
		System.out.println("Account Holder: " + accountHolder + ", Balance: $" + balance);
	}
}

public class BankTest {
	public static void main(String[] args) {
		BankAccount acc = new BankAccount("Rohit Gupta", 1000);
		acc.displayBalance();
		acc.deposit(500);
		acc.withdraw(300);
		acc.displayBalance();
	}
}