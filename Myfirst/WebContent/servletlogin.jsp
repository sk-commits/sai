<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form id = "loginform" action="./AuthenticationServlet">

		userName:<input type="text" name="userName"> 
		password:<input type="text" name="password"> 
		<input type="submit" value="login">

</form>
</body>
</html>