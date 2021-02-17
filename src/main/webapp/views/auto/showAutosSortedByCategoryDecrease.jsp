<%--
  Created by IntelliJ IDEA.
  User: Марія
  Date: 17.02.2021
  Time: 22:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.mariia.syne.taxi_service.model.Auto" %>
<%@ page import="java.util.List" %>
<html>
<head>
    <title>Sorted Autos</title>
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
    <h1>Sorted Autos By Category Decrease</h1>
</div>
<br>
<div>
    <input type=button onClick="location.href='../..'" value='Back to main page'>

    <input type=button onClick="location.href='/add-auto'" value='Add Auto'>
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
<div>
    <input type=button onClick="location.href='/sort-status-increase'" value='Sorting by status increase'>

    <input type=button onClick="location.href='/sort-status-decrease'" value='Sorting by status decrease'>
</div>
<br>
<br>

<div>
    <div>

        <%
            List<Auto> autos = (List<Auto>) request.getAttribute("allSortedByCategoryDecreaseAutos");
            if (autos != null && !autos.isEmpty()) {
        %>

        <table cellspacing="2" border="1" cellpadding="5" width="600">
            <thead>
            <tr>
                <th>Id</th>
                <th>Passengers Capacity</th>
                <th>Category</th>
                <th>Status</th>
                <th>Update</th>
                <th>Delete</th>
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

                    out.println("<td><a href=\"/update-auto?id=" + auto.getId()
                            + "\">Update</a></td>");
                    out.println("<td><a href=\"/delete-auto?id=" + auto.getId()
                            + "\">Delete</a></td>");
                    out.println("</tr>");
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
    <input type=button onClick="location.href='/sort-status-increase'" value='Sorting by status increase'>

    <input type=button onClick="location.href='/sort-status-decrease'" value='Sorting by status decrease'>
</div>
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

    <input type=button onClick="location.href='/add-auto'" value='Add User'>
</div>

</body>
</html>

