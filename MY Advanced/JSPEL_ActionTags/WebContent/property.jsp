<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="obj" class="Beans.User"/>
<jsp:setProperty property="*" name="obj"/>
Records:<br/>
<jsp:getProperty property="name" name="obj"/>
<br/>
<jsp:getProperty property="password" name="obj"/>
<br/>
<jsp:getProperty property="email" name="obj"/>
</body>
</html>