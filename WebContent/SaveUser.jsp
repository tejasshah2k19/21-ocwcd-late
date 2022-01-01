<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>

	<jsp:useBean id="user" class="com.bean.UserBean" scope="session"></jsp:useBean>
	<jsp:setProperty property="*" name="user" />


	<br>
	<br> FirstName :
	<jsp:getProperty property="firstName" name="user" /><br> Email:
	<jsp:getProperty property="email" name="user" /><br>



</body>
</html>