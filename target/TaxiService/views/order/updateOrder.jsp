<%--
  Created by IntelliJ IDEA.
  User: Марія
  Date: 15.02.2021
  Time: 11:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.mariia.syne.taxi_service.model.Order" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Order</title>
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
    <h1>Updating Order</h1>
</div>

<div>
    <%
        Order orderToUpdate = (Order) request.getAttribute("orderToUpdate");
    %>
    <div>
        <form method="post">
            <table>
                <tr>
                    <td>Address From:</td>
                    <td>
                        <%
                            out.println("<input type=\"text\" name=\"addressFrom\" value=\"" + orderToUpdate.getAddressFrom()+ "\">");
                        %>
                    </td>
                    <td>
                        <%
                            out.println("<input type=\"text\" name=\"id\" value=\"" + orderToUpdate.getId() + "\" hidden>");
                        %>
                    </td>
                </tr>

                <tr>
                    <td>Address To:</td>
                    <td>
                        <%
                            out.println("<input type=\"text\" name=\"addressTo\" value=\"" + orderToUpdate.getAddressTo() + "\">");
                        %>
                    </td>
                </tr>

                <tr>
                    <td>Passengers Number:</td>
                    <td>
                        <%
                            out.println("<input type=\"text\" name=\"passengersNumber\" value=\"" + orderToUpdate.getPassengersNumber() + "\">");
                        %>
                    </td>
                </tr>

                <tr>
                    <td>Passengers Id:</td>
                    <td>
                        <%
                            out.println("<input type=\"text\" name=\"passengersId\" value=\"" + orderToUpdate.getPassengersId() + "\">");
                        %>
                    </td>
                </tr>

                <tr>
                    <td>Auto Id:</td>
                    <td>
                        <%
                            out.println("<input type=\"text\" name=\"autoId\" value=\"" + orderToUpdate.getAutoId() + "\">");
                        %>
                    </td>
                </tr>

                <tr>
                    <td>Price:</td>
                    <td>
                        <%
                            out.println("<input type=\"text\" name=\"price\" value=\"" + orderToUpdate.getPrice() + "\">");
                        %>
                    </td>
                </tr>

                <tr>
                    <td>Discount:</td>
                    <td>
                        <%
                            out.println("<input type=\"text\" name=\"discount\" value=\"" + orderToUpdate.getDiscount() + "\">");
                        %>
                    </td>
                </tr>

                <tr>
                    <td>Time to wait:</td>
                    <td>
                        <%
                            out.println("<input type=\"text\" name=\"timeToWait\" value=\"" + orderToUpdate.getTimeToWait() + "\">");
                        %>
                    </td>
                </tr>

                <tr>
                    <td>Date:</td>
                    <td>
                        <%
                            out.println("<input type=\"text\" name=\"date\" value=\"" + orderToUpdate.getDate() + "\">");
                        %>
                    </td>
                </tr>

                <tr>
                    <td align="right" colspan="2"><input type="submit" value="Submit"></td>
                </tr>
            </table>
        </form>
    </div>
</div>

<input type=button onClick="location.href='/orders'" value='All Orders Table'>

</body>
</html>
