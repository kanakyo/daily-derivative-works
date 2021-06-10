<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    
    <%
    // request scopeaから取得
    int ans = (int)request.getAttribute("ans");
    int moon = (int)request.getAttribute("moon");
    int num1 = (int)request.getAttribute("num1");
    String name = (String) request.getAttribute("name");


    %>
    
     

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="#2E86C1">
<h1> <font color="#EBFFE9" size=5>The Universe, and the Moon </font></h1>

<h2> Talking to the Moon </h2><br>

 <br>
 <font color="#EBFFE9" size=5>Buna ziua, Hello, Guten Tag, こんにちは、你好 </font> <br>
<h2>  </h2>

 <font color="#D3FBFF" size=3> When you're talking to the Moon, <br>
 do you know that she is spinning away from you, <br>
 at the rate of 3.78cm per year, <br>
 at about the same speed at which our fingernails grow. <br>
 月は、あなたから、毎年3.78cm ずつ遠去かっている。<br>
 大体、爪の伸びるスピードと同じ
 </font> <br>
 


<br> <font color="#EBFFE9" size=4>And now you're  <%= ans  %> years old.</font><br>
 <br><font color="#EBFFE9" size=4> The moon has drifted  <%= moon  %> cm away from you since <%= num1  %>. <br>
 ので、あなたは今、<%= ans  %> 歳です。
 生まれてから、月から <%= moon  %> cm​ 遠去かっていた。 <br>
 Scroll down to imagine the distance </font> <br>

	<%for(int i=0; i<moon; i++) {%>
			<font color="#FBEA20" size=5>1 cm </font>  <br>
			
		<%	}%>


</body>
</html>