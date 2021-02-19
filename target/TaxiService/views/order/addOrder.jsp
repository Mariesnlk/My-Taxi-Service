<%@ page import="com.mariia.syne.taxi_service.model.User" %>
<%@ page import="com.mariia.syne.taxi_service.model.Auto" %><%--
  Created by IntelliJ IDEA.
  User: Марія
  Date: 13.02.2021
  Time: 23:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Order</title>
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

    div {
        border-radius: 5px;
        background-color: #f2f2f2;
        padding: 20px;
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

    form {
        text-align: left;
    }

    .container-button {
        margin-top: 10px;
    }

</style>
<div>
    <%--<%
        if (request.getAttribute("lastName") != null) {
            out.println("<p>User '" + request.getAttribute("lastName") + "' added!</p>");
        }
    %>--%>

    <%
        User registeredUser = (User) session.getAttribute("registeredUser");
        Integer idUser = registeredUser.getId();

        Auto chosenAuto = (Auto) request.getAttribute("chosenAuto");
        String idAutoString = "no auto";
        Integer idAuto = -1;
        if (chosenAuto != null) {
            idAuto = chosenAuto.getId();
            idAutoString = String.valueOf(idAuto);
        }
            /*
            session.setAttribute("autoId",idAuto);*/
    %>
    <h1>Add order</h1>

    <div>
        <form action="/add-order" method="post">

            <%--            <%out.println(registeredUser);%><br/>--%>
            <%--            <%out.println(chosenAuto);%><br/>--%>
            <%--            <%out.println(idAutoString);%><br/>--%>

            <%--<%
                Integer passengerId = Integer.valueOf(request.getParameter("passengerId"));
                Integer autoId = Integer.valueOf(request.getParameter("autoId"));

                out.println("<input type=\"text\" name=\"passengerId\" value=\"" + passengerId + "\" hidden>");
                out.println("<input type=\"text\" name=\"autoId\" value=\"" + autoId + "\" hidden>");
            %>--%>

            <h3>passenger Id: </h3><%out.println(idUser);%><br/>
            <h3>auto Id: </h3><%out.println(idAutoString);%>
            <input class="button" type=button onClick="location.href='/choose-auto'" value='Chose Auto'><br/>

            <label>Address From: </label>
            <select name="addressFrom">
                <option value="Kyiv">Kyiv</option>
                <option value="Kharkiv">Kharkiv</option>
                <option value="Odesa">Odesa</option>
                <option value="Dnipro">Dnipro</option>
                <option value="Zaporizhzhia">Zaporizhzhia</option>
                <option value="Lviv">Lviv</option>
                <option value="Kryvyi Rih">Kryvyi Rih</option>
                <option value="Mykolaiv">Mykolaiv</option>
                <option value="Vinnytsia">Vinnytsia</option>
                <option value="Poltava">Poltava</option>
                <option value="Ivano-Frankivsk">Ivano-Frankivsk</option>
                <option value="Chernihiv">Chernihiv</option>
                <option value="Cherkasy">Cherkasy</option>
            </select>

            <label>Address To: </label>
            <select name="addressTo">
                <option value="Kyiv">Kyiv</option>
                <option value="Kharkiv">Kharkiv</option>
                <option value="Odesa">Odesa</option>
                <option value="Dnipro">Dnipro</option>
                <option value="Zaporizhzhia">Zaporizhzhia</option>
                <option value="Lviv">Lviv</option>
                <option value="Kryvyi Rih">Kryvyi Rih</option>
                <option value="Mykolaiv">Mykolaiv</option>
                <option value="Vinnytsia">Vinnytsia</option>
                <option value="Poltava">Poltava</option>
                <option value="Ivano-Frankivsk">Ivano-Frankivsk</option>
                <option value="Chernihiv">Chernihiv</option>
                <option value="Cherkasy">Cherkasy</option>
            </select>

            <label>Passengers Number: </label><input type="text" name="passengersNumber"
                                                     placeholder="Choose passengers number.."><br/>
            <%--<label>passenger Id: </label><input type="text" name="passengersId"><br/>--%>
            <label>Discount: </label><input type="text" name="discount" placeholder="Enter discount.."><br/>
            <label>Price: </label><input type="text" name="price"><br/>
            <label>Time To Wait: </label><input type="text" name="timeToWait"><br/>
            <label>Data (dd-MM-yyyy): </label><input type="text" name="date"><br/>
            <button class="button" type="submit">Submit</button>

<%--            <%--%>
<%--                out.println("<input type=\"text\" name=\"passengerId\" value=\"" + idUser + "\" hidden>");--%>
<%--            %>--%>

<%--            <%--%>
<%--                out.println("<input type=\"text\" name=\"autoId\" value=\"" + idAuto + "\" hidden>");--%>
<%--            %>--%>


            <%--<%request.setAttribute("passengerId",idUser);%><br/>
            <%request.setAttribute("autoId",idAuto);%><br/>--%>
        </form>
    </div>

</div>

<div class="container-button">
    <input class="button" type=button onClick="location.href='../..'" value='Back to main page'>
</div>

</body>
</html>
