<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
       
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${student}
Name=${student.name}<br>
Id=${student.id}
<br><br>
<h1>List of Students</h1><br>
${students}

<h1>List of Students one by one</h1><br>
<c:forEach items="${students}" var="s">
${s}<br>
</c:forEach>
</body>
</html>