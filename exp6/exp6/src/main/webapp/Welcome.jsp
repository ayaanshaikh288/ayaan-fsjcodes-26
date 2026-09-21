<%@ page language="java" %>
<%@ page import="java.util.Date" %>
<html>
<head>
<title>WELCOME Page</title>
</head>
<body>
    <h1>WELCOME TO RCOE</h1>
    <h2>Good Morning , <% out.print(request.getParameter("name")); %></h2>
    <p>Email ID : <i> <% out.print(request.getParameter("email")); %></i></p>
    <h2> Current Date And Time : <b><% out.print(new Date()); %></b></h2>
</body>
</html>