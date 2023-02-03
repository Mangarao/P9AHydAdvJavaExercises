<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="m" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<m:catch var="x">
	<%
	
	int a = 10/0;
	%>
	</m:catch>
	THe exception details: <m:out value="${x}"></m:out>
	



	<%@ include file="header.html" %>
	<h1> this is index.jsp output....</h1>
	<!-- Html Comment here... -->

<%-- It is JSP comment.... --%>


	<jsp:include page="printDate.jsp"/>

<form action="process.jsp">
<input type="text" placeholder="enter number 1" name="num1"> <br/>
<input type="text" placeholder="enter number 2" name="num2"> <br/>
<input  type="submit" value="Division">

</form>


	<%@ include file="footer.html" %>
</body>
</html>