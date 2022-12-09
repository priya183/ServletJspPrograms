<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Student Data:
<br>
<% 
String url="jdbc:mysql://localhost:3306/navin";
String username="root";
String password="root";
Class.forName("com.mysql.jdbc.Driver");
String sql="select * from student where id=1";
Connection conn=DriverManager.getConnection(url,username,password);
Statement st=conn.createStatement();
ResultSet rs=st.executeQuery(sql);
rs.next();

%>

Id=<%=rs.getInt(1) %><br>
Name=<%=rs.getString(2) %><br>
Marks=<%=rs.getInt(3) %>

</body>
</html>