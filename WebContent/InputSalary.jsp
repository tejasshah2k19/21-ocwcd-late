<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<%
		String userNameValue = (String) request.getAttribute("userNameValue");
		String bsValue = (String) request.getAttribute("bsValue");

		String userError = (String) request.getAttribute("userNameError");
		String bsError = (String) request.getAttribute("bsError");
	%>


	<form action="CalculateSalaryServlet">
		Username : <input type="text" name="userName" value="<%=userNameValue==null?"":userNameValue %>" />
		<%=userError == null ? "" : userError%>
		<br> BasicSalary: <input type="text" name="bs" value="<%=bsValue==null?"":bsValue %>" />
		<%=bsError == null ? "" : bsError%>
		<br> <input type="submit" value="CalculateSalary" />
	</form>

</body>
</html>