<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core_1_1" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>编辑员工</h3>
	<form action="/employee/saveOrUpdate" method="post">
		<input type="hidden" name="id" value="${employee.id}"/>
		用&nbsp;户&nbsp;&nbsp;名:<input type="text" name="username" value="${employee.username}"/><br>
		密&emsp;&emsp;码:<input type="text" name="password" value="${employee.password}"/><br>
		年&emsp;&emsp;龄:<input type="text" name="age" value="${employee.age}"/><br>
		入职时间:<input type="text" name="hiredate" value="${employee.hiredate}"/><br>
		<input type="submit" value="保存"/>
	</form>
	
</body>
</html>