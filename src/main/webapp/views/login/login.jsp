<%--
  Created by IntelliJ IDEA.
  User: Марія
  Date: 13.02.2021
  Time: 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>

<form action="/login" method="POST">
    <p>
        <input type="text" name="userLogin" placeholder="login"/>
    </p>
    <p>
        <input type="password" name="userPassword" placeholder="password"/>
    </p>
    <p>
        <input type="submit" value="Send"/>
    </p>
</form>

<input type=button onClick="location.href='../..'" value='Back to main page'>

</body>
</html>
