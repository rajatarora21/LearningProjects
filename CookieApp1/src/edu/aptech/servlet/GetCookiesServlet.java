package edu.aptech.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetCookiesServlet extends HttpServlet
{
	public void doGet(HttpServletResponse res,HttpServletRequest req) throws IOException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		Cookie[] c=req.getCookies();
		for (Cookie e :c)
		{
			pw.println("<h3>Name---->"+e.getName()+"Value---->"+e.getValue()+"</h3>");
		}
		
	}
}
