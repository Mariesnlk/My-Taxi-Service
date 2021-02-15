<%--
  Created by IntelliJ IDEA.
  User: Марія
  Date: 13.02.2021
  Time: 23:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Order</title>
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
            <h2>Add order</h2>
        </div>

        <form action="/add-order" method="post">
            <label>Address From: </label> <input type="text" name="addressFrom"><br/>
            <label>Address To: </label><input type="text" name="addressTo"><br/>
            <label>Passengers Number: </label><input type="text" name="passengersNumber"><br/>
            <label>passengersID: </label><input type="text" name="passengersID"><br/>
            <label>autoID: </label><input type="text" name="autoID"><br/>
            <label>Price: </label><input type="text" name="price"><br/>
            <label>Discount: </label><input type="text" name="discount"><br/>
            <label>Time To Wait: </label><input type="text" name="timeToWait"><br/>
            <label>Data: </label><input type="text" name="data"><br/>
            <button type="submit">Submit</button>
        </form>
    </div>
</div>

<div>
    <input type=button onClick="location.href='../..'" value='Back to main page'>
</div>

</body>
</html>
