package edu.aptech.servlet.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		String name=req.getParameter("t1");
		String fname=req.getParameter("t2");
		int age=Integer.parseInt(req.getParameter("t3"));
		String ms=req.getParameter("t4");
		pw.println("<h3>Name :"+name+"</h3>");
		pw.println("<h3>Father's Name :"+fname+"</h3>");
		pw.println("<h3>Age :"+age+"</h3>");
		pw.println("<h3>Marital Status :"+ms+"</h3>");
		if(ms.equalsIgnoreCase("single"))
		{
			pw.println("<h1 align='center'>Welcome to Dynamic Servlet2 Single Page</h1>");
			pw.println("<form action='url2' method='get' >");
			pw.println("<pre>When are you getting married");
			pw.println("<input type='text' name='t11'/>");
			pw.println("Why are you getting married");
			pw.println("<input type='text' name='t12'/>");
			pw.println("<input type='submit' value='Submit' />");
			pw.println("</pre></form>");
			
		}
		else
		{
			pw.println("<h1 align='center'>Welcome to Dynamic Servlet3 Married Page</h1>");
			pw.println("<form action='url3' method='get' >");
			pw.println("<pre>Why did you get married");
			pw.println("<input type='text' name='t11'/>");
			pw.println("Ab zindagi kaisi chal rahi");
			pw.println("<input type='text' name='t12'/>");
			pw.println("<input type='submit' value='Submit' />");
			pw.println("</pre></form>");
		}
		
	}
}
