package edu.aptech.servlet.search;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		String query=req.getParameter("t1");
		String radio=req.getParameter("t2");
		if(radio.equalsIgnoreCase("google"))
		{
			res.sendRedirect("https://mail.google.com/search?query="+query);
		}
	}
}
