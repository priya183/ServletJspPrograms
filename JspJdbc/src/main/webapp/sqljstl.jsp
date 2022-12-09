<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" 
url="jdbc:mysql://localhost:3306/navin" user="root" password="root">
</sql:setDataSource>

<sql:query var="rs" dataSource="${db}">select * from student</sql:query>

<c:forEach items="${rs.row}" var="row">
<c:out value="${student.id}"></c:out>
<c:out value="${student.name}"></c:out>
</c:forEach>

</body>
</html>