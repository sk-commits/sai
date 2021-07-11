<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<style>

body {
/* background-color: black; */
  font-family: cursive;
}

.glow {
  font-size: 30px;
  color: #fff;
  text-align: top;
  animation: glow 1s ease-in-out infinite alternate;
}

@-webkit-keyframes glow {
  from {
    text-shadow: 0 0 10px #fff, 0 0 20px #fff, 0 0 30px #e60073, 0 0 40px #e60073, 0 0 50px #e60073, 0 0 60px #e60073, 0 0 70px #e60073;
  }
  
  to {
    text-shadow: 0 0 20px #fff, 0 0 30px #ff4da6, 0 0 40px #ff4da6, 0 0 50px #ff4da6, 0 0 60px #ff4da6, 0 0 70px #ff4da6, 0 0 80px #ff4da6;
  }
}
</style>


<%@ include file="includes/header.jsp" %> 

<%@ include file="includes/Nav.jsp" %>

<%@ include file="includes/footer.jsp" %>

<%@ include file="carousel.jsp" %>



<h3 class="glow"><marquee> Welcome to my Web Page </marquee></h3>


</body>
</html>