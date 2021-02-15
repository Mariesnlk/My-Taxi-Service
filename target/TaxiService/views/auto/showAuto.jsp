<%--
  Created by IntelliJ IDEA.
  User: Марія
  Date: 14.02.2021
  Time: 19:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.mariia.syne.taxi_service.model.Auto" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Show Auto</title>
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
    <h1>Showing Auto</h1>
</div>
<br>
<div>
    <%
        Auto auto = (Auto) request.getAttribute("auto");
    %>
    <div>

        <table cellspacing="2" border="1" cellpadding="5" width="300">
            <tr>
                <td>Id:</td>
                <td>
                    <%
                        out.println(auto.getId());
                    %>
                </td>
            </tr>
            <tr>
                <td>Passengers Capacity:</td>
                <td>
                    <%
                        out.println(auto.getPassengersCapacity());
                    %>
                </td>
            </tr>
            <tr>
                <td>Category:</td>
                <td>
                    <%
                        out.println(auto.getCategory());
                    %>
                </td>
            </tr>
            <tr>
                <td>Status:</td>
                <td>
                    <%
                        out.println(auto.getStatus());
                    %>
                </td>
            </tr>
        </table>
    </div>
</div>
<br>

<input type=button onClick="location.href='/autos'" value='All Autos Table'>

</body>
</html>
