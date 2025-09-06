package onlineshopping;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 6, 2025
 * Time     :11:59:55 AM
 * project  :CoreJava
*/


abstract class Product {
	    String productName;
	    double price;

	    public Product(String productName, double price) {
	        this.productName = productName;
	        this.price = price;
	    }

	    public abstract void showProductDetails();
}

