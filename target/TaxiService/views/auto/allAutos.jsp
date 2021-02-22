<%@ page import="com.mariia.syne.taxi_service.model.Auto" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: Марія
  Date: 13.02.2021
  Time: 21:38
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>All Autos</title>
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
    <h1>All Autos Table</h1>
</div>
<br>
<div>
    <input class="button" type=button onClick="location.href='../..'" value='Back to main page'>

    <input class="button" type=button onClick="location.href='/add-auto'" value='Add Auto'>
</div>
<br>
<div>
    <input class="button" type=button onClick="location.href='/sort-capacity-increase'" value='Sorting by passenger capacity increase'>

    <input class="button" type=button onClick="location.href='/sort-capacity-decrease'" value='Sorting by passenger capacity decrease'>
</div>
<br>
<div>
    <input class="button" type=button onClick="location.href='/sort-category-increase'" value='Sorting by category increase'>

    <input class="button" type=button onClick="location.href='/sort-category-decrease'" value='Sorting by category decrease'>
</div>
<br>
<div>
    <input class="button" type=button onClick="location.href='/sort-status-increase'" value='Sorting by status increase'>

    <input class="button" type=button onClick="location.href='/sort-status-decrease'" value='Sorting by status decrease'>
</div>
<br>
<br>

<div>
    <div>

        <%
            List<Auto> autos = (List<Auto>) request.getAttribute("allAutos");
            if (autos != null && !autos.isEmpty()) {
        %>

        <table cellspacing="2" border="1" cellpadding="5" width="600"  id="table">
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
    <input class="button" type=button onClick="location.href='/sort-status-increase'" value='Sorting by status increase'>

    <input class="button" type=button onClick="location.href='/sort-status-decrease'" value='Sorting by status decrease'>
</div>
<br>
<div>
    <input class="button" type=button onClick="location.href='/sort-category-increase'" value='Sorting by category increase'>

    <input class="button" type=button onClick="location.href='/sort-category-decrease'" value='Sorting by category decrease'>
</div>
<br>
<div>
    <input class="button" type=button onClick="location.href='/sort-capacity-increase'" value='Sorting by passenger capacity increase'>

    <input class="button" type=button onClick="location.href='/sort-capacity-decrease'" value='Sorting by passenger capacity decrease'>
</div>
<br>
<div>
    <input class="button" type=button onClick="location.href='../..'" value='Back to main page'>

    <input class="button" type=button onClick="location.href='/add-auto'" value='Add Auto'>
</div>

</body>
</html>

