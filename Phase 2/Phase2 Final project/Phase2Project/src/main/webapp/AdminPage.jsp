<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>
</head>
<body >
<br>
<div align="center">
		<h1><FONT COLOR= PURPLE>FlyAway</FONT></h1>
		</div>
<br>
<center>
<h2>Admin Login</h2>
<div style="border:3px solid black;width:25%;border-radius:20px;padding:20px" align="center">
<form action=AdminLogin method=post>
	<label for=email>Email :-</label> <input type="email" name=email id=email /><br><br>
	<label for=pass>Password :-</label> <input type="password" name=password id=pass /><br><br>
	<input type=submit value=submit /> 
</form>
</div>
<a href=ForgotPassword.jsp style="font-size:25;color:red;">Forgot Password</a>

</center><br>

<%
	String message=(String)session.getAttribute("message");
	if(message!=null){
%>
<p style="color:silver;"><%=message %></p>
<%
		session.setAttribute("message", null);
	}
%>
</body>
</html>