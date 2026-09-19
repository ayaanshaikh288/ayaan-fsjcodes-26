<%@ page language="java" %>
<html>
    <title>Welcome </title>
<body>
    <%
    String name = (String) session.getAttribute("name");
%>

<h1>Welcome, <%= name %>!</h1>

<p>Login successful.</p>
</body>
</html>
