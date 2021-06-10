<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="java.util.Date"%>
     <%
    Date d = new Date();
   
    %>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="#2E86C1">
<h1> <font color="#EBFFE9" size=5>The Universe, and 42 </font></h1><br>

<font color="#EBFFE9" size=3>こんにちは、Buna ziua, Hello, Guten Tag, 你好 </font> <br>
<font color="#EBFFE9" size=3>Today is,  <%= d %></font> <br>


<h2> Talking to the Moon or Counting Stars </h2><br>

<br>

<br>

<font color="#EBFFE9" size=3>Let's discover the univsere...</font>  <br>

<br>
<form action="CalcServlet" method="post"> 

Name <input type="text" name="name"><br>
Birth<input type="text" name="num1"><br>


<br>
<input type="radio" name="game" value="stars">   <font color="#EBFFE9" size=3>Counting Stars★</font><br> 
<input type="radio" name="game" value="moon"> <font color="#EBFFE9" size=3> Talking to the Moon☽</font> <br>

 <br>
<input type="submit" value="Check out"><br>



</form>


</body>
</html>