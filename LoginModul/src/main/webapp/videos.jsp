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

response.setHeader("Cache-Control", "no-cache, no-store,must-revalidate");

if(session.getAttribute("username")==null)
{
	response.sendRedirect("login.jsp");
}
%>
<iframe width="560" height="315"
 src="https://www.youtube.com/watch?v=CwvlS3ViGFQ&list=PLVz2XdJiJQxzrdrpglCv_nWIO5CDIqOVj&index=6"
 frameborder="0" allowfullscreen>
 
 </iframe>
</body>
</html>