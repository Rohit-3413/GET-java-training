package com.coforge.training.shopstop;
import java.util.Date;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 	
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        request.getRequestDispatcher("link.html").include(request, response);  
        
        // create Application scope attribute using ServletContext object
        ServletContext sc= getServletContext();
        sc.setAttribute("project", "ShopStop Shopping Web App");
        
        String name=request.getParameter("username");  
        String password=request.getParameter("password");  
          
        if(password.equals("admin123")){  
        out.print("<h3>Welcome, "+name+"<h3>");  
        
     // create a new session if there is no active session
        HttpSession session=request.getSession();
        
        session.setAttribute("uname", name);  // creating session attributes
        session.setAttribute("company", "Coforge");
        
        out.print("You are Logged in at: "+ new Date(session.getCreationTime())
        		+" from "+session.getAttribute("company")+ "<br> Session ID: "+session.getId());
        
      int t=50;
        //set session time out
        session.setMaxInactiveInterval(t);
        response.setHeader("Refresh", t +";URL=timeout.html");	       
        }  
        else{  
            out.print("Sorry, username or password error!");  
            request.getRequestDispatcher("user.html").include(request, response);  
        }  
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
