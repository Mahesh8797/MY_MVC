<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>Printing the scirptlet tag first</p>

<% int age=23;
String name=request.getParameter("name");
out.println("The name is "+name+ " and age is "+age);
%>

<p>Printing the expression tag </p>
<%= "Welcome "+request.getParameter("name") %>

<p>Printing declaration tag</p>
<%! int age=23; %>
<%! int square(int num)
{
	return num*num;
}
%>
<%= "Square of num is "+square(4) %>
</body>
</html>