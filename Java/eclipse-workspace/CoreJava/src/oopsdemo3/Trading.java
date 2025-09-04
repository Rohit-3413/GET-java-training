package oopsdemo3;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 4, 2025
 * Time     :4:33:45 PM
 * project  :CoreJava
 * 
 * Method Overriding Example
*/

public class Trading {
	
	protected double tradeAmount;

	public Trading(double tradeAmount) {
		this.tradeAmount = tradeAmount;
	}
	
	// Method to be overridden
    public void tradeDetails() {
        System.out.println("General Trading: Amount invested = " + tradeAmount);
    }

    // Profit/Loss calculation (default)
    public double calculateProfitLoss() {
        return 0; // No calculation for general trading
    }
}
