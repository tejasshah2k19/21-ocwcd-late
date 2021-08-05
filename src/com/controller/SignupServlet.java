package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignupServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("signup servlet called.....");
		// all parameters value are string by default and we can not modify it
		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("pwd");

		// if we give invalid pratermeter name then it will return null ;

		System.out.println(firstName);
		System.out.println(email);
		System.out.println(password);

		response.setContentType("text/html");// MIME //excel pdf image text html

		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<body>");
		out.println("FirstName : "+firstName);
		out.print("<br>");
		out.print("Email : "+email+"<br>");
		out.print("Password : "+password );
		out.println("</body>");
		out.println("</html>");

	}
}
