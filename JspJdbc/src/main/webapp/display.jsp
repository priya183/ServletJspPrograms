<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String name=request.getAttribute("label").toString();
out.println(name);
%>

<br>
<br>
<!-- JSTL  - using one line code we can fetch the value -->
${label}

</body>
</html>