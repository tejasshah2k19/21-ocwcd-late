package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.util.DbConnection;

public class StudentDao {

	public int insertStudent(String firstName, String email, String password) {
		int i = -1;
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

}
