package com.register;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.*;

public class RegisterUser extends HttpServlet {
	
//	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//		PrintWriter out = response.getWriter();
//		out.println("Register user called");
//	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		out.print("User registered Successfully");
//		HttpSession session = request.getSession();
//		session.setAttribute("name", request.getParameter("name"));
		HttpSession session = request.getSession();
	}
}