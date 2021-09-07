package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.DbConnection;

@WebServlet("/AddStudentServlet")
public class AddStudentServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		int i = 0;
		// insert logic
		try {
			Connection con = DbConnection.getConnection();
			PreparedStatement pstmt = con
					.prepareStatement("insert into student (firstName,email,password) values (?,?,?)");
			pstmt.setString(1, firstName);
			pstmt.setString(2, email);
			pstmt.setString(3, password);
			i = pstmt.executeUpdate();// record insert
			// executeUpdate -- insert update delete
			// executeQuery -- select

		} catch (Exception e) {

		}
		RequestDispatcher rd = null;
		if (i == 1) {
			rd = request.getRequestDispatcher("success.jsp");
			// success
		} else {
			// fail
			rd = request.getRequestDispatcher("fail.jsp");
		}
		rd.forward(request, response);
	}

}
