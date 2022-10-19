package com.register;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.*;

public class HandlingUserException extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		out.println("User Exception Thrown");
	}
}