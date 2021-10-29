package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionTaskViewMyCartServlet")
public class SessionTaskViewMyCartServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();

		response.setContentType("text/html");// MIME
		out.print("<html><body>");

		if (session.getAttribute("productId") == null) {
			out.print("Cart is Empty");
		} else {
			int productId = (Integer) session.getAttribute("productId");

			if (productId == 1) {
				out.print("Iphone11 52000");
			}

			if (productId == 2) {
				out.print("LegionY540 1,52,000");
			}

			if (productId == 3) {
				out.print("MicroWave 22000");
			}
		}
		out.print("</body></html>");

	}
}
