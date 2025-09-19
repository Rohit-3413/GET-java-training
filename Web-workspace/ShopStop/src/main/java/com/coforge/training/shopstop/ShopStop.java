package com.coforge.training.shopstop;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ShopStop
 */
@WebServlet("/ShopStop")
public class ShopStop extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShopStop() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html"); // setting content type
		PrintWriter out=response.getWriter(); //get the stream  to write data

		String items=request.getParameter("rbitems");
		String cmt=request.getParameter("txtcomment");
		String s=request.getParameter("survey");

		out.print("<title>Survey Results</title>");
		out.println("<body bgcolor=\"pink\">");
		out.println("<h1>"+ s +"</h1></br>");

		out.println("Congratulations, you are qualified for our lucky draw"); 
		out.println("<br/>");       
		out.println("Your comments: " +cmt);
		out.println("<br/>");  
		out.println("Number of items purchased : " + items);  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
