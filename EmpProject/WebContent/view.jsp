<%@page import="emp.bean.EmpBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1"> 
		<thead> 
			<tr> 
				<th>#</th> 
				<th>Emp ID </th> 
				<th>Emp Name </th> 
				<th>Emp Sal </th> 
				<th>Emp Addr </th> 
			</tr> 
		</thead> 
		<tbody> 

<%
int i =1;
List<EmpBean> list = (List)request.getAttribute("bean");

%>

<%

for (EmpBean emp: list){
%>

<tr> 
				<td><%=i++%></td> 
				<td><%=emp.getEmpId()%></td>
				<td><%=emp.getEmpName()%></td>
				<td><%=emp.getEmpSal()%></td>
				<td><%=emp.getEmpAddr()%></td>
				
				</tr> 
			<% 
				} 
			%> 
</tbody> 
</body>
</html>