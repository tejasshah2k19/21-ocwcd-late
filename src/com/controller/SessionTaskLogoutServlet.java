package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionTaskLogoutServlet")
public class SessionTaskLogoutServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session  = request.getSession(); 
		//which method is used to remove session's memory from server? 
		
		session.invalidate(); 
		
		
		//redirect to Login page
		response.sendRedirect("SessionTaskLogin.jsp");
	
	
	}
}
