<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form:form action="submit.do" method="post" modelAttribute="loginBean">
<label>FirstName:   </label>
<form:input path="fname"/><br/><br/>
<label>LastName:   </label>
<form:input  path="lname"/><br/><br/>
<label>EmailAddr:</label>
<form:input type="email" path="email"/><br/><br/>
<label>Gender:</label>
<form:radiobutton  path="gender" value="male"/>Male
<form:radiobutton  path="gender" value="female"/>Female
<br/><br/>
<label>Location</label>
<form:select path="location">
<option placeholder="Select location">   </option>
<option>Chennai</option>
<option>Kanyakumari</option>
<option>Salem</option>
<option>Coimbatore</option>
</form:select>
<br/><br/>
<input type="submit" value="submit" >
<input type="reset" value="cancel" >
</form:form> 


</body>
</html>