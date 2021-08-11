<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html">
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="/main.css">
	<title>Time</title>
	
</head>
<body>
	<div class = "wrapper">
	<h2>You have visited</h2>
	<a href="http:localhost:8080/locomotion">Locomotion Site</a><span>${visitCounter}</span><h3>times!</h3>
	<a href="/locomotion">Test Another Visit?</a>
 	</div>	
</body>
</html>