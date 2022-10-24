<%@ page language="java" import="java.sql.*, java.io.*, java.util.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! String DB_URL,USERNAME,PASSWORD,userName,password,fetchedPass; %>

<%

	DB_URL = "jdbc:mysql://localhost:3307/jdbcdemo";
USERNAME = "root";
PASSWORD = "admin";
userName = request.getParameter("username");
password = request.getParameter("password");


try{
	Connection cn = null;
	Statement stmt = null;
	Class.forName("com.mysql.cj.jdbc.Driver");
	cn = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
	stmt= cn.createStatement();
	String query = "Select password from userdata where name = '" + userName + "'";
	
	ResultSet rs = stmt.executeQuery(query);
	
	rs.next();
	
	fetchedPass = rs.getString("password");
	
	if(password.equals(fetchedPass)){
		out.println("<h1>Welcome " + userName + "</h1>");
	}
	else{
		out.println("<h1>Wrong Username or Password</h1>");
	}
	
}
catch(Exception e){
	out.println(e);
}
%>
</body>
</html>
