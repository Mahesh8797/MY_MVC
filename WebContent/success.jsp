<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="com.UserBean" %>
<% UserBean fname= (UserBean)request.getAttribute("bean");
out.println("Welcome "+fname.getFname());
out.println("Please verify your details here ");
UserBean lname= (UserBean)request.getAttribute("bean");
UserBean email= (UserBean)request.getAttribute("bean");
UserBean gender= (UserBean)request.getAttribute("bean");
UserBean location= (UserBean)request.getAttribute("bean");
out.println("FirstName: "+fname.getFname());
out.println("LastName: "+lname.getLname());
out.println("Email Add: "+email.getEmail());
out.println("Gender: "+gender.getGender());
out.println("Location: "+location.getLocation());

%>

</body>
</html>