package com.register;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;



public class PageNotFound extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");;
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Error Page</title></head><body>");
		out.println("Sorry the page you are looking for is not found");
		out.println("<a href='/FormApp'>Head to home page</a>");
		out.println("</body></html>");
	}
	

}
