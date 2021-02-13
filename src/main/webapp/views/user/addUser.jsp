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
<div>
    <%--<%
        if (request.getAttribute("lastName") != null) {
            out.println("<p>User '" + request.getAttribute("lastName") + "' added!</p>");
        }
    %>--%>
    <div>
        <div>
            <h2>Add user</h2>
        </div>

        <form action="/add-user" method="post">
            <label>firstName: </label> <input type="text" name="firstName"><br/>
            <label>lastName: </label><input type="text" name="lastName"><br/>

            <label>login: </label><input type="text" name="login"><br/>

            <label>password: </label><input type="text" name="password"><br/>

            <label>role: </label><input type="text" name="role"><br/>

            <button type="submit">Submit</button>
        </form>
    </div>
</div>

<div>
    <input type=button onClick="location.href='../..'" value='Back to main page'>
</div>

</body>
</html>
