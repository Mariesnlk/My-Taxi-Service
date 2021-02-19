<%--
  Created by IntelliJ IDEA.
  User: Марія
  Date: 15.02.2021
  Time: 12:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.mariia.syne.taxi_service.model.Order" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Show Order</title>
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
    <h1>Showing Order</h1>
</div>
<br>
<div>
    <%
        Order order = (Order) request.getAttribute("order");
    %>
    <div>
        <table cellspacing="2" border="1" cellpadding="5" width="300">
            <tr>
                <td>Id:</td>
                <td>
                    <%
                        out.println(order.getId());
                    %>
                </td>
            </tr>

            <tr>
                <td>Address From:</td>
                <td>
                    <%
                        out.println(order.getAddressFrom());
                    %>
                </td>
            </tr>

            <tr>
                <td>Address To:</td>
                <td>
                    <%
                        out.println(order.getAddressTo());
                    %>
                </td>
            </tr>

            <tr>
                <td>Passengers Number:</td>
                <td>
                    <%
                        out.println(order.getPassengersNumber());
                    %>
                </td>
            </tr>

            <tr>
                <td>Passengers Id:</td>
                <td>
                    <%
                        out.println(order.getPassengerId());
                    %>
                </td>
            </tr>

            <tr>
                <td>Auto Id:</td>
                <td>
                    <%
                        out.println(order.getAutoId());
                    %>
                </td>
            </tr>

            <tr>
                <td>Price:</td>
                <td>
                    <%
                        out.println(order.getPrice());
                    %>
                </td>
            </tr>

            <tr>
                <td>Discount:</td>
                <td>
                    <%
                        out.println(order.getDiscount());
                    %>
                </td>
            </tr>

            <tr>
                <td>Time to wait:</td>
                <td>
                    <%
                        out.println(order.getTimeToWait());
                    %>
                </td>
            </tr>

            <tr>
                <td>Date:</td>
                <td>
                    <%
                        out.println(order.getDate());
                    %>
                </td>
            </tr>
        </table>
    </div>
</div>
<br>

<input type=button onClick="location.href='/orders'" value='All Orders Table'>

</body>
</html>

