package com.coforge.training.hiberweb.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.coforge.training.hiberweb.dao.ShoppingDAO;
import com.coforge.training.hiberweb.model.Customer;
import com.coforge.training.hiberweb.model.ShoppingCart;

/**
 * Servlet implementation class ShoppingServlet
 */
@WebServlet("/ShoppingServlet")
public class ShoppingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	 private ShoppingDAO dao = new ShoppingDAO();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShoppingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 
		 
		 
		 // Read product details
		        String product = request.getParameter("product");
		        int quantity = Integer.parseInt(request.getParameter("quantity"));
		        double price = Double.parseDouble(request.getParameter("price"));

		        // Read customer details
		        String name = request.getParameter("name");
		        String email = request.getParameter("email");
		        String address = request.getParameter("address");

		        // Build component
		        Customer customer = new Customer();
		        customer.setName(name);
		        customer.setEmail(email);
		        customer.setAddress(address);

		        // Build entity
		        ShoppingCart cart = new ShoppingCart();
		        cart.setProduct(product);
		        cart.setQuantity(quantity);
		        cart.setPrice(price);
		        cart.setCustomer(customer);

		        // Save via DAO
		        dao.save(cart);

		        // Redirect to list page
		        response.sendRedirect("CartDisplay.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
