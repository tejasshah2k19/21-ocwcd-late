<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>

	<%
		ResultSet rs = (ResultSet)request.getAttribute("rs");
		rs.next(); // jump to first row and return true  
	%>

	StudentId : <%=rs.getInt("studentId") %>
	<br>FirstName : <%=rs.getString("firstName") %>
	<br>Email : <%=rs.getString("email") %>
	
	

</body>
</html>