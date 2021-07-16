<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="Beans.User" %>
<jsp:useBean id="b" class="Beans.User">
</jsp:useBean>
<% int result=b.cube(5);
out.println("Cube of 5 is "+result);
%>
</body>
</html>