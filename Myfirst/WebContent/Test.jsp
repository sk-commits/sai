<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3> Enter your age</h3>
<form action="">
Age: <input type="text" name="age" id="age"/>
<input type="submit"  id="submit" value="Register"/>
</form>

<%
	 String age = request.getParameter("age");

	/* if (age =18 ){
	

		out.println("you are eligible to vote");

	} else {

		out.println("you are not eligible to vote");
	} */
%>
</body>
</html>