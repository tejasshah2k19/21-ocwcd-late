package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CalculateResultFilter implements Filter {
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("calculate result filter init");
	}

	// 1 --> init -->start server
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("calculate result filter doFilter");
		// input ? empty 
		String maths = request.getParameter("maths");
		String sci = request.getParameter("sci");
		String eng = request.getParameter("eng");

		boolean isError = false;

		if (maths == null || maths.trim().length() == 0) {
			request.setAttribute("mathsError", "Please Enter Marks for Maths");
			isError = true;
		}
		if (sci == null || sci.trim().length() == 0) {
			request.setAttribute("sciError", "Please Enter Marks For Science");
			isError = true;
		}

		if (eng == null || eng.trim().length() == 0) {
			request.setAttribute("engError", "Please Enter Marks for English");
			isError = true;
		}

		if (isError) {
			// back --> InputMarks.jsp
			RequestDispatcher rd = request.getRequestDispatcher("InputMarks.jsp");
			rd.forward(request, response);
		} else {
			chain.doFilter(request, response);// go ahead --> call servlet
		}
	}

	public void destroy() {
		System.out.println("calculate result filter destory");
	}
}
