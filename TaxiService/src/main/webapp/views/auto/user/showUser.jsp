<%--
  Created by IntelliJ IDEA.
  User: Марія
  Date: 14.02.2021
  Time: 11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.mariia.syne.taxi_service.model.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Show user</title>
    <%--<style>
        body {
            background-image: url("images/airplane.jpg");
        }

        .no-background {
            background-image: url("images/blank.jpg");
        }
    </style>--%>
</head>
<body>

<div>
    <h1>Showing User</h1>
</div>
<br>
<div>
    <%
        User user = (User) request.getAttribute("user");
    %>
    <div>

        <table cellspacing="2" border="1" cellpadding="5" width="300">
            <tr>
                <td>Id:</td>
                <td>
                    <%
                        out.println(user.getId());
                    %>
                </td>
            </tr>
            <tr>
                <td>FirstName:</td>
                <td>
                    <%
                        out.println(user.getFirstName());
                    %>
                </td>
            </tr>
            <tr>
                <td>LastName:</td>
                <td>
                    <%
                        out.println(user.getLastName());
                    %>
                </td>
            </tr>
            <tr>
                <td>Login:</td>
                <td>
                    <%
                        out.println(user.getLogin());
                    %>
                </td>
            </tr>
            <tr>
                <td>Password:</td>
                <td>
                    <%
                        out.println(user.getPassword());
                    %>
                </td>
            </tr>
            <tr>
                <td>Role:</td>
                <td>
                    <%
                        out.println(user.getRole());
                    %>
                </td>
            </tr>
        </table>
    </div>
</div>
<br>

<input type=button onClick="location.href='/users'" value='All Users Table'>

</body>
</html>
