<%--
  Created by IntelliJ IDEA.
  User: Марія
  Date: 14.02.2021
  Time: 11:59
  To change this template use File | Settings | File Templates.
--%>
Денис Харьков, [14.02.21 12:04]
<%@ page import="com.mariia.syne.taxi_service.model.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update user</title>
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
    <h1>Updating User</h1>
</div>

<div>
    <%
        User userToUpdate = (User) request.getAttribute("userToUpdate");
    %>
    <div>

        <form method="post">
            <table>
                <tr>
                    <td>
                        <%
                            out.println("<input type=\"text\" name=\"id\" value=\"" + userToUpdate.getId() + "\" hidden>");
                        %>
                    </td>
                    <td>FirstName:</td>
                    <td>
                        <%
                            out.println("<input type=\"text\" name=\"firstName\" value=\"" + userToUpdate.getFirstName() + "\">");
                        %>
                    </td>
                </tr>
                <tr>
                    <td>LastName:</td>
                    <td>
                        <%
                            out.println("<input type=\"text\" name=\"lastName\" value=\"" + userToUpdate.getLastName() + "\">");
                        %>
                    </td>
                </tr>
                <tr>
                    <td>Login:</td>
                    <td>
                        <%
                            out.println("<input type=\"text\" name=\"login\" value=\"" + userToUpdate.getLogin() + "\">");
                        %>
                    </td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td>
                        <%
                            out.println("<input type=\"text\" name=\"password\" value=\"" + userToUpdate.getPassword() + "\">");
                        %>
                    </td>
                </tr>
                <tr>
                    <td>Role:</td>
                    <td>
                        <%
                            out.println("<input type=\"text\" name=\"role\" value=\"" + userToUpdate.getRole() + "\">");
                        %>
                    </td>
                </tr>
                <tr>
                    <td align="right" colspan="2"><input type="submit" value="Submit"></td>
                </tr>
            </table>
        </form>
    </div>
</div>

<input type=button onClick="location.href='/users'" value='All Users Table'>

</body>
</html>
