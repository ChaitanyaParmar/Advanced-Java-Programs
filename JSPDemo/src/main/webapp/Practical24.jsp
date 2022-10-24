<%@ page language="java" import="java.sql.*, java.io.*, java.util.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%! String name,password; %>
	<%
	Connection cn;
	PreparedStatement pstmt;
	
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbcdemo","root","admin");
		name = request.getParameter("name");
		password = request.getParameter("password");
		String query = "insert into student values(?,?)";
		pstmt = cn.prepareStatement(query);
		pstmt.setString(1,id);
		pstmt.setString(2,name);
		pstmt.setString(3,password);
		
		pstmt.execute();
		out.println("<h1>You have been registered successfully</h1>");

	}
	catch(Exception e){
		out.println(e);
	}
	%>
</body>
</html>
