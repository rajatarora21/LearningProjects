<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		int i=(int)session.getAttribute("val");
		out.print(i);
	%>
		<h1>Result Generate By EvenJsp Page</h1>
	<%	
		out.println("Square Is : "+(i*i));
	%>
</body>
</html>