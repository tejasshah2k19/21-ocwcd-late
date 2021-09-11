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

@WebServlet("/DeleteStudentServlet")
public class DeleteStudentServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int studentId = Integer.parseInt(request.getParameter("studentId"));
		int i = -1;
		try {
			Connection con = DbConnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement("delete from student where studentId = ?");
			pstmt.setInt(1, studentId);

			i = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		RequestDispatcher rd = null;

		if (i == 1) {
			rd = request.getRequestDispatcher("ListStudentServlet");
		} else {
			request.setAttribute("error", "Invalid Student Id");
			rd = request.getRequestDispatcher("Fail.jsp");
		}

		rd.forward(request, response);

	}
}
