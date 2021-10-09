package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ResultFormatFilter implements Filter {

	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("init from format filter");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("inside format filter");
		String maths = request.getParameter("maths");
		String sci = request.getParameter("sci");
		String eng = request.getParameter("eng");
		boolean isError = false;

		try {
			Integer.parseInt(maths); // "25" "tejas"
		} catch (Exception e) {
			request.setAttribute("mathsError", "Invalid Maths Marks");
			isError = true;
		}

		try {
			Integer.parseInt(sci); // "25" "tejas"
		} catch (Exception e) {
			request.setAttribute("sciError", "Invalid Sci Marks");
			isError = true;
		}

		try {
			Integer.parseInt(eng); // "25" "tejas"
		} catch (Exception e) {
			request.setAttribute("engError", "Invalid English Marks");
			isError = true;
		}

		if (isError == true) {
			RequestDispatcher rd = request.getRequestDispatcher("InputMarks.jsp");
			rd.forward(request, response);

		} else {
			chain.doFilter(request, response);
		}
	}

	public void destroy() {

	}

}
