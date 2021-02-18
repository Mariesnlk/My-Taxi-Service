<%--
  Created by IntelliJ IDEA.
  User: Марія
  Date: 13.02.2021
  Time: 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.mariia.syne.taxi_service.model.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Main Page</title>
</head>
<body>

<h1>Welcome to Taxi Service</h1>
<style>
    body {
        background-image: url("images/background.jpeg");
        background-repeat: no-repeat;
        background-size: cover;
    }

    h1 {
        text-align: center;
        color: rgba(220, 0, 0, 1);;
    }

    div{
        margin-top: 5px;
        margin-bottom: 5px;
    }

    input.button {
        border: 0;
        line-height: 2.5;
        padding: 0 20px;
        font-size: 1rem;
        text-align: center;
        color: #fff;
        text-shadow: 1px 1px 1px #000;
        border-radius: 10px;
        background-color: rgba(220, 0, 0, 1);
        background-image: linear-gradient(to top left,
        rgba(0, 0, 0, .2),
        rgba(0, 0, 0, .2) 30%,
        rgba(0, 0, 0, 0));
        box-shadow: inset 2px 2px 3px rgba(255, 255, 255, .6),
        inset -2px -2px 3px rgba(0, 0, 0, .6);
    }

</style>

<%
    User registeredUser = (User) session.getAttribute("registeredUser");
    if (registeredUser != null) {
        if (registeredUser.getRole().equals("ADMIN")) {
%>


<div>
    <input class="button" type=button onClick="location.href='/add-user'" value='Registration'>
</div>

<div>
    <input class="button" type=button onClick="location.href='/login'" value='Login'>
</div>

<div>
    <input class="button" type=button onClick="location.href='/users'" value='Users'>
</div>

<div>
    <input class="button" type=button onClick="location.href='/autos'" value='Autos'>
</div>

<div>
    <input class="button" type=button onClick="location.href='/add-auto'" value='Add Auto'>
</div>

<div>
    <input class="button" type=button onClick="location.href='/orders'" value='Orders'>
</div>

<div>
    <input class="button" type=button onClick="location.href='/add-order'" value='Add Order'>
</div>

<%
} else if (registeredUser.getRole().equals("CLIENT")) {
%>

<div>
    <input class="button" type=button onClick="location.href='/login'" value='Login'>
</div>

<div>
    <input class="button" type=button onClick="location.href='/add-order'" value='Add Order'>
</div>


<%
    }
} else {
    //out.println("Please register!" + registeredUser);

%>
<div>
    <input class="button" type=button onClick="location.href='/add-user'" value='Registration'>
</div>

<div>
    <input class="button" type=button onClick="location.href='/login'" value='Login'>
</div>
<%
    }
%>

</body>
</html>
