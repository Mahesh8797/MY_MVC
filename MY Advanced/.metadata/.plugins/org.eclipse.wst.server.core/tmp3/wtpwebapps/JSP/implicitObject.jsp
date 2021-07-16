<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- //1.out -->
<% out.println("Welcome");%>
<!-- //2.request -->
<% String name=request.getParameter("name");
out.println("Name is "+name);%>
<!-- //3.response -->
 <!--   response.sendRedirect("https://www.google.com"); %> -->
 <!-- //4.config -->
 
 <% String value=config.getInitParameter("mahe") ;
 out.println("config value is "+value);%>
  <!-- //5.context(application -->
  <% String v=application.getInitParameter("age");
  out.println("context value is "+v);
  %>
  <!-- //5.session-->
  <% String n=request.getParameter("name");
  out.println("Welcome "+n);
  session.setAttribute("name", n); 
  %>
  <a href="Sample.jsp">Goto</a>
  <!-- //5.pageContext-->
  <% String na=request.getParameter("name");
  out.println("Welcome "+na);
  pageContext.setAttribute("user", na, PageContext.PAGE_SCOPE);
  %>
  <a href="Simple.jsp">page context</a>
  
</body>
</html>