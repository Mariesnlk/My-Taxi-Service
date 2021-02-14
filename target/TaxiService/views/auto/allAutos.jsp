<%@ page import="com.mariia.syne.taxi_service.model.Auto" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Марія
  Date: 13.02.2021
  Time: 21:38
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>All Autos</title>
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
    <h1>All Autos Table</h1>
</div>
<br>
<div>
    <input type=button onClick="location.href='../..'" value='Back to main page'>

    <input type=button onClick="location.href='/add-auto'" value='Add Auto'>
</div>
<br>
<br>
<div>
    <div>

        <%
            List<Auto> autos = (List<Auto>) request.getAttribute("allAutos");
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
                    out.println("<td><a href=\"/auto?id=" + auto.getAutoId() + "\">"
                            + auto.getAutoId() + "</a></td>");
                    out.println("<td>" + auto.getPassengersCapacity() + "</td>");
                    out.println("<td>" + auto.getCategory() + "</td>");
                    out.println("<td>" + auto.getStatus() + "</td>");

                    out.println("<td><a href=\"/update-auto?id=" + auto.getAutoId()
                            + "\">Update</a></td>");
                    out.println("<td><a href=\"/delete-auto?id=" + auto.getAutoId()
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

<div>
    <input type=button onClick="location.href='../..'" value='Back to main page'>

    <input type=button onClick="location.href='/add-auto'" value='Add User'>
</div>

</body>
</html>

