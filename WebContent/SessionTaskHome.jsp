<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
</head>
<body>

	<div class="container">
		<h2>Home</h2>
		Welcome , ${userName} 
		
		<br>
		<a href="SessionTaskViewMyCartServlet">My Cart</a> | 
		<a href="SessionTaskLogoutServlet">Logout</a> 
		
		<br> <br> <br>

		<div class="row">
			<div class="col-md-4">
				<img height="100px" width="100px" src="assets/images/iphone11.png"><br>Iphone<br>52000<br>
				<a href="SessionTaskAddToCartServlet?productId=1">AddToCart</a>
			</div>
			<div class="col-md-4">
				<img height="100px" width="100px" src="assets/images/legiony540.jpg"><br>LegionY540<br>1,52,000

				<br>
				<a href="SessionTaskAddToCartServlet?productId=2">AddToCart</a>
			</div>
			<div class="col-md-4">
				<img height="100px" width="100px"
					src="assets/images/microwave oven.jpg"><br>MicroWave<br>22000<br>
				<a href="SessionTaskAddToCartServlet?productId=3">AddToCart</a>
			</div>



		</div>
	</div>








</body>
</html>