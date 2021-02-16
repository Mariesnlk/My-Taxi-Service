<%--
  Created by IntelliJ IDEA.
  User: Марія
  Date: 13.02.2021
  Time: 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.mariia.syne.taxi_service.model.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main Page</title>
</head>
<body>

<h1>Welcome to Taxi Service</h1>


<%
    User registeredUser = (User) session.getAttribute("registeredUser");
    if (registeredUser != null) {
        if (registeredUser.getRole().equals("ADMIN")) {
%>


<p>
    <input type=button onClick="location.href='/add-user'" value='Registration'>
</p>

<p>
    <input type=button onClick="location.href='/login'" value='Login'>
</p>

<p>
    <input type=button onClick="location.href='/users'" value='Users'>
</p>

<p>
    <input type=button onClick="location.href='/autos'" value='Autos'>
</p>

<p>
    <input type=button onClick="location.href='/add-auto'" value='Add Auto'>
</p>

<p>
    <input type=button onClick="location.href='/orders'" value='Orders'>
</p>

<p>
    <input type=button onClick="location.href='/add-order'" value='Add Order'>
</p>

<%
} else if (registeredUser.getRole().equals("CLIENT")) {
%>

<p>
    <input type=button onClick="location.href='/login'" value='Login'>
</p>

<p>
    <input type=button onClick="location.href='/add-order'" value='Add Order'>
</p>


<%
    }
} else {
    out.println("Please register!" + registeredUser);

%>
<p>
    <input type=button onClick="location.href='/add-user'" value='Registration'>
</p>

<p>
    <input type=button onClick="location.href='/login'" value='Login'>
</p>
<%
    }
%>

</body>
</html>
