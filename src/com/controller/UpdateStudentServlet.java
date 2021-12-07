package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.StudentBean;
import com.dao.StudentDao;

public class UpdateStudentServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		int studentId = Integer.parseInt(request.getParameter("studentId"));

		StudentBean studentBean = new StudentBean();
		studentBean.setFirstName(firstName);
		studentBean.setEmail(email);
		studentBean.setPassword(password);
		studentBean.setStudentId(studentId);

		int i = 0;

		StudentDao studentDao = new StudentDao();
		i = studentDao.updateStudent(studentBean);

		RequestDispatcher rd = null;
		if (i == 1) {
			rd = request.getRequestDispatcher("ListStudentServlet");
		} else {
			rd = request.getRequestDispatcher("fail.jsp");
		}
		rd.forward(request, response);

	}

}
