<%@page import="com.kharoud.web.model.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
hello
<%
   Alien a1 = (Alien)session.getAttribute("a");
 out.print(a1);
%>
</body>
</html>