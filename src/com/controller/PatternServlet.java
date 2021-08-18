package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PatternServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String n1 = request.getParameter("n1");// "25" -> 25
		int n = Integer.parseInt(n1);// "25" ==> 25

		PrintWriter out = response.getWriter();

		response.setContentType("text/html");// MIME

		out.print("<html><body>");

		for (int i = 1; i <= 5; i++) { // 1 2 3 4 5
			for (int j = 1; j <= i; j++) {
				out.print(j +"  ");
			}
			out.print("<br>");
		}

		out.print("<body><html>");

		// Maths<Integer> m = new Maths();
//		Maths<Float> m1 = new Maths();
//		Maths<String> m2 = new Maths();
//			
	}
}
//class Maths<T extends Number>{
//	void add(T a,T b) {
//		
//	}
//}