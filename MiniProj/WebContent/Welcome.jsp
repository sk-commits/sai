<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%= "Welcome" +"   "+ request.getAttribute("email")%>


<div> 
     <a class="active" href="Home.jsp"> Sign out </a> 

</body>
</html>