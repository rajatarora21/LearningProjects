package edu.aptech.servlet;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class RegistrationServlet extends HttpServlet
{	Connection con=null;
	PreparedStatement ps=null;
	int i=0;
	String query="INSERT INTO STUDENT VALUES(?,?,?)";
	public void init(ServletConfig cfg)
	{
		System.out.println("init(-) Method Calling!!");
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
			ps=con.prepareStatement(query);
			System.out.println(ps.getClass().getName());
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		catch(Exception e1)
		{
			
		}
	}//end of init(-)
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		System.out.println("doGet(-,-) Method Calling!!");
		res.setContentType("text/html");
		try
		{
			PrintWriter pw=res.getWriter();
			//Reading Form Data
			int sid=Integer.parseInt(req.getParameter("t1"));
			String name=req.getParameter("t2");
			String add=req.getParameter("t3");
			ps.setInt(1,sid);
			ps.setString(2,name);
			ps.setString(3,add);
			i=ps.executeUpdate();
			pw.println("<h1 align='center'>Welcome to HTML-Servlet-Database Communication</h1>");
			pw.println("<h4>SID :"+sid+"</h4>");
			pw.println("<h4>Name :"+name+"</h4>");
			pw.println("<h4>Address :"+add+"</h4>");
			if(i != 0)
			{
				pw.println("<h3>Records Are Successfully Inserted to Database!!</h3>");
			}	
		}
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
		}
	}//end of doGet(-,-)
	public void destroy()
	{
		System.out.println("destroy() Method Calling!!");
		try
		{
			if(ps!=null)
			{
				ps.close();
			}
		}
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
		}
		try
		{
			if(con!=null)
			{
				con.close();
			}
		}
		catch (SQLException ee)
		{
			ee.printStackTrace();
		}
	}
}
