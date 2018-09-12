package kr.teamfive.servlet.basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/basic/test02")
public class Test02 extends HttpServlet {
	public void service(
			HttpServletRequest request, HttpServletResponse response) 
			throws IOException, ServletException{
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<h1>Servlet Response Success2222222 :)</h1>");
		out.close();
	}
	
} // end class
