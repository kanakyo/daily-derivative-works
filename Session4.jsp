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

 <h1> <font color="#EBFFE9">  Hi,<%= user.getName() %> <br></font></h1> 

 <h3> <font color="#EBFFE9"> You have signed up succeffully! <br></font></h2> 
 
 <font color="#EBFFE9">Now you are a memeber of EVA Universe! <br></font>
 <br>
 <br>
 
<font color="#EBFFE9">Your Account Info: <br></font>

<body bgcolor="#2E86C1">

Name <%= user.getName() %> <br>
ID   <%= user.getId() %> <br>

</body>
</html>