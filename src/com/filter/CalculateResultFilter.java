package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CalculateResultFilter implements Filter {
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("calculate result filter init");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("calculate result filter doFilter");
		chain.doFilter(request, response);// go ahead --> call servlet 
	}

	public void destroy() {
		System.out.println("calculate result filter destory");
	}
}
