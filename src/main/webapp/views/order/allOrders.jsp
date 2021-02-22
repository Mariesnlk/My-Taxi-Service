<%--
  Created by IntelliJ IDEA.
  User: Марія
  Date: 13.02.2021
  Time: 23:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.List" %>
<%@ page import="com.mariia.syne.taxi_service.model.Order" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>All Orders</title>
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
    <h1>All Orders Table</h1>
</div>
<br>
<div>
    <input class="button" type=button onClick="location.href='../..'" value='Back to main page'>

    <input class="button" type=button onClick="location.href='/add-order'" value='Add Order'>
</div>
<br>
<div>
    <input class="button" type=button onClick="location.href='/sort-date-increase'" value='Sorting by date increase'>

    <input class="button" type=button onClick="location.href='/sort-date-decrease'" value='Sorting by date decrease'>
</div>
<br>
<div>
    <input class="button" type=button onClick="location.href='/sort-price-increase'" value='Sorting by price increase'>

    <input class="button" type=button onClick="location.href='/sort-price-decrease'" value='Sorting by price decrease'>
</div>
<br>
<br>

<div>
    <div>

        <%
            List<Order> orders = (List<Order>) request.getAttribute("allOrders");
            if (orders != null && !orders.isEmpty()) {
        %>

        <table cellspacing="2" border="1" cellpadding="5" width="600" id="table">
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
    <input class="button" type=button onClick="location.href='/sort-price-increase'" value='Sorting by price increase'>

    <input class="button" type=button onClick="location.href='/sort-price-decrease'" value='Sorting by price decrease'>
</div>
<br>
<div>
    <input class="button" type=button onClick="location.href='/sort-date-increase'" value='Sorting by date increase'>

    <input class="button" type=button onClick="location.href='/sort-date-decrease'" value='Sorting by date decrease'>
</div>
<br>
<div>
    <input class="button" type=button onClick="location.href='../..'" value='Back to main page'>

    <input class="button" type=button onClick="location.href='/add-order'" value='Add Order'>
</div>

</body>
</html>
