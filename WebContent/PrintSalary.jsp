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
		String userName = (String) request.getAttribute("un");
		int bs = (Integer) request.getAttribute("bs");
		int bonus = (Integer) request.getAttribute("bn");
		int pf = (Integer) request.getAttribute("pf");
		int ts = (Integer) request.getAttribute("ts");
	%>
	Username:<%=userName%>
	<br> BasicSalary:
	<%=bs%>
	<br> Bonus: +<%=bonus%>
	<br> PF: -<%=pf%>
	<br> TotalSalary:<%=ts%>
</body>
</html>