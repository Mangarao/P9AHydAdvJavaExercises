<%@page import="com.deloitte.webapp.servlet.User"%>
<%@ page errorPage="myerror.jsp" language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%-- <jsp:useBean id="u" class="com.deloitte.webapp.servlet.User" scope="page">
	</jsp:useBean>
	<jsp:setProperty property="*" name="u" />

	<h3>User Details...</h3>
	ID:
	<jsp:getProperty property="id" name="u" />
	<br /> Name:
	<jsp:getProperty property="name" name="u" />
	<br /> Email:
	<jsp:getProperty property="email" name="u" />
	<br />
 --%>
 
 	<h2> User Details...</h2>
 	Id: ${param.id}
 	Name: ${param.name }
	Email: ${param.email} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
 
</body>
</html>