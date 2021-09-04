package com.controller;

import java.io.IOException;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegExValidationServlet")
public class RegExValidationServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String email = request.getParameter("email");

		boolean isError = false;

		// + ==> 1 or many
		// * ==> 0 or many
		// ? -> 0 or 1
		String nameRegEx = "^[a-zA-Z]+$";
							// xxxxxxxxxxx@xxxxxxxx.XX
		String emailRegEx  = "^[a-zA-Z0-9]+@[a-zA-Z]+\\.[a-zA-Z]{2,3}$";
		
		
		Pattern namePattern = Pattern.compile(nameRegEx);
		Pattern emailPattern = Pattern.compile(emailRegEx);
		
		if (name == null || name.trim().length() == 0) {
			isError = true;
			request.setAttribute("nameError", "Please Enter name");
		} else if (namePattern.matcher(name).matches() == false) {
			isError = false;
			request.setAttribute("nameError", "Please Enter valid name");
			request.setAttribute("nameValue", name);
		} else {
			request.setAttribute("nameValue", name);
		}

		if (email == null || email.trim().length() == 0) {
			isError = true;
			request.setAttribute("emailError", "Please Enter Email");
		}
		else if(emailPattern.matcher(email).matches() == false) {
			isError = true;
			request.setAttribute("emailError", "Please Enter Valid Email");
			request.setAttribute("emailValue", email);
		}
		else {
			request.setAttribute("emailValue", email);
		}

		RequestDispatcher rd = null;
		if (isError == true) {
			rd = request.getRequestDispatcher("InputEmail.jsp");
		} else {
			rd = request.getRequestDispatcher("home.html");
		}

		rd.forward(request, response);
	}
}
