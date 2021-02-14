<%--
  Created by IntelliJ IDEA.
  User: Марія
  Date: 14.02.2021
  Time: 19:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.mariia.syne.taxi_service.model.Auto" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Auto</title>
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
    <h1>Updating Auto</h1>
</div>

<div>
    <%
        Auto autoToUpdate = (Auto) request.getAttribute("autoToUpdate");
    %>
    <div>

        <form method="post">
            <table>
                <tr>
                    <td>Passengers Capacity:</td>
                    <td>
                        <%
                            out.println("<input type=\"text\" name=\"passengersCapacity\" value=\"" + autoToUpdate.getPassengersCapacity() + "\">");
                        %>
                    </td>
                    <td>
                        <%
                            out.println("<input type=\"text\" name=\"id\" value=\"" + autoToUpdate.getId()+ "\" hidden>");
                        %>
                    </td>
                </tr>
                <tr>
                    <td>Category:</td>
                    <td>
                        <%
                            out.println("<input type=\"text\" name=\"category\" value=\"" + autoToUpdate.getCategory() + "\">");
                        %>
                    </td>
                </tr>
                <tr>
                    <td>Status:</td>
                    <td>
                        <%
                            out.println("<input type=\"text\" name=\"status\" value=\"" + autoToUpdate.getStatus() + "\">");
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

<input type=button onClick="location.href='/autos'" value='All Autos Table'>

</body>
</html>

