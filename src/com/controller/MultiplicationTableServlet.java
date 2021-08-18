package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MultiplicationTableServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String x = request.getParameter("n1");
		int n1 = Integer.parseInt(x);

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		out.print("<html><body>");

		for (int i = 1; i <= 10; i++) {

			out.print(n1 + " * " + i + " = " + (n1 * i)+"<br>");
		}

		out.print("</body></html>");

	}
}
