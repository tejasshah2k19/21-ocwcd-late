package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.StudentBean;
import com.dao.StudentDao;

@WebServlet("/EditStudentServlet")
public class EditStudentServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int studentId = Integer.parseInt(request.getParameter("studentId"));

		StudentDao studentDao = new StudentDao();
		StudentBean student = studentDao.getStudentById(studentId);
		request.setAttribute("student", student);
		request.getRequestDispatcher("EditStudent.jsp").forward(request, response);
		
		
	}
}
