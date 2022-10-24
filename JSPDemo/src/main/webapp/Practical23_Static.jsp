<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%! String username,password; %>
	<%
		username = request.getParameter("username");
		password = request.getParameter("password");
		if(username.equals("Chaitanya") && password.equals("Abcd1234")){
			out.println("<h1 style='text-align: center;'>Welcome " + username + "</h1>");
		}
		
		else{
			out.println("<h1 style='text-align: center;'>Wrong Username or Password</h1>");
		}
	%>
</body>	
</html>
