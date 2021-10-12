package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		RequestDispatcher rd = null;
		if (email.equals("admin@admin.com") && password.equals("admin")) {

			rd = request.getRequestDispatcher("AdminDashboard.jsp");
	 	} else {
	 		request.setAttribute("error", "Invalid Credentials");
	 		rd = request.getRequestDispatcher("AdminLogin.jsp");
		}
		rd.forward(request, response);

	}
}
