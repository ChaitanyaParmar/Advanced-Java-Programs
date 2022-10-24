package demo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Practical21")

public class Practical21 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
 
	Cookie UserName = new Cookie("Uname",request.getParameter("uname"));
	Cookie Pass = new Cookie("Pass",request.getParameter("pass"));
	
	UserName.setMaxAge(10); 
	Pass.setMaxAge(10);
 
	response.addCookie(UserName);
	response.addCookie(Pass);
	
	HttpSession session=request.getSession();
	
	session.setAttribute("uid",1);
	response.setContentType("text/html");
	
	PrintWriter out = response.getWriter();
	out.println("<html><body> <center><h2>Hello User : <p style='color:red'> "+request.getParameter("uname")
	+"</p></h2><form action='Practical21_1'><input type='submit' "
	+ "value='Next'></form></center> </body></html>");
 }
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			 doGet(request, response);
		} 	
	}

