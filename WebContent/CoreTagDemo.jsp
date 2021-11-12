<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>

	<%
		//page
		//pageContext
		//request
		//response  
		//session
		//application
		//out
		//exception** 
		//config
	%>

	<%
		int a = 90;
	%>

	<%=a%>
	<br>

	<c:set var="a" value="3"></c:set>
	<c:out value="${a}"></c:out>

	<c:if test="${a%2==0}">
			Number is Even
	</c:if>

	<c:if test="${a%2!=0}">
			Number is Odd
	</c:if>


	<c:choose>

		<c:when test="${a  == 1 }">
			1
		</c:when>

		<c:when test="${a  == 2 }">
		2
		</c:when>

		<c:when test="${a  == 3 }">
		3
		</c:when>

		<c:when test="${a  == 4 }">
		4
		</c:when>

		<c:otherwise>
			otherwise
		</c:otherwise>

	</c:choose>


















</body>
</html>