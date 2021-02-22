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
    #table {
        font-family: Arial, Helvetica, sans-serif;
        border-collapse: collapse;
        width: 100%;
    }

    #table td, #table th {
        border: 1px solid #000000;
        padding: 8px;
        background-color: #ddd;
    }

    #table th {
        padding-top: 12px;
        padding-bottom: 12px;
        text-align: left;
        background-color: rgba(220, 0, 0, 1);
        background-image: linear-gradient(to top left,
        rgba(0, 0, 0, .2),
        rgba(0, 0, 0, .2) 30%,
        rgba(0, 0, 0, 0));
        color: white;
    }

</style>

<div>
    <h1>All Users Table</h1>
</div>
<br>
<div>
    <input class="button"  type=button onClick="location.href='../..'" value='Back to main page'>

    <input class="button"  type=button onClick="location.href='/add-user'" value='Add User'>
</div>
<br>
<br>
<div>
    <div>

        <%
            List<User> users = (List<User>) request.getAttribute("allUsers");
            if (users != null && !users.isEmpty()) {
        %>

        <table cellspacing="2" border="1" cellpadding="5" width="600"  id="table">
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
    <input class="button"  type=button onClick="location.href='../..'" value='Back to main page'>

    <input class="button"  type=button onClick="location.href='/add-user'" value='Add User'>
</div>

</body>
</html>
