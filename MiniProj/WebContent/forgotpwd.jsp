<%@page import="miniproj.bean.RegBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

RegBean bean = (RegBean)request.getAttribute("bean");
String pwd = bean.getPassword();

out.println("Your Password is.........."+" "+ pwd);



%>

</body>
</html>