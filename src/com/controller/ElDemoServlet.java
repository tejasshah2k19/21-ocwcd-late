package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ElDemoServlet")
public class ElDemoServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		request.setAttribute("email", "tejas@request.com");
		request.getSession().setAttribute("email","tejas@session.com");
		request.getServletContext().setAttribute("email", "tejas@application.com");
		request.getRequestDispatcher("ELDemo.jsp").forward(request, response);
	
	}

	
}
