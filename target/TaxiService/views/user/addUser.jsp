<%--
  Created by IntelliJ IDEA.
  User: Марія
  Date: 13.02.2021
  Time: 12:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add User</title>
</head>
<body>
<style>
    body {
        background-image: url("/images/background.jpeg");
        background-repeat: no-repeat;
        background-size: cover;
    }

    h1 {
        text-align: center;
        color: rgba(220, 0, 0, 1);;
    }

    input[type=text], select {
        width: 100%;
        padding: 12px 20px;
        margin: 8px 0;
        display: inline-block;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
    }

    input[type=password], select {
        width: 100%;
        padding: 12px 20px;
        margin: 8px 0;
        display: inline-block;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
    }

    div {
        border-radius: 5px;
        background-color: #f2f2f2;
        padding: 20px;
    }

    .button {
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

    form {
        text-align: left;
    }

    .container-button{
        margin-top: 10px;
    }

</style>

<div>
    <%
        if (request.getAttribute("lastName") != null) {
            out.println("<p>User '" + request.getAttribute("lastName") + "' added!</p>");
        }
    %>


    <h1>Registration</h1>

    <div>
        <form action="/add-user" method="post">
            <label>First name: </label> <input type="text" name="firstName" placeholder="Your first name.."><br/>
            <label>Last name: </label><input type="text" name="lastName" placeholder="Your last name.."><br/>
            <label>Login: </label><input type="text" name="login" placeholder="Your login.."><br/>
            <label>Password: </label><input type="password" name="password" placeholder="Your password.."><br/>
            <label>Role: </label>
            <select name="role">
                <option value="CLIENT">CLIENT</option>
            </select>
            <button class="button" type="submit">Submit</button>
        </form>
    </div>
</div>

<div class="container-button">
    <input class="button" type=button onClick="location.href='../..'" value='Back to main page'>
</div>

</body>
</html>
