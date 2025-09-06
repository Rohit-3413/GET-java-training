package onlineshopping;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 6, 2025
 * Time     :12:01:53 PM
 * project  :CoreJava
*/

//Concrete Product - Mobile
class Mobile extends Product {
 public Mobile(String productName, double price) {
     super(productName, price);
 }

 @Override
 public void showProductDetails() {
     System.out.println("Mobile: " + productName + " | Price: ₹" + price);
 }
}