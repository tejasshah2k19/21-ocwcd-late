<%@page import="com.bean.UserBean"%>
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
		UserBean userBean = new UserBean();
		userBean.setFirstName("ram");
		out.print(userBean.getFirstName());
	%>

	<Br>
	<br>
	<jsp:useBean id="user" class="com.bean.UserBean"></jsp:useBean>
	<jsp:setProperty property="firstName" name="user" value="ram" />
	<jsp:getProperty property="firstName" name="user" />



	<form action="SaveUser.jsp">
		FirstName: <input type="text" name="firstName"><br> Email
		: <input type="text" name="email" /><br> <input type="submit"
			value="Save" />
	</form>
</body>
</html>