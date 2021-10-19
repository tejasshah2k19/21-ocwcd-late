package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/InputSessionServlet")
public class InputSessionServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");

		// session -> server
		HttpSession session = request.getSession(); // user's session
		session.setAttribute("firstName", firstName); // set data in session 
		session.setAttribute("email", email);
		
		//redirect 
		//data :-> servlet --> jsp  [ RequestDispatcher ] //cary forward your existing request 
		
		
		response.sendRedirect("SessionHome.jsp");//jump to SessionHome.jsp // new request 
	}
}
