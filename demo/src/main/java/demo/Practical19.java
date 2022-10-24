package demo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
@WebServlet("/Practical19")
public class Practical19 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int count;
	public void init() {
		count=0;
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Date date = new Date();
		response.setContentType("text/html");
		count++;
		PrintWriter out = response.getWriter();
		out.println("<html><title>"+"Access Counter"+"</title><body><center><h1 style='padding-top: 300px;'> You have reloaded this page <span style='color: blue;'>"+count+"</span> times.</h1></center><center><h2>Date and Time : "+ date.toString()+"</h2></center></body></html>");
	}
} 