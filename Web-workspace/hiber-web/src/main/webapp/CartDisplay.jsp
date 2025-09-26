<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List,
    com.coforge.training.hiberweb.dao.ShoppingDAO,
    com.coforge.training.hiberweb.model.ShoppingCart" %>
    
     <%
    ShoppingDAO dao = new ShoppingDAO();
    List<ShoppingCart> carts = dao.getAll();
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Shopping Carts<</title>
<link rel="stylesheet" type="text/css" href="style/cart.css">
</head>
<body>
<h1>Shopping Cart List</h1>
  <table>
    <tr>
      <th>ID</th><th>Product</th><th>Quantity</th><th>Price</th>
      <th>Customer Name</th><th>Email</th><th>Address</th>
    </tr>
    <% for(ShoppingCart c : carts) { %>
    <tr>
      <td><%= c.getId() %></td>
      <td><%= c.getProduct() %></td>
      <td><%= c.getQuantity() %></td>
      <td><%= c.getPrice() %></td>
      <td><%= c.getCustomer().getName() %></td>
      <td><%= c.getCustomer().getEmail() %></td>
      <td><%= c.getCustomer().getAddress() %></td>
    </tr>
    <% } %>
  </table>
  <a href="Cart.html" class="button">Add New Cart</a>
</body>
</html>