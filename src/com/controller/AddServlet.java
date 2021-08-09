package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
	
		int n1 = Integer.parseInt(request.getParameter("n1"));//"20"
		String no2 = request.getParameter("n2");
		int n2 = Integer.parseInt(no2);
	
		String opr = request.getParameter("opr");//add sub mul 
		int ans =0;
		//opr == "add" 
		
		if(opr.equals("add"))
			ans = n1 + n2;
		else if(opr.equals("sub"))
			ans = n1 - n2;
		else if(opr.equals("mul"))
			ans = n1*n2;
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter(); 
	
	
		out.print("<html><body>");
		out.print("Ans = " +ans);
		out.print("</body></html>");
		
		
		
	}
}
