package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculateSalaryServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userName = request.getParameter("userName");
		String bs = request.getParameter("bs");// "20000"

		int basicSalary = Integer.parseInt(bs);// 20000
		int bonus = (basicSalary * 10) / 100;
		int pf = (int) (basicSalary * 0.12);
		int totalSalary = basicSalary + bonus - pf;
	
		
		request.setAttribute("bs", basicSalary);
		request.setAttribute("bn", bonus);
		request.setAttribute("pf", pf);
		request.setAttribute("ts", totalSalary);
		request.setAttribute("un", userName);
		
		
		
		RequestDispatcher rd = request.getRequestDispatcher("PrintSalary.jsp");
		rd.forward(request, response);
	}
}
