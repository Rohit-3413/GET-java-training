package com.coforge.training.shopstop;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType ("text/html");
	        PrintWriter out = response.getWriter ();
	        
	        String sid = request.getParameter ("sid");
	        String sname = request.getParameter ("sname");
	        String[] squal = request.getParameterValues ("squal");
	        String sgender = request.getParameter ("sgender");
	        String[] stech = request.getParameterValues ("stech");
	        String branch = request.getParameter ("branch");
	        String saddr = request.getParameter ("saddr");
	        
	        String qual = "";
	        for (int i = 0; i < squal.length; i++)
	        {
	         qual = qual + squal[i] + "<br>";
	        }
	        
	        String tech = "";
	        for (int j = 0; j < stech.length; j++)
	        {
	         tech = tech + stech[j] + "<br>";
	        }
	        
	        out.println ("<html>");
	        out.println ("<body>");
	        out.println ("<font color='red'>");
	        out.println ("<h2>Customer Details</h2>");
	        out.println ("</font>");
	        out.println ("<table border='1'>");
	        out.println ("<tr><td>Customer ID</td><td>" + sid + "</td></tr>");
	        out.println ("<tr><td>Customer Name</td><td>" + sname + "</td></tr>");
	        out.println ("<tr><td>Customer Qualification</td><td>" + qual + "</td></tr>");
	        out.println ("<tr><td>Customer Gender</td><td>" + sgender + "</td></tr>");
	        out.println ("<tr><td>Customer Technologies</td><td>" + tech +"</td></tr>");
	        out.println ("<tr><td>Branch</td><td>" + branch + "</td></tr>");
	        out.println ("<tr><td>Customer Address</td><td>" + saddr + "</td></tr>");
	        out.println ("</table></body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
