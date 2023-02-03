<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="i" step="2" begin="5" end="10">
	<c:out value="${i}"></c:out> <br>

</c:forEach>

	<c:set var="num" value="${100}">
			</c:set>
	<c:if test="${num<500}">
	<c:out value="${num}" />
	</c:if>



<%-- <c:import  var="data" url="http://www.google.com"></c:import>
<h1> Google source code is:</h1>
<c:out value="${data}"></c:out> --%>
</body>
</html>