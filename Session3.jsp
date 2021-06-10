<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.User"%>
    
    
    
    <%
    User user = (User)session.getAttribute("user");
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
 <h1> <font color="#EBFFE9"> Hello friend! <br></font></h1> 


<font color="#EBFFE9" size=3>Please confirm <br></font>

<body bgcolor="#2E86C1">
Name <%= user.getName() %> <br>
ID   <%= user.getId() %> <br>

<form action="Session3" method="post">
<input type="submit" value="Confirm">
</form>

<a href="Session1"> back </a>

</body>
</html>