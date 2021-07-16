.
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="java.util.*" %>
The name is: ${ param.name}
<br/>
Value is: :${sessionScope.user }
<br/>
Cookie value is : ${cookie.uname.value }
<br/>
<% List<String>list=new ArrayList<>();
list.add("hi");
list.add("hello");
list.add("welcome");
pageContext.setAttribute("list", list);
%>
list value : ${list[1]}
<br/>
Context value is: ${initParam.name}
<br/>
<%-- Bean value is: ${sessionScope.u} --%>

</body>
</html>