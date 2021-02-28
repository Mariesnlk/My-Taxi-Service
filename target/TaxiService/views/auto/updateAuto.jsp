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

    input[type=text], select {
        width: 100%;
        padding: 12px 20px;
        margin: 8px 0;
        display: inline-block;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
    }

    input[type=password], select {
        width: 100%;
        padding: 12px 20px;
        margin: 8px 0;
        display: inline-block;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
    }

    div {
        border-radius: 5px;
        background-color: #f2f2f2;
        padding: 20px;
        margin-bottom: 10px;
    }

    input[type=submit], .button {
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

    form {
        text-align: left;
    }

    #container-button {
        text-align: center;
        margin-top: 10px;
    }

</style>

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
                </tr>
                <tr>
                    <td>Id:</td>
                    <td>
                        <%
                            out.println("<input type=\"text\" name=\"id\" value=\"" + autoToUpdate.getId() + "\" hidden>");
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

<div id="container-button">
    <input class="button" type=button onClick="location.href='/autos'" value='All Autos Table'>
</div>
</body>
</html>

