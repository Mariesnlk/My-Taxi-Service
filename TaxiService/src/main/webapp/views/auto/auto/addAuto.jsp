<%--
  Created by IntelliJ IDEA.
  User: Марія
  Date: 13.02.2021
  Time: 21:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Auto</title>
</head>
<body>
<div>
    <%
        if (request.getAttribute("category") != null) {
            out.println("<p>Auto with category '" + request.getAttribute("category") + "' added!</p>");
        }
    %>
    <div>
        <div>
            <h2>Add auto</h2>
        </div>

        <form action="/add-auto" method="post">
            <label>Passengers Capacity: </label> <input type="text" name="passengersCapacity"><br/>
            <label>Category: </label><input type="text" name="category"><br/>
            <label>Status: </label><input type="text" name="status"><br/>
            <button type="submit">Submit</button>
        </form>
    </div>
</div>

<div>
    <input type=button onClick="location.href='../..'" value='Back to main page'>
</div>

</body>
</html>
