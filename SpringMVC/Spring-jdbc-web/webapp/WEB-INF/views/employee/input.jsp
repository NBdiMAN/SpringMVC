<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach items="${errors}" var="error">
		<span style="color: red">${error.defaultMessage}</span><br>
	</c:forEach>
	<h3>编辑员工</h3>
	<form action="/employee/saveOrUpdate" method="post">
		<input type="hidden" name="id" value="${employee.id}"/>
		用&nbsp;户&nbsp;&nbsp;名:<input type="text" name="username" value="${employee.username}"/><br>
		密&emsp;&emsp;码:<input type="text" name="password" value="${employee.password}"/><br>
		年&emsp;&emsp;龄:<input type="text" name="age" value="${employee.age}"/><br>
		入职时间:<input type="text" name="hiredate" value="${employee.hiredate}"/><br>
		<input type="submit" value="保存"/>
	</form>
	
	<!-- 默认是post方式,会自动回显
			input中的path相当于name
	 -->
	<form:form action="/employee/saveOrUpdate" modelAttribute="employee">
		<form:hidden path="id"/>
		账号:<form:input path="username"/><form:errors path="username"/><br>
		密码:<form:password path="password" showPassword="true"/><form:errors path="password"/><br>
		年龄:<form:input path="age"/><form:errors path="age"/><br>
		入职:<form:input path="hiredate"/><br>
		<input type="submit" value="保存"/>
	</form:form>
</body>
</html>