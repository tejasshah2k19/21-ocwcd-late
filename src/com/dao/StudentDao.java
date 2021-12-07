package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bean.StudentBean;
import com.util.DbConnection;

public class StudentDao {

	public int insertStudent(StudentBean studentBean) {
		int i = -1;
		// insert logic
		try {
			Connection con = DbConnection.getConnection();
			PreparedStatement pstmt = con
					.prepareStatement("insert into student (firstName,email,password) values (?,?,?)");
			pstmt.setString(1, studentBean.getFirstName());
			pstmt.setString(2, studentBean.getEmail());
			pstmt.setString(3, studentBean.getPassword());
			i = pstmt.executeUpdate();// record insert
			// executeUpdate -- insert update delete
			// executeQuery -- select

		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	public ResultSet getAllStudent() {
		try {
			Connection con = DbConnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from student");
			ResultSet rs = pstmt.executeQuery();// data
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	public StudentBean getStudentById(int studentId) {

		try {
			Connection con = DbConnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from student where studentId = ?");
			pstmt.setInt(1, studentId);

			ResultSet rs = pstmt.executeQuery();// data
			rs.next(); // jump
			StudentBean sb = new StudentBean();

			sb.setStudentId(rs.getInt("studentId"));
			sb.setFirstName(rs.getString("firstName"));
			sb.setEmail(rs.getString("email"));
			sb.setPassword(rs.getString("password"));

			return sb;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public int updateStudent(StudentBean studentBean) {
		int i = -1;
		// insert logic
		try {
			Connection con = DbConnection.getConnection();
			PreparedStatement pstmt = con
					.prepareStatement("update  student  set firstName = ? , email = ? , password = ? where studentId = ? ");
			pstmt.setString(1, studentBean.getFirstName());
			pstmt.setString(2, studentBean.getEmail());
			pstmt.setString(3, studentBean.getPassword());
			pstmt.setInt(4, studentBean.getStudentId());
			
			i = pstmt.executeUpdate();// record insert
			// executeUpdate -- insert update delete
			// executeQuery -- select

		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}

}
