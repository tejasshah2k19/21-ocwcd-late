package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionPrintDataServlet")
public class SessionPrintDataServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		String firstName = (String)session.getAttribute("firstName");//String -> cast 
		String email  = (String)session.getAttribute("email"); 
		
		PrintWriter out  = response.getWriter();
		response.setContentType("text/html");

		out.print("FirstName => "+firstName);
		out.print("<br>Email => "+email);
		
		
		out.print("<br><a href='SessionHome.jsp'>Back</a>");
		
	
	}
}
