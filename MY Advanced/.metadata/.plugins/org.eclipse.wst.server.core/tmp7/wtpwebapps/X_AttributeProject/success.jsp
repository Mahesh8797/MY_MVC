<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4>Login is successful!</h4>
<% 
String fname=(String)request.getAttribute("fname");
String lname=(String)request.getAttribute("lname");
String email=(String)request.getAttribute("email");
String gender=(String)request.getAttribute("gender");
String location=(String)request.getAttribute("location");
out.println("\nWelcome "+fname);
out.println("\nPlease verify your details to proceed");
out.println("FirstName : "+fname);
out.println(" \nLastName : "+lname);
out.println("Email: "+email);
out.println("Gender :"+gender);
out.println("Location : "+location);
%>
</body>
</html>