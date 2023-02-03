<%@page import="java.util.Date"%>
<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<%@ include file="header.html" %>

		Welcome, <%=request.getParameter("uname") %> <br>
		
		<%
			session.setAttribute("uname", request.getParameter("uname"));
		%>
		<a href="second.jsp">Second JSP</a>
<%-- 	<%
		//response.sendRedirect("http://www.google.com/search?q="+request.getParameter("uname"));
	%>

	Today Date  is: <% out.println(new Date().getDate()); %>
	Welcome,
	<%=request.getParameter("uname")%>

	<br />
	<%!int a = 10, b = 20, c;
		int cube(int num){
			
			return num*num*num;
		}
	%>
	<%
	c = a + b;
	%>
	Sum of a, b= <%=c%> <br/>
	Cube of the 3 is: <%=cube(3) %> --%>
	
	
	<%@ include file="footer.html" %>
</body>
</html>