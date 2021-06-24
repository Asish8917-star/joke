<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.error{
	color: #00fcb5;
}
</style>
<meta charset="ISO-8859-1">
<title>Index Page</title>
</head>
<body style="background: url('https://wallpaperaccess.com/full/172079.jpg');background-size: cover;background-position: center">
<div align="center">
<h1 style="color: #18aab8">Just for Fun</h1>
<table>
<form:form action="save" method="post" modelAttribute="entity">
<tr style="color: #fc0341">
	<td><b>Name:</b></td>
	<td><form:input path="name"/>
	<form:errors path="name" cssClass="error"/></td>
</tr>

<tr style="color: #fc0341">
	<td><b>Address:</b></td>
	<td><form:input path="addrs"/>
	<form:errors path="addrs" cssClass="error"/></td>
</tr>

<tr style="color: #fc0341">
	<td><b>DOB:</b></td>
	<td><form:input path="dob" type="date"/>
	<form:errors path="dob" cssClass="error"/></td>
</tr>

<tr style="color: #fc0341">
	<td><b>Phone No:</b></td>
	<td><form:input path="phnNo"/>
	<form:errors path="phnNo" cssClass="error"/></td>
</tr>

<tr>
	<th colspan="1">
	<td><input type="submit" value="Register"></td>
</tr>
</form:form>
</table>
</div>
</body>
</html>