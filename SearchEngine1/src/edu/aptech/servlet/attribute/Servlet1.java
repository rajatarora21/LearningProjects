package edu.aptech.servlet.attribute;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet1 extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		int num=Integer.parseInt(req.getParameter("t1"));
		req.setAttribute("name","RequestScope");
		req.getServletContext().setAttribute("name", "application scoped attribute");
		HttpSession session = req.getSession();
        session.setAttribute("name", "session scoped attribute");
		RequestDispatcher rd=req.getRequestDispatcher("url2");
		rd.include(req,res);
	}
}
