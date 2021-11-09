<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Request Headers</title>
</head>
<body>


	<%
		Enumeration<String> allHeaders = request.getHeaderNames();
	%>

	<%
		String x = "";
		while (allHeaders.hasMoreElements()) {
			x = allHeaders.nextElement(); // 1 2 3 4 5 6 7 8 9   
			out.print(x + " ==> " + request.getHeader(x) + "<br>");
		}

		response.addHeader("vcCount", "12");
	%>

</body>
</html>