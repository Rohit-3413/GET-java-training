package oopsdemo3;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 4, 2025
 * Time     :4:37:14 PM
 * project  :CoreJava
*/

public class StockTrading extends Trading {

	public StockTrading(double tradeAmount) {
		super(tradeAmount);
	}

	@Override
	public void tradeDetails() {
		System.out.println("Stock Trading: Investing in company shares.");
        System.out.println("Amount invested = " + tradeAmount);
	}

	@Override
	public double calculateProfitLoss() {
		// TODO Auto-generated method stub
		return tradeAmount * 0.10;
	}

}
