<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@ taglib uri="http://www.royal.com/emp/tejas/ctag" prefix="c"%>
<%@ taglib uri="http://www.royal.com/emp/tejas/stag" prefix="s"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:curr></c:curr>
	<br> this is demo of classic tag
	<br>
	<br>

	<div style="color: red">
		<c:print>Royal</c:print>
	</div>
	
	
	<c:loop count="3">Education</c:loop><br><br>
	
	
</body>
</html>