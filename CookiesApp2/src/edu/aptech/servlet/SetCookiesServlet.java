package edu.aptech.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SetCookiesServlet extends HttpServlet 
{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		String name=req.getParameter("t1");
		String fname=req.getParameter("t2");
		pw.println("<form action='url2' method='get'>");
		pw.println("<pre>Income");
		pw.println("<input type='number' name='t11'/>");
		pw.println("Return Amount");
		pw.println("<input type='number' name='t12'/>");
		pw.println("<input type='submit' value='Submit' />");
		pw.println("</pre></form>");
		//In-Memory Cookies
		String sal=req.getParameter("t11");
		String sreturn=req.getParameter("t12");
		Cookie ck=new Cookie("name",name);
		Cookie ck1=new Cookie("fname",fname);
		Cookie ck2=new Cookie("income",sal);
		Cookie ck3=new Cookie("Return",sreturn);
		res.addCookie(ck);
		res.addCookie(ck1);
		res.addCookie(ck2);
		res.addCookie(ck3);
	}
}
