<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ali</title>
</head>
<body style="background: url('https://cdn.hipwallpaper.com/i/78/57/0Lb2nB.jpg');background-size: cover;background-position: center;">
<div align="center">
<h1>Details</h1><br>
<table>
<tr>
<td>Name:</td>
<td>${entity.name}</td>
</tr>

<tr>
<td>Address:</td>
<td>${entity.addrs}</td>
</tr>

<tr>
<td>DOB:</td>
<td>${entity.dob}</td>
</tr>

<tr>
<td>Phone No:</td>
<td>${entity.phnNo}</td>
</tr>
</table>
<a href="/"><button>Home</button></a>
</div>
</body>
</html>