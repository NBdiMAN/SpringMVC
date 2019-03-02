<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>用户登录</h3>
	<span style="color: red;">${errorMsg}</span>
	<%
		session.invalidate();
	%>
	<form action="/login" method="post">
		用&nbsp;户&nbsp;&nbsp;名:<input type="text" name="username"/><br>
		密&emsp;&emsp;码:<input type="password" name="password"/><br>
		<input type="submit" value="登录"/>
	</form>
	
</body>
</html>