<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		ResultSet rs = (ResultSet) request.getAttribute("rs");
	%>
	<h2>List All Students</h2>


	<table border="1">
		<thead>
			<tr>
				<th>StudentId</th>
				<th>FirstName</th>
				<th>Email</th>
				<th>Password</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<%
				while (rs.next() == true) {
					int studentId = rs.getInt("studentId");
					String firstName = rs.getString("firstName");
					String email = rs.getString("email");
					String password = rs.getString("password");
			%>
			<tr>
				<td><%=studentId%></td>
				<td><%=firstName%></td>
				<td><%=email%></td>
				<td><%=password%></td>
				<td><a href="DeleteStudentServlet?studentId=<%=studentId%>">Delete</a> | 
					<a href="ViewStudentServlet?studentId=<%=studentId%>">View</a> |
					<a href="EditStudentServlet?studentId=<%=studentId%>">Edit</a> |
					
				</td>
			</tr>
			<%
				}
			%>
		</tbody>
	</table>


</body>
</html>