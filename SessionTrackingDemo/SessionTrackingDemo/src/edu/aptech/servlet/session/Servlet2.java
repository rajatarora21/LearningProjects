package edu.aptech.servlet.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet
{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		String val1=req.getParameter("t11");
		String val2=req.getParameter("t12");
		String name=req.getParameter("t1");
		String fname=req.getParameter("t2");
		String age=req.getParameter("t3");
		String ms=req.getParameter("t4");
		pw.println("<h3>Name :"+name+"</h3>");
		pw.println("<h3>Father's Name :"+fname+"</h3>");
		pw.println("<h3>Age :"+age+"</h3>");
		pw.println("<h3>Marital Status :"+ms+"</h3>");
		pw.println("<h3>When ="+val1+"</h3>");
		pw.println("<h3>Why  ="+val2+"</h3>");
	}

}
