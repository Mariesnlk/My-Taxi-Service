<%@ page import="com.mariia.syne.taxi_service.model.Auto" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Марія
  Date: 18.02.2021
  Time: 20:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Choose Auto</title>
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
    <h1>Active Autos</h1>
</div>
<br>
<div>
    <input type=button onClick="location.href='../..'" value='Back to main page'>
</div>
<br>
<div>
    <input type=button onClick="location.href='/sort-capacity-increase'" value='Sorting by passenger capacity increase'>

    <input type=button onClick="location.href='/sort-capacity-decrease'" value='Sorting by passenger capacity decrease'>
</div>
<br>
<div>
    <input type=button onClick="location.href='/sort-category-increase'" value='Sorting by category increase'>

    <input type=button onClick="location.href='/sort-category-decrease'" value='Sorting by category decrease'>
</div>
<br>
<br>

<div>
    <div>

        <%
            List<Auto> autos = (List<Auto>) request.getAttribute("autos");
            if (autos != null && !autos.isEmpty()) {
        %>

        <table cellspacing="2" border="1" cellpadding="5" width="600">
            <thead>
            <tr>
                <th>Id</th>
                <th>Passengers Capacity</th>
                <th>Category</th>
                <th>Status</th>
                <th>Add Car</th>
            </tr>
            </thead>
            <tbody>

            <%
                for (Auto auto : autos) {
                    out.println("<tr>");
                    out.println("<td><a href=\"/auto?id=" + auto.getId() + "\">"
                            + auto.getId() + "</a></td>");
                    out.println("<td>" + auto.getPassengersCapacity() + "</td>");
                    out.println("<td>" + auto.getCategory() + "</td>");
                    out.println("<td>" + auto.getStatus() + "</td>");

                    out.println("<td><a href=\"/add-car-to-order?id=" + auto.getId()
                            + "\">Update</a></td>");
                }
            %>

            </tbody>
        </table>

        <%
            } else {
                out.println("<p>There are no autos yet!</p>");
            }
        %>

    </div>
</div>

<br>
<br>
<div>
    <input type=button onClick="location.href='/sort-category-increase'" value='Sorting by category increase'>

    <input type=button onClick="location.href='/sort-category-decrease'" value='Sorting by category decrease'>
</div>
<br>
<div>
    <input type=button onClick="location.href='/sort-capacity-increase'" value='Sorting by passenger capacity increase'>

    <input type=button onClick="location.href='/sort-capacity-decrease'" value='Sorting by passenger capacity decrease'>
</div>
<br>
<div>
    <input type=button onClick="location.href='../..'" value='Back to main page'>
</div>
</body>
</html>