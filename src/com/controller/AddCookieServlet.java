package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddCookieServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String cookieName = request.getParameter("cname");
		String cookieValue = request.getParameter("cvalue");

		Cookie c = new Cookie(cookieName, cookieValue);// create
		
		c.setMaxAge(60*60*24);//seconds 
		
		response.addCookie(c);//add cookie into browser 

		response.sendRedirect("AddCookie.jsp");

	}

}
