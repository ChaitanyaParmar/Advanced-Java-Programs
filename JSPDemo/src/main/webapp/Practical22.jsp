<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Practical 22</title>
</head>
<body style='padding-top: 250px; font-size: 20px;'>
	<%
	String name = request.getParameter("name");
	int sub1 = Integer.parseInt(request.getParameter("sub1"));
	int sub2 = Integer.parseInt(request.getParameter("sub2"));
	int sub3 = Integer.parseInt(request.getParameter("sub3"));
	int sub4 = Integer.parseInt(request.getParameter("sub4"));
	int sub5 = Integer.parseInt(request.getParameter("sub4"));
	
	float avg = (sub1 + sub2 + sub3 + sub4 + sub5 )/ 5;
	java.util.Date date = new java.util.Date();
	if(avg >= 90){
		out.println("<center >");
		out.println("Your Grade: AA");
		out.println("</br>Current Date and Time " + date);
		out.println("</center>");
	}else if (avg >= 80 && avg < 90){
		out.println("<center>");
		out.println("Your Grade: AB");
		out.println("</br>Current Date and Time " + date);
		out.println("</center>");
	}else if (avg >= 70 && avg < 80){
		out.println("<center>");
		out.println("Your Grade: BB");
		out.println("</br>Current Date and Time " + date);
		out.println("</center>");
	}else if (avg >= 50 && avg < 70){
		out.println("<center>");
		out.println("Your Grade: CC");
		out.println("</br>Current Date and Time " + date);
		out.println("</center>");
	}else if (avg >= 33 && avg < 50){
		out.println("<center>");
		out.println("Your Grade: DD");
		out.println("</br>Current Date and Time " + date);
		out.println("</center>");
	}else{
		out.println("<center>");
		out.println("Your Grade: FF");
		out.println("</br>Result showing on " + date);
		out.println("</center>");
	}
	%>
</body>
</html>
