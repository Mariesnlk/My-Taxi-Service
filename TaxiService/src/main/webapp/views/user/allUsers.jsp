<%--
  Created by IntelliJ IDEA.
  User: Марія
  Date: 13.02.2021
  Time: 13:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.List" %>
<%@ page import="com.mariia.syne.taxi_service.model.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>All Users</title>
    <%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
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
    <h1>All Users Table</h1>
</div>
<br>
<div>
    <input type=button onClick="location.href='../..'" value='Back to main page'>

    <input type=button onClick="location.href='/add-user'" value='Add User'>
</div>
<br>
<br>
<div>
    <div>

        <%
            List<User> users = (List<User>) request.getAttribute("allUsers");
            if (users != null && !users.isEmpty()) {
        %>

        <table cellspacing="2" border="1" cellpadding="5" width="600">
            <thead>
            <tr>
                <th>Id</th>
                <th>FirstName</th>
                <th>LastName</th>
                <th>Login</th>
                <th>Password</th>
                <th>Role</th>
                <th>Update</th>
                <th>Delete</th>
            </tr>
            </thead>
            <tbody>

            <%
                for (User user : users) {
                    out.println("<tr>");
                    out.println("<td><a href=\"/user?id=" + user.getId() + "\">"
                            + user.getId() + "</a></td>");
                    out.println("<td>" + user.getFirstName() + "</td>");
                    out.println("<td>" + user.getLastName() + "</td>");
                    out.println("<td>" + user.getLogin() + "</td>");
                    out.println("<td>" + user.getPassword() + "</td>");
                    out.println("<td>" + user.getRole() + "</td>");

                    out.println("<td><a href=\"/update-user?id=" + user.getId()
                            + "\">Update</a></td>");
                    out.println("<td><a href=\"/delete-user?id=" + user.getId()
                            + "\">Delete</a></td>");
                    out.println("</tr>");
                }
            %>

            </tbody>
        </table>

        <%
            } else {
                out.println("<p>There are no users yet!</p>");
            }
        %>

    </div>
</div>

<br>

<div>
    <input type=button onClick="location.href='../..'" value='Back to main page'>

    <input type=button onClick="location.href='/add-user'" value='Add User'>
</div>

</body>
</html>
