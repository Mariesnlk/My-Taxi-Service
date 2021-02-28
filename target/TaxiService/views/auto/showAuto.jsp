<%--
  Created by IntelliJ IDEA.
  User: Марія
  Date: 14.02.2021
  Time: 19:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.mariia.syne.taxi_service.model.Auto" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Show Auto</title>
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

    #table td {
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
    <h1>Showing Auto</h1>
</div>
<br>
<div>
    <%
        Auto auto = (Auto) request.getAttribute("auto");
    %>
    <div>

        <table cellspacing="2" border="1" cellpadding="5" width="300" id="table">
            <tr>
                <td>Id:</td>
                <td>
                    <%
                        out.println(auto.getId());
                    %>
                </td>
            </tr>
            <tr>
                <td>Passengers Capacity:</td>
                <td>
                    <%
                        out.println(auto.getPassengersCapacity());
                    %>
                </td>
            </tr>
            <tr>
                <td>Category:</td>
                <td>
                    <%
                        out.println(auto.getCategory());
                    %>
                </td>
            </tr>
            <tr>
                <td>Status:</td>
                <td>
                    <%
                        out.println(auto.getStatus());
                    %>
                </td>
            </tr>
        </table>
    </div>
</div>
<br>

<div>
    <input class="button" type=button onClick="location.href='/autos'" value='All Autos Table'>
</div>
</body>
</html>
