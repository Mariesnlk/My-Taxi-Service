<%--
  Created by IntelliJ IDEA.
  User: Марія
  Date: 17.02.2021
  Time: 21:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.List" %>
<%@ page import="com.mariia.syne.taxi_service.model.Order" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Sorted Orders</title>
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
    <h1>Sorted Orders By Price Decrease</h1>
</div>
<br>
<div>
    <input type=button onClick="location.href='../..'" value='Back to main page'>

    <input type=button onClick="location.href='/add-order'" value='Add Order'>
</div>
<br>
<div>
    <input type=button onClick="location.href='/sort-date-increase'" value='Sorting by date increase'>

    <input type=button onClick="location.href='/sort-date-decrease'" value='Sorting by date decrease'>
</div>
<br>
<div>
    <input type=button onClick="location.href='/sort-price-increase'" value='Sorting by price increase'>

    <input type=button onClick="location.href='/sort-price-decrease'" value='Sorting by price decrease'>
</div>
<br>
<br>

<div>
    <div>

        <%
            List<Order> orders = (List<Order>) request.getAttribute("allSortedByPriceDecreaseOrders");
            if (orders != null && !orders.isEmpty()) {
        %>

        <table cellspacing="2" border="1" cellpadding="5" width="600">
            <thead>
            <tr>
                <th>Id</th>
                <th>address From</th>
                <th>address To</th>
                <th>passengers Number</th>
                <th>passengers Id</th>
                <th>auto Id</th>
                <th>price</th>
                <th>discount</th>
                <th>time To Wait</th>
                <th>data</th>
                <th>Update</th>
                <th>Delete</th>
            </tr>
            </thead>
            <tbody>

            <%
                for (Order order : orders) {
                    out.println("<tr>");
                    out.println("<td><a href=\"/order?id=" + order.getId() + "\">"
                            + order.getId() + "</a></td>");
                    out.println("<td>" + order.getAddressFrom() + "</td>");
                    out.println("<td>" + order.getAddressTo() + "</td>");
                    out.println("<td>" + order.getPassengersNumber() + "</td>");
                    out.println("<td>" + order.getPassengerId() + "</td>");
                    out.println("<td>" + order.getAutoId() + "</td>");
                    out.println("<td>" + order.getPrice() + "</td>");
                    out.println("<td>" + order.getDiscount() + "</td>");
                    out.println("<td>" + order.getTimeToWait() + "</td>");
                    out.println("<td>" + order.getDate() + "</td>");

                    out.println("<td><a href=\"/update-order?id=" + order.getId()
                            + "\">Update</a></td>");
                    out.println("<td><a href=\"/delete-order?id=" + order.getId()
                            + "\">Delete</a></td>");
                    out.println("</tr>");
                }
            %>

            </tbody>
        </table>

        <%
            } else {
                out.println("<p>There are no orders yet!</p>");
            }
        %>

    </div>
</div>

<br>
<br>
<div>
    <input type=button onClick="location.href='/sort-price-increase'" value='Sorting by price increase'>

    <input type=button onClick="location.href='/sort-price-decrease'" value='Sorting by price decrease'>
</div>
<br>
<div>
    <input type=button onClick="location.href='/sort-date-increase'" value='Sorting by date increase'>

    <input type=button onClick="location.href='/sort-date-decrease'" value='Sorting by date decrease'>
</div>
<br>
<div>
    <input type=button onClick="location.href='../..'" value='Back to main page'>

    <input type=button onClick="location.href='/add-order'" value='Add Order'>
</div>

</body>
</html>
