package edu.aptech.servlet.attribute;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet4 extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException 
	{
		
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		//int num=Integer.parseInt(req.getParameter("t1"));
		String applicationScope = (String)req.getServletContext().getAttribute("name");
	    HttpSession session = req.getSession();
	    String sessionScope = (String)session.getAttribute("name");
	    String requestScope = (String)req.getAttribute("name");
	    res.setContentType("text/html");
	    PrintWriter out = res.getWriter();
	    out.println("<h2>Servlet attributes example4: applicationScope, sessionScope and requestScope</h2>");
	    out.println("<h3>applicationScope: " + applicationScope + "</h3>");
	    out.println("<h3>sessionScope: " + sessionScope + "</h3>");
	    out.println("<h3>requestScope: " + requestScope + "</h3>");
	}
}
