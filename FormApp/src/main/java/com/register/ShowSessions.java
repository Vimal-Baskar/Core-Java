package com.register;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.*;

public class ShowSessions extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		try {
			int SessionCount = SampleListener.SessionCount();
			out.println("Total Session Count : "+SessionCount);
			ServletContext context = getServletContext();
			Integer count = (Integer) context.getAttribute("count");
			out.println("Total page views : "+ count);
			context.setAttribute("count", ++count);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}