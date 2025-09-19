package com.coforge.training.shopstop;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class NetSalaryServlet
 */
@WebServlet("/NetSalaryServlet")
public class NetSalaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NetSalaryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  response.setContentType("text/html");
	        PrintWriter out = response.getWriter();

	        // Fetching input values
	        String name = request.getParameter("empname");

	        // Attributes passed from previous servlet or JSP
	        Float gross = (Float) request.getAttribute("gr");
	        Float basic = (Float) request.getAttribute("b");
	        Float da = (Float) request.getAttribute("da");
	        Float hra = (Float) request.getAttribute("hra");

	        // Avoid null values
	        if (gross == null) gross = 0f;
	        if (basic == null) basic = 0f;
	        if (da == null) da = 0f;
	        if (hra == null) hra = 0f;

	        // Calculations
	        float deduction = gross * 0.05f;
	        float net = gross - deduction;

	        // HTML Response
	        out.println("<html><head><title>Net Salary</title>");
	        out.println("<link rel='stylesheet' href='css/register.css'>"); // optional css
	        out.println("</head><body>");
	        
	        out.println("<div class='form-container'>");
	        out.println("<h1>Shop Stop Net Salary of Employees</h1>");
	        out.println("<hr>");
	        out.println("<h2>Net Salary</h2>");
	        out.println("<p><strong>Employee Name:</strong> " + name + "</p>");
	        out.println("<p><strong>Basic:</strong> " + basic + "</p>");
	        out.println("<p><strong>DA:</strong> " + da + "</p>");
	        out.println("<p><strong>HRA:</strong> " + hra + "</p>");
	        out.println("<p><strong>Gross:</strong> " + gross + "</p>");
	        out.println("<p><strong>Deductions:</strong> " + deduction + "</p>");
	        out.println("<hr>");
	        out.println("<p><strong>Net Salary:</strong> " + net + "</p>");
	        out.println("<hr>");
	        out.println("<p><a href='index.html'>Home Page</a></p>");
	        out.println("</div>");
	        
	        out.println("</body></html>");

	        out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
