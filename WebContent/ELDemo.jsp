<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="myelfunction" prefix="m"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EL</title>
</head>
<body>

	${email}
	<br> ${requestScope.email}
	<br> ${sessionScope.email}
	<br> ${applicationScope.email}
	<br>
	<br> ${cookie.JSESSIONID.name}===>${cookie.JSESSIONID.value}
	<br>
	<br> ${3 + 4 }
	<br> ${"3" + 4 }
	<br> ${ 3 div 4 }
	<br> ${ 3 gt 4 }
	<br>
	<br> ELfunction ${m:inrtousd(1200) }

</body>
</html>