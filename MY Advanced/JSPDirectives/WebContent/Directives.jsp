<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--1.import --%>
<%@page import="java.util.Date" %>
Today is<%= new Date()  %>
<br/>
<%--content type--%>
<%-- <%@page contentType="application/msword" %>  
Today is: <%= new java.util.Date() %>  --%>
<%--info// this can be fetched via getServletInfo in servlet--%> 

<%@page info="I am a new servlet/jsp" %>
Today is: <%= new java.util.Date() %> 
<br/>

<%--buffer //default size is 8kb--%>
<%@page buffer="16kb" %>
Today is: <%= new java.util.Date() %> 
<br/>

<%--EL ignored //default it is true --%>
<%@page isELIgnored="true" %>
<br/>

<%--thread safe---if it is set to true then it allows multi threading else it implements SingleThreadModel --%>
<%@page isThreadSafe="false" %>

<br/>
<%--Include directive--It is used to include any resource like html/jsp/text --%>
<%@include file="includeDirective.html"%>
<%= java.util.Calendar.getInstance().getTime() %>
</body>
</html>