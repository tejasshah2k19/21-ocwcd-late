package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdminLoginServlet extends HttpServlet {

	String adminEmail  = "";
	String adminPassword = "";
	@Override
	public void init(ServletConfig config) throws ServletException {

		adminEmail  = config.getInitParameter("email");
		adminPassword = config.getInitParameter("password");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		RequestDispatcher rd = null;
	
		ServletContext context = getServletContext();
		
		System.out.println("Global Email => "+context.getInitParameter("globalEmail"));
		System.out.println("Global Password => "+context.getInitParameter("globalPassword"));
		
		
		
		System.out.println("admin email password"+adminEmail+" "+adminPassword);
		if (email.equals(adminEmail) && password.equals(adminPassword)) {

			rd = request.getRequestDispatcher("AdminDashboard.jsp");
		} else {
			request.setAttribute("error", "Invalid Credentials");
			rd = request.getRequestDispatcher("AdminLogin.jsp");
		}
		rd.forward(request, response);

	}
}
