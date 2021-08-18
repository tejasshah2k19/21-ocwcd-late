package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("******************RegistrationServlet****************");
		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String city = request.getParameter("city");
		String hobby[] = request.getParameterValues("hobby");

		// set data into request scope

		request.setAttribute("firstName", firstName);
		request.setAttribute("email", email);
		request.setAttribute("pwd", password);
		request.setAttribute("gender", gender);
		request.setAttribute("city", city);
		request.setAttribute("hobby", hobby); // key --> string , value --> Object

		RequestDispatcher rd = request.getRequestDispatcher("PrintInfo.jsp");// A.html
		rd.forward(request, response);

	}
}
