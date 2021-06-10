<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    
    <%
    // request scopeaから取得
    int ans = (int)request.getAttribute("ans");
    String name = (String) request.getAttribute("name");


    %>
    
     

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="#2E86C1">
<h1> <font color="#EBFFE9" size=5>The Universe, and stars </font></h1><br>

<h2> Counting Stars </h2><br>

<h2> </h2>

 <br>
 <font color="#EBFFE9" size=5>Buna ziua, Hello, Guten Tag, こんにちは、你好 </font> <br>


<br> <font color="#EBFFE9" size=4>地球での  <%= ans  %> 年目ですね</font><br>

 <br><font color="#EBFFE9" size=5> <%= name  %>への星空は、こちらです </font> <br>

	<%for(int i=0; i<ans; i++) {%>
			<font color="#FBEA20" size=5>★</font> 
			
		<%	}%>



</body>
</html>