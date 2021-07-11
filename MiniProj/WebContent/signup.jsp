<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
	font-family: Calibri, Helvetica, sans-serif;
	background-color: pink;
}

.container {
	padding: 50px;
	background-color: lightblue;
}

input[type=text], input[type=password], textarea {
	width: 100%;
	padding: 15px;
	margin: 5px 0 22px 0;
	display: inline-block;
	border: none;
	background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
	background-color: orange;
	outline: none;
}

div {
	padding: 10px 0;
}

hr {
	border: 1px solid #f1f1f1;
	margin-bottom: 25px;
}

.registerbtn {
	background-color: #4CAF50;
	color: white;
	padding: 16px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 100%;
	opacity: 0.9;
}

.registerbtn:hover {
	opacity: 1;
}
</style>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	
	
	<script>
$(document).ready(function() {
	alert("hey jquery..");
	$('#email').on("input keyup",function() {
		//alert("entered into function");
		var email=$('#email').val();
		$.post("EmailExistServlet",{
			email:email
		},
		function(res){
			//alert("entered into response function"+res);
			$('#emailerror').text(res);
			if(res!=""){
				$('#email').val();
			}
		});
	});
});

</script>
	
	
	
	
<!--	
<script>
	//alert("first");
	 $(document).ready(function() {
		alert("hello");
		$("#email").on("input keyup", function() {
			//alert("on click called");
			var email = $('#email').val();
			$.post("EmailExistServlet", {   
				email:email
				
			},
		
		
			function(res){

				$("#emailerror").text(res);
				if (res !=""){
				
					$("#email").val("");
				}
				});
				
			});
	
	});

			</Script>
 -->

</head>
<body>
	<form action="./RegisterServlet">
		<div class="container">
			<center>
				<h1>Student Registeration Form</h1>
			</center>
			<hr>
			<label> Firstname </label> <input type="text" name="firstname"
				placeholder="Firstname" size="15" required /> <label>
				Middlename: </label> <input type="text" name="middlename"
				placeholder="Middlename" size="15" /> <label> Lastname: </label> <input
				type="text" name="lastname" placeholder="Lastname" size="15"
				required />
			<div>
				<label for="email"><b>Email</b></label> <input type="text"
					placeholder="Enter Email" name="email" id="email" required>
					
					<span id="emailerror" style="color:red;"></span><br>
					
				<label for="psw"><b>Password</b></label> <input type="password"
					placeholder="Enter Password" name="password" required> <label
					for="psw-repeat"><b>Re-type Password</b></label> <input
					type="password" placeholder="Retype Password" name="passwordrepeat"
					required>
				<button type="submit" class="registerbtn">Register</button>


				<!-- <label>   
Course :  
</label>   
  
<select>  
<option value="Course">Course</option>  
<option value="BCA">BCA</option>  
<option value="BBA">BBA</option>  
<option value="B.Tech">B.Tech</option>  
<option value="MBA">MBA</option>  
<option value="MCA">MCA</option>  
<option value="M.Tech">M.Tech</option>  
</select>  
</div>  
<div>  
<label>   
Gender :  
</label><br>  
<input type="radio" value="Male" name="gender" checked > Male   
<input type="radio" value="Female" name="gender"> Female   
<input type="radio" value="Other" name="gender"> Other  
  
</div>  
<label>   
Phone :  
</label>  
<input type="text" name="country code" placeholder="phone no"  maxlength ="10" pattern="[1-9]{1}[0-9]{9}"required/>   
 
Current Address :  
<textarea cols="80" rows="5" placeholder="Current Address" value="address" required>  
</textarea>   -->
	</form>
</body>
</html>
