<%@page import="emp.bean.EmpBean"%>
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

EmpBean bean = (EmpBean)request.getAttribute("bean");
String empId = bean.getEmpId();
String empName = bean.getEmpName();
String empSal = bean.getEmpSal();
String empAddr = bean.getEmpAddr();

out.println("empid"+ empId+"empName"+empName +"empsal"+ empSal +"empAddr"+empAddr);

%>

</body> 
</html>