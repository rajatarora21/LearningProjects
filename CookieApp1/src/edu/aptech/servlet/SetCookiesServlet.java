package edu.aptech.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SetCookiesServlet extends HttpServlet
{
	public void doGet(HttpServletResponse res, HttpServletRequest req) throws IOException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		//In-Memory Cookies
		Cookie ck=new Cookie("Capital","Delhi");
		Cookie ck1=new Cookie("ap","Telangana");
		Cookie ck2=new Cookie("bihar","patna");
		res.addCookie(ck);
		res.addCookie(ck1);
		res.addCookie(ck2);
		//Persistent Cookies
		Cookie ck11=new Cookie("Capital1","Delhi1");
		Cookie ck12=new Cookie("ap1","Telangana1");
		Cookie ck13=new Cookie("bihar1","patna1");
		res.addCookie(ck11);
		res.addCookie(ck12);
		res.addCookie(ck13);
	}
}
