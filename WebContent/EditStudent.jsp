<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<form action="UpdateStudentServlet" method="post">
		FirstName: <input type="text" name="firstName"
			value="${student.firstName }" /><Br> Email :<input type="text"
			name="email" value="${student.email}" /><Br> Password: <input
			type="text" name="password" value="${student.password }" /><Br>
			<input type="hidden" name="studentId" value="${student.studentId}">
		
		<input type="submit" value="Update Student">
	</form>
	<br>
	<a href="ListStudentServlet">List All Students</a>
</body>

</html>