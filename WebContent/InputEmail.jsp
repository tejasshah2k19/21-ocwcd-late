<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>


	<form action="RegExValidationServlet" method="post">
		Name: <input type="text" name="name" value="${nameValue}" />
		${nameError} <br> Email: <input type="text" name="email"
			value="${emailValue }" /> ${emailError } <br> <input
			type="submit" value="Process" />
	</form>

</body>
</html>