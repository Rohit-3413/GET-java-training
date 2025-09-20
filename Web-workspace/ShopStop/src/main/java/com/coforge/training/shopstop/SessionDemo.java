package com.coforge.training.shopstop;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SessionDemo
 */
@WebServlet("/SessionDemo")
public class SessionDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		// Create a new Session
		HttpSession session = request.getSession(true);
		
		String heading;
		Integer accessCount = Integer.valueOf(0);
		
		if(session.isNew())
		{
			heading = "Welcome New User";
		}
		else
		{
			heading = "Welcome Back";
			Integer oldAccessCount = (Integer)session.getAttribute("accessCount");
			
			if(oldAccessCount != null) {
				accessCount = Integer.valueOf(oldAccessCount.intValue() + 1);
			}
		}
		
		session.setAttribute("accessCount", accessCount);
		
		out.print("Session Id :"+session.getId()+"<br>");
		out.print("Session Creation Time :"+new Date(session.getCreationTime())+"<br>");
		out.print("Number of Access :"+accessCount);
		
		 out.println(
	                "<BODY BGCOLOR=\"#FDF5E6\">\n" +
	                "<H1 ALIGN=\"CENTER\">" + heading + "</H1>\n" +
	                "<H2>Information on Your Session:</H2>\n" +
	                "<TABLE BORDER=1 ALIGN=CENTER>\n" +
	                "<TR BGCOLOR=\"#FFAD00\">\n" +
	                "  <TH>Info Type<TH>Value\n" +
	                "<TR>\n" +
	                "  <TD>ID\n" +
	                "  <TD>" + session.getId() + "\n" +
	                "<TR>\n" +
	                "  <TD>Creation Time\n" +
	                "  <TD>" + new Date(session.getCreationTime()) + "\n" +
	                "<TR>\n" +
	                "  <TD>Time of Last Access\n" +
	                "  <TD>" + new Date(session.getLastAccessedTime()) + "\n" +
	                "<TR>\n" +
	                "  <TD>Number of Previous Accesses\n" +
	                "  <TD>" + accessCount + "\n" +
	                "</TABLE>\n" +
	                "</BODY></HTML>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
