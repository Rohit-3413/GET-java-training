package onlineshopping;

import java.util.ArrayList;
import java.util.List;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 6, 2025
 * Time     :12:04:37 PM
 * project  :CoreJava
*/

//ShoppingCart - Multiple Inheritance
class ShoppingCart implements OnlinePayment, Discount {
 String customerName;
 List<Product> productList = new ArrayList<>();

 public ShoppingCart(String customerName) {
     this.customerName = customerName;
 }

 public void addProduct(Product product) {
     productList.add(product);
 }

 public void showCartDetails() {
     System.out.println("Customer: " + customerName + "'s Shopping Cart:");
     double total = 0;
     for (Product p : productList) {
         p.showProductDetails();
         total += p.price;
     }
     System.out.println("Total Bill: ₹" + total);
 }

 @Override
 public void payOnline(double amount) {
     System.out.println(customerName + " paid ₹" + amount + " online using Credit Card.");
 }

 @Override
 public double applyDiscount(double amount) {
     double discount = amount * 0.12; // 12% discount
     double finalAmount = amount - discount;
     System.out.println("Discount applied: ₹" + discount);
     System.out.println("Final amount after discount: ₹" + finalAmount);
     return finalAmount;
 }

 public double getTotalAmount() {
     double total = 0;
     for (Product p : productList) {
         total += p.price;
     }
     return total;
 }
}

