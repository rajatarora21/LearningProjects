<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="url1">
		Enter Number : <input type="text" name="t1" />
		<input type="submit" value="Submit" name="s1"/>
		
	</form>
	<%
		if(request.getParameter("s1")!=null)
		{
			int i=Integer.parseInt(request.getParameter("t1"));
			if(i%2 == 0)
			{
				response.sendRedirect("eurl");
				session.setAttribute("val", i);
			}
			else
			{
				response.sendRedirect("ourl");
				session.setAttribute("val", i);
			}
		}
	%>
</body>
</html>