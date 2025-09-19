package com.coforge.training.shopstop;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Servlet implementation class RequestMethodDemo
 */
@WebServlet("/RequestMethodDemo")
public class RequestMethodDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestMethodDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
	        response.setCharacterEncoding("UTF-8");
	        
	        PrintWriter out = response.getWriter();
	        
	        out.println("<!DOCTYPE html>");
	        out.println("<html lang='en'>");
	        out.println("<head>");
	        out.println("    <meta charset='UTF-8'>");
	        out.println("    <meta name='viewport' content='width=device-width, initial-scale=1.0'>");
	        out.println("    <title>HttpServletRequest Methods Demo</title>");
	        out.println("    <style>");
	        out.println("        body { font-family: Arial, sans-serif; margin: 40px; line-height: 1.6; }");
	        out.println("        h1 { color: #333; }");
	        out.println("        h2 { color: #555; border-bottom: 2px solid #eee; padding-bottom: 10px; }");
	        out.println("        .section { margin: 20px 0; padding: 15px; border: 1px solid #ddd; border-radius: 5px; }");
	        out.println("        .info { background-color: #f9f9f9; padding: 10px; margin: 5px 0; border-left: 4px solid #4CAF50; }");
	        out.println("        .warning { background-color: #fff3cd; padding: 10px; margin: 5px 0; border-left: 4px solid #ffc107; }");
	        out.println("        table { width: 100%; border-collapse: collapse; margin: 10px 0; }");
	        out.println("        th, td { border: 1px solid #ddd; padding: 8px; text-align: left; }");
	        out.println("        th { background-color: #f2f2f2; }");
	        out.println("        .test-form { background-color: #e7f3fe; padding: 15px; border-radius: 5px; }");
	        out.println("        input[type='text'], textarea { width: 100%; padding: 8px; margin: 5px 0; }");
	        out.println("    </style>");
	        out.println("</head>");
	        out.println("<body>");
	        out.println("    <h1>HttpServletRequest Methods Demonstration</h1>");
	        
	        // Basic Request Information
	        out.println("    <div class='section'>");
	        out.println("        <h2>Basic Request Information</h2>");
	        out.println("        <div class='info'>Method: " + request.getMethod() + "</div>");
	        out.println("        <div class='info'>Request URI: " + request.getRequestURI() + "</div>");
	        out.println("        <div class='info'>Context Path: " + request.getContextPath() + "</div>");
	        out.println("        <div class='info'>Servlet Path: " + request.getServletPath() + "</div>");
	        out.println("        <div class='info'>Path Info: " + request.getPathInfo() + "</div>");
	        out.println("        <div class='info'>Query String: " + request.getQueryString() + "</div>");
	        out.println("        <div class='info'>Protocol: " + request.getProtocol() + "</div>");
	        out.println("    </div>");
	        
	        // Client Information
	        out.println("    <div class='section'>");
	        out.println("        <h2>Client Information</h2>");
	        out.println("        <div class='info'>Remote Address: " + request.getRemoteAddr() + "</div>");
	        out.println("        <div class='info'>Remote Host: " + request.getRemoteHost() + "</div>");
	        out.println("        <div class='info'>Remote Port: " + request.getRemotePort() + "</div>");
	        out.println("        <div class='info'>Remote User: " + request.getRemoteUser() + "</div>");
	        out.println("        <div class='info'>Local Address: " + request.getLocalAddr() + "</div>");
	        out.println("        <div class='info'>Local Name: " + request.getLocalName() + "</div>");
	        out.println("        <div class='info'>Local Port: " + request.getLocalPort() + "</div>");
	        out.println("    </div>");
	        
	        // Header Information
	        out.println("    <div class='section'>");
	        out.println("        <h2>Request Headers</h2>");
	        out.println("        <table>");
	        out.println("            <tr><th>Header Name</th><th>Header Value</th></tr>");
	        Enumeration<String> headerNames = request.getHeaderNames();
	        while (headerNames.hasMoreElements()) {
	            String headerName = headerNames.nextElement();
	            String headerValue = request.getHeader(headerName);
	            out.println("            <tr><td>" + headerName + "</td><td>" + headerValue + "</td></tr>");
	        }
	        out.println("        </table>");
	        out.println("        <div class='info'>Content Type: " + request.getContentType() + "</div>");
	        out.println("        <div class='info'>Content Length: " + request.getContentLength() + "</div>");
	        out.println("        <div class='info'>Character Encoding: " + request.getCharacterEncoding() + "</div>");
	        out.println("    </div>");
	        
	        out.println("</body>");
		        out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
