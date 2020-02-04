package edu.aptech.servlet.attribute;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet2 extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		int num=Integer.parseInt(req.getParameter("t1"));
		String applicationScope = (String)req.getServletContext().getAttribute("name");

        // get session scoped attribute
        HttpSession session = req.getSession();
        String sessionScope = (String)session.getAttribute("name");

        // get request scoped attribute
        String requestScope = (String)req.getAttribute("name");

        // print response
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        out.println("<h2>Servlet attributes example2: applicationScope, sessionScope and requestScope</h2>");
        out.println("<h3>applicationScope: " + applicationScope + "</h3>");
        out.println("<h3>sessionScope: " + sessionScope + "</h3>");
        out.println("<h3>requestScope: " + requestScope + "</h3>");
        RequestDispatcher rd=req.getRequestDispatcher("url3");
		rd.include(req,res);
	}
}
