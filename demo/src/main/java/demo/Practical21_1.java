package demo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.*;

@WebServlet("/Practical21_1")


public class Practical21_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	HttpSession session=request.getSession();
	Cookie[] cookie = request.getCookies();
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	out.println("<body>");
	if(cookie!=null) {
		out.println("<center><h2>Welcome to the Next Page : <p style='color:red'>"+cookie[0].getValue()
				+"</p><br> Your Pass: <p style='color:red'>"+cookie[1].getValue()
				+"</p></h2><br><h3>Your ID is :"+session.getAttribute("uid")+"</h3></center>");
	}
	else {
		out.println("<h2>Cookie Not Found</h2>");
	}
	out.println("</body>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		 doGet(request, response);
	}
	}

