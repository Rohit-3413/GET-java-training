package com.coforge.training.shopstop;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class GrossServlet
 */
@WebServlet("/GrossServlet")
public class GrossServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GrossServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html;charset=UTF-8");
	        PrintWriter out = response.getWriter();
	           float basic = Float.parseFloat(request.getParameter("basic"));
	           float da = basic * 0.8f;
	           float hra = basic * 0.3f;
	           float gross = basic + da + hra;
	           
	           //ServletCommunication
	           // attributes are used for sharing values between one servlet and another - 
	           request.setAttribute("b",basic); // float b=basic;
	           request.setAttribute("da",da);
	           request.setAttribute("hra",hra);
	           request.setAttribute("gr", gross);
	           
	           RequestDispatcher rd = request.getRequestDispatcher("/NetSalaryServlet");
	           rd.forward(request, response);  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
