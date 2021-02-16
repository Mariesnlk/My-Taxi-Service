<%@ page import="com.mariia.syne.taxi_service.model.User" %><%--
  Created by IntelliJ IDEA.
  User: Марія
  Date: 13.02.2021
  Time: 12:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Result </title>
</head>
<body>

<div>

    <%
        User registeredUser = (User) session.getAttribute("registeredUser");

        if (registeredUser != null ) {
            out.println("<p>Success!</p>");
            out.println(registeredUser);
            out.println("userRole="+registeredUser.getRole());
    %>
    <input type=button onClick="location.href='/logout'" value='Logout'>
    <input type=button onClick="location.href='../..'" value='Back to main page'>
    <%
    }

    else {
        out.println("<p>Error!</p>");

    %>
    <input type=button onClick="location.href='/login'" value='Login'>
    <input type=button onClick="location.href='../..'" value='Back to main page'>
    <%
        }
    %>
</div>

</body>
</html>