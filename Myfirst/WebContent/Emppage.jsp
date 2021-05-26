<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>


<script>
	alert("first");
	$(document).ready(function() {
		alert("hello");
		$("#submit").click(function() {
			alert("on click called");
			
			$.ajax({
				type: 'GET',
				Url: './EmpServlet',
				success: function(result){
					
					alert(result);
					
				},
				error : function(err) {
					alert("unable to reterive data" + err); 
					
							}
			});
		});
	});
</script>
</head>


<body>
<form action="./EmpServlet">
<input type = "submit", id = "submit", value = "submit"/>
<div id = "result" ></div>

</form>
</body>
</html>