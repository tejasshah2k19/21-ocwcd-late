package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionTaskLoginServlet")
public class SessionTaskLoginServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userName = request.getParameter("userName");
		String password = request.getParameter("password");

		HttpSession session = request.getSession(); // old ? new ? no new ?
		session.setAttribute("userName", userName);

		ArrayList<Integer>  products = new ArrayList<Integer>(); // blank list productId 
		session.setAttribute("products", products);//1 2 3 
		
		response.sendRedirect("SessionTaskHome.jsp");
	}
}
